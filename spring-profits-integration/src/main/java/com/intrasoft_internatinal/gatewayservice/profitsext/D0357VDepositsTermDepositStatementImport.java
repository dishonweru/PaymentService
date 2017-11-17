
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for D0357VDepositsTermDepositStatementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0357VDepositsTermDepositStatementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCapitalAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCapitalAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsInCapitalAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsInCapitalAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCapitalAccDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCapitalAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCapitalAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedDescInterPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedDescStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedSelectionCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMoreRecIndexIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountGenericAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountWfeDetail" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProfitsAccountWfeHeader" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProfitsAccountWfsDetail" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProfitsAccountWfsHeader" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsedInputCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0357VDepositsTermDepositStatementImport", propOrder = {
    "command",
    "inCapitalAccCurrencyIdCurrency",
    "inCapitalAccCurrencyShortDescr",
    "profitsInCapitalAccountNumber",
    "profitsInCapitalAccountCd",
    "inCapitalAccDepositAccountEntryStatus",
    "inCapitalAccProductIdProduct",
    "inCapitalAccUnitCode",
    "profitsAccountNumber",
    "profitsAccountCd",
    "inDepositAccountDesignation",
    "inIefSuppliedDescInterPayment",
    "inIefSuppliedDescStatus",
    "inIefSuppliedSelectionCriteria",
    "inMoreRecIndexIefSuppliedCount",
    "inPrftTransactionDescription",
    "inPrftTransactionIdTransact",
    "inProfitsAccountGenericAccountNo",
    "inProfitsAccountWfeDetail",
    "inProfitsAccountWfeHeader",
    "inProfitsAccountWfsDetail",
    "inProfitsAccountWfsHeader",
    "inTerminalTerminalNumber",
    "inUsedInputCharSuppliedChar37"
})
public class D0357VDepositsTermDepositStatementImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCapitalAccCurrencyIdCurrency")
    protected int inCapitalAccCurrencyIdCurrency;
    @XmlElement(name = "InCapitalAccCurrencyShortDescr")
    protected String inCapitalAccCurrencyShortDescr;
    @XmlElement(name = "ProfitsInCapitalAccountNumber")
    protected String profitsInCapitalAccountNumber;
    @XmlElement(name = "ProfitsInCapitalAccountCd")
    protected short profitsInCapitalAccountCd;
    @XmlElement(name = "InCapitalAccDepositAccountEntryStatus")
    protected String inCapitalAccDepositAccountEntryStatus;
    @XmlElement(name = "InCapitalAccProductIdProduct")
    protected int inCapitalAccProductIdProduct;
    @XmlElement(name = "InCapitalAccUnitCode")
    protected int inCapitalAccUnitCode;
    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InDepositAccountDesignation")
    protected String inDepositAccountDesignation;
    @XmlElement(name = "InIefSuppliedDescInterPayment")
    protected String inIefSuppliedDescInterPayment;
    @XmlElement(name = "InIefSuppliedDescStatus")
    protected String inIefSuppliedDescStatus;
    @XmlElement(name = "InIefSuppliedSelectionCriteria")
    protected String inIefSuppliedSelectionCriteria;
    @XmlElement(name = "InMoreRecIndexIefSuppliedCount")
    protected int inMoreRecIndexIefSuppliedCount;
    @XmlElement(name = "InPrftTransactionDescription")
    protected String inPrftTransactionDescription;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProfitsAccountGenericAccountNo")
    protected String inProfitsAccountGenericAccountNo;
    @XmlElement(name = "InProfitsAccountWfeDetail")
    protected double inProfitsAccountWfeDetail;
    @XmlElement(name = "InProfitsAccountWfeHeader")
    protected double inProfitsAccountWfeHeader;
    @XmlElement(name = "InProfitsAccountWfsDetail")
    protected double inProfitsAccountWfsDetail;
    @XmlElement(name = "InProfitsAccountWfsHeader")
    protected double inProfitsAccountWfsHeader;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;
    @XmlElement(name = "InUsedInputCharSuppliedChar37")
    protected String inUsedInputCharSuppliedChar37;

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
     * Gets the value of the inCapitalAccCurrencyIdCurrency property.
     * 
     */
    public int getInCapitalAccCurrencyIdCurrency() {
        return inCapitalAccCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCapitalAccCurrencyIdCurrency property.
     * 
     */
    public void setInCapitalAccCurrencyIdCurrency(int value) {
        this.inCapitalAccCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCapitalAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCapitalAccCurrencyShortDescr() {
        return inCapitalAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCapitalAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCapitalAccCurrencyShortDescr(String value) {
        this.inCapitalAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the profitsInCapitalAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsInCapitalAccountNumber() {
        return profitsInCapitalAccountNumber;
    }

    /**
     * Sets the value of the profitsInCapitalAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsInCapitalAccountNumber(String value) {
        this.profitsInCapitalAccountNumber = value;
    }

    /**
     * Gets the value of the profitsInCapitalAccountCd property.
     * 
     */
    public short getProfitsInCapitalAccountCd() {
        return profitsInCapitalAccountCd;
    }

    /**
     * Sets the value of the profitsInCapitalAccountCd property.
     * 
     */
    public void setProfitsInCapitalAccountCd(short value) {
        this.profitsInCapitalAccountCd = value;
    }

    /**
     * Gets the value of the inCapitalAccDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCapitalAccDepositAccountEntryStatus() {
        return inCapitalAccDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the inCapitalAccDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCapitalAccDepositAccountEntryStatus(String value) {
        this.inCapitalAccDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the inCapitalAccProductIdProduct property.
     * 
     */
    public int getInCapitalAccProductIdProduct() {
        return inCapitalAccProductIdProduct;
    }

    /**
     * Sets the value of the inCapitalAccProductIdProduct property.
     * 
     */
    public void setInCapitalAccProductIdProduct(int value) {
        this.inCapitalAccProductIdProduct = value;
    }

    /**
     * Gets the value of the inCapitalAccUnitCode property.
     * 
     */
    public int getInCapitalAccUnitCode() {
        return inCapitalAccUnitCode;
    }

    /**
     * Sets the value of the inCapitalAccUnitCode property.
     * 
     */
    public void setInCapitalAccUnitCode(int value) {
        this.inCapitalAccUnitCode = value;
    }

    /**
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountDesignation() {
        return inDepositAccountDesignation;
    }

    /**
     * Sets the value of the inDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountDesignation(String value) {
        this.inDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the inIefSuppliedDescInterPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedDescInterPayment() {
        return inIefSuppliedDescInterPayment;
    }

    /**
     * Sets the value of the inIefSuppliedDescInterPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedDescInterPayment(String value) {
        this.inIefSuppliedDescInterPayment = value;
    }

    /**
     * Gets the value of the inIefSuppliedDescStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedDescStatus() {
        return inIefSuppliedDescStatus;
    }

    /**
     * Sets the value of the inIefSuppliedDescStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedDescStatus(String value) {
        this.inIefSuppliedDescStatus = value;
    }

    /**
     * Gets the value of the inIefSuppliedSelectionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedSelectionCriteria() {
        return inIefSuppliedSelectionCriteria;
    }

    /**
     * Sets the value of the inIefSuppliedSelectionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedSelectionCriteria(String value) {
        this.inIefSuppliedSelectionCriteria = value;
    }

    /**
     * Gets the value of the inMoreRecIndexIefSuppliedCount property.
     * 
     */
    public int getInMoreRecIndexIefSuppliedCount() {
        return inMoreRecIndexIefSuppliedCount;
    }

    /**
     * Sets the value of the inMoreRecIndexIefSuppliedCount property.
     * 
     */
    public void setInMoreRecIndexIefSuppliedCount(int value) {
        this.inMoreRecIndexIefSuppliedCount = value;
    }

    /**
     * Gets the value of the inPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrftTransactionDescription() {
        return inPrftTransactionDescription;
    }

    /**
     * Sets the value of the inPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrftTransactionDescription(String value) {
        this.inPrftTransactionDescription = value;
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
     * Gets the value of the inProfitsAccountGenericAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountGenericAccountNo() {
        return inProfitsAccountGenericAccountNo;
    }

    /**
     * Sets the value of the inProfitsAccountGenericAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountGenericAccountNo(String value) {
        this.inProfitsAccountGenericAccountNo = value;
    }

    /**
     * Gets the value of the inProfitsAccountWfeDetail property.
     * 
     */
    public double getInProfitsAccountWfeDetail() {
        return inProfitsAccountWfeDetail;
    }

    /**
     * Sets the value of the inProfitsAccountWfeDetail property.
     * 
     */
    public void setInProfitsAccountWfeDetail(double value) {
        this.inProfitsAccountWfeDetail = value;
    }

    /**
     * Gets the value of the inProfitsAccountWfeHeader property.
     * 
     */
    public double getInProfitsAccountWfeHeader() {
        return inProfitsAccountWfeHeader;
    }

    /**
     * Sets the value of the inProfitsAccountWfeHeader property.
     * 
     */
    public void setInProfitsAccountWfeHeader(double value) {
        this.inProfitsAccountWfeHeader = value;
    }

    /**
     * Gets the value of the inProfitsAccountWfsDetail property.
     * 
     */
    public double getInProfitsAccountWfsDetail() {
        return inProfitsAccountWfsDetail;
    }

    /**
     * Sets the value of the inProfitsAccountWfsDetail property.
     * 
     */
    public void setInProfitsAccountWfsDetail(double value) {
        this.inProfitsAccountWfsDetail = value;
    }

    /**
     * Gets the value of the inProfitsAccountWfsHeader property.
     * 
     */
    public double getInProfitsAccountWfsHeader() {
        return inProfitsAccountWfsHeader;
    }

    /**
     * Sets the value of the inProfitsAccountWfsHeader property.
     * 
     */
    public void setInProfitsAccountWfsHeader(double value) {
        this.inProfitsAccountWfsHeader = value;
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
     * Gets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsedInputCharSuppliedChar37() {
        return inUsedInputCharSuppliedChar37;
    }

    /**
     * Sets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsedInputCharSuppliedChar37(String value) {
        this.inUsedInputCharSuppliedChar37 = value;
    }

}
