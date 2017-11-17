
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DepositAccountRetrieveImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositAccountRetrieveImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCoben2CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCoben3CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountBlockedStsExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InKekGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSecretConfirmDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DepositAccountRetrieveImport", propOrder = {
    "command",
    "profitsAccountNumber",
    "profitsAccountCd",
    "inAccUnitCode",
    "inCoben2CustomerCustId",
    "inCoben3CustomerCustId",
    "inCurrencyIdCurrency",
    "inCustomerCustId",
    "inDepositAccountBlockedStsExpiry",
    "inDepositAccountDepositType",
    "inDepositAccountTimestmp",
    "inKekGenericDetailSerialNum",
    "inParametersInTerminalTerminalNumber",
    "inProductIdProduct",
    "inSecretConfirmDepositAccountSecretAccFlag",
    "inUsedInputCharSuppliedChar37"
})
public class DepositAccountRetrieveImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InAccUnitCode")
    protected int inAccUnitCode;
    @XmlElement(name = "InCoben2CustomerCustId")
    protected int inCoben2CustomerCustId;
    @XmlElement(name = "InCoben3CustomerCustId")
    protected int inCoben3CustomerCustId;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDepositAccountBlockedStsExpiry", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountBlockedStsExpiry;
    @XmlElement(name = "InDepositAccountDepositType")
    protected String inDepositAccountDepositType;
    @XmlElement(name = "InDepositAccountTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountTimestmp;
    @XmlElement(name = "InKekGenericDetailSerialNum")
    protected int inKekGenericDetailSerialNum;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InSecretConfirmDepositAccountSecretAccFlag")
    protected String inSecretConfirmDepositAccountSecretAccFlag;
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
     * Gets the value of the inAccUnitCode property.
     * 
     */
    public int getInAccUnitCode() {
        return inAccUnitCode;
    }

    /**
     * Sets the value of the inAccUnitCode property.
     * 
     */
    public void setInAccUnitCode(int value) {
        this.inAccUnitCode = value;
    }

    /**
     * Gets the value of the inCoben2CustomerCustId property.
     * 
     */
    public int getInCoben2CustomerCustId() {
        return inCoben2CustomerCustId;
    }

    /**
     * Sets the value of the inCoben2CustomerCustId property.
     * 
     */
    public void setInCoben2CustomerCustId(int value) {
        this.inCoben2CustomerCustId = value;
    }

    /**
     * Gets the value of the inCoben3CustomerCustId property.
     * 
     */
    public int getInCoben3CustomerCustId() {
        return inCoben3CustomerCustId;
    }

    /**
     * Sets the value of the inCoben3CustomerCustId property.
     * 
     */
    public void setInCoben3CustomerCustId(int value) {
        this.inCoben3CustomerCustId = value;
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
     * Gets the value of the inDepositAccountBlockedStsExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountBlockedStsExpiry() {
        return inDepositAccountBlockedStsExpiry;
    }

    /**
     * Sets the value of the inDepositAccountBlockedStsExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountBlockedStsExpiry(XMLGregorianCalendar value) {
        this.inDepositAccountBlockedStsExpiry = value;
    }

    /**
     * Gets the value of the inDepositAccountDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountDepositType() {
        return inDepositAccountDepositType;
    }

    /**
     * Sets the value of the inDepositAccountDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountDepositType(String value) {
        this.inDepositAccountDepositType = value;
    }

    /**
     * Gets the value of the inDepositAccountTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountTimestmp() {
        return inDepositAccountTimestmp;
    }

    /**
     * Sets the value of the inDepositAccountTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountTimestmp(XMLGregorianCalendar value) {
        this.inDepositAccountTimestmp = value;
    }

    /**
     * Gets the value of the inKekGenericDetailSerialNum property.
     * 
     */
    public int getInKekGenericDetailSerialNum() {
        return inKekGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inKekGenericDetailSerialNum property.
     * 
     */
    public void setInKekGenericDetailSerialNum(int value) {
        this.inKekGenericDetailSerialNum = value;
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
     * Gets the value of the inSecretConfirmDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSecretConfirmDepositAccountSecretAccFlag() {
        return inSecretConfirmDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the inSecretConfirmDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSecretConfirmDepositAccountSecretAccFlag(String value) {
        this.inSecretConfirmDepositAccountSecretAccFlag = value;
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
