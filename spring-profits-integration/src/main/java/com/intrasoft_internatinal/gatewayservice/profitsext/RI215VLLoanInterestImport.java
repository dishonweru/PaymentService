
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RI215VL_LoanInterestImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RI215VL_LoanInterestImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RI215VL_LoanInterestImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inContinueLnsInterestIdInterest",
    "inSelectedCurrencyIdCurrency",
    "inSelectedCurrencyShortDescr",
    "inSelectedProductIdProduct",
    "inTrxTerminalTerminalNumber"
})
public class RI215VLLoanInterestImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinueLnsInterestIdInterest")
    protected int inContinueLnsInterestIdInterest;
    @XmlElement(name = "InSelectedCurrencyIdCurrency")
    protected int inSelectedCurrencyIdCurrency;
    @XmlElement(name = "InSelectedCurrencyShortDescr")
    protected String inSelectedCurrencyShortDescr;
    @XmlElement(name = "InSelectedProductIdProduct")
    protected int inSelectedProductIdProduct;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;

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
     * Gets the value of the inContinueLnsInterestIdInterest property.
     * 
     */
    public int getInContinueLnsInterestIdInterest() {
        return inContinueLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inContinueLnsInterestIdInterest property.
     * 
     */
    public void setInContinueLnsInterestIdInterest(int value) {
        this.inContinueLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inSelectedCurrencyIdCurrency property.
     * 
     */
    public int getInSelectedCurrencyIdCurrency() {
        return inSelectedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inSelectedCurrencyIdCurrency property.
     * 
     */
    public void setInSelectedCurrencyIdCurrency(int value) {
        this.inSelectedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inSelectedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedCurrencyShortDescr() {
        return inSelectedCurrencyShortDescr;
    }

    /**
     * Sets the value of the inSelectedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedCurrencyShortDescr(String value) {
        this.inSelectedCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inSelectedProductIdProduct property.
     * 
     */
    public int getInSelectedProductIdProduct() {
        return inSelectedProductIdProduct;
    }

    /**
     * Sets the value of the inSelectedProductIdProduct property.
     * 
     */
    public void setInSelectedProductIdProduct(int value) {
        this.inSelectedProductIdProduct = value;
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

}
