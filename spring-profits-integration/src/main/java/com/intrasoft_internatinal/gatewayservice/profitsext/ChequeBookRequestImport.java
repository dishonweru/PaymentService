
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChequeBookRequestImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChequeBookRequestImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChqDepBookOrderBookDispatchBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChqDepBookOrderBookLeftHanded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChqDepBookOrderBookPages" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InChqDepBookOrderBooksNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InChqDepBookOrderChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InChqDepBookOrderChequeFstNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InChqDepBookOrderOrderCreationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InChqDepBookOrderOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOrderDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InOrderDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChargeCharSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequeBookRequestImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "command",
    "inParametersInTerminalTerminalNumber",
    "inChqDepBookOrderBookDispatchBy",
    "inChqDepBookOrderBookLeftHanded",
    "inChqDepBookOrderBookPages",
    "inChqDepBookOrderBooksNumber",
    "inChqDepBookOrderChequeCd",
    "inChqDepBookOrderChequeFstNumber",
    "inChqDepBookOrderOrderCreationDt",
    "inChqDepBookOrderOrderType",
    "inOrderDepositAccountAccountNumber",
    "inOrderDepositAccountCDigit",
    "inTypeGenericDetailSerialNum",
    "inTypeGenericDetailDescription",
    "inTypeGenericDetailParameterType",
    "inChargeCharSuppliedChar1",
    "inAuthorGrantedIefSuppliedFlag"
})
public class ChequeBookRequestImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InChqDepBookOrderBookDispatchBy")
    protected String inChqDepBookOrderBookDispatchBy;
    @XmlElement(name = "InChqDepBookOrderBookLeftHanded")
    protected String inChqDepBookOrderBookLeftHanded;
    @XmlElement(name = "InChqDepBookOrderBookPages")
    protected short inChqDepBookOrderBookPages;
    @XmlElement(name = "InChqDepBookOrderBooksNumber")
    protected int inChqDepBookOrderBooksNumber;
    @XmlElement(name = "InChqDepBookOrderChequeCd")
    protected short inChqDepBookOrderChequeCd;
    @XmlElement(name = "InChqDepBookOrderChequeFstNumber")
    protected double inChqDepBookOrderChequeFstNumber;
    @XmlElement(name = "InChqDepBookOrderOrderCreationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inChqDepBookOrderOrderCreationDt;
    @XmlElement(name = "InChqDepBookOrderOrderType")
    protected String inChqDepBookOrderOrderType;
    @XmlElement(name = "InOrderDepositAccountAccountNumber")
    protected double inOrderDepositAccountAccountNumber;
    @XmlElement(name = "InOrderDepositAccountCDigit")
    protected short inOrderDepositAccountCDigit;
    @XmlElement(name = "InTypeGenericDetailSerialNum")
    protected int inTypeGenericDetailSerialNum;
    @XmlElement(name = "InTypeGenericDetailDescription")
    protected String inTypeGenericDetailDescription;
    @XmlElement(name = "InTypeGenericDetailParameterType")
    protected String inTypeGenericDetailParameterType;
    @XmlElement(name = "InChargeCharSuppliedChar1")
    protected String inChargeCharSuppliedChar1;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;

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
     * Gets the value of the inChqDepBookOrderBookDispatchBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChqDepBookOrderBookDispatchBy() {
        return inChqDepBookOrderBookDispatchBy;
    }

    /**
     * Sets the value of the inChqDepBookOrderBookDispatchBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChqDepBookOrderBookDispatchBy(String value) {
        this.inChqDepBookOrderBookDispatchBy = value;
    }

    /**
     * Gets the value of the inChqDepBookOrderBookLeftHanded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChqDepBookOrderBookLeftHanded() {
        return inChqDepBookOrderBookLeftHanded;
    }

    /**
     * Sets the value of the inChqDepBookOrderBookLeftHanded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChqDepBookOrderBookLeftHanded(String value) {
        this.inChqDepBookOrderBookLeftHanded = value;
    }

    /**
     * Gets the value of the inChqDepBookOrderBookPages property.
     * 
     */
    public short getInChqDepBookOrderBookPages() {
        return inChqDepBookOrderBookPages;
    }

    /**
     * Sets the value of the inChqDepBookOrderBookPages property.
     * 
     */
    public void setInChqDepBookOrderBookPages(short value) {
        this.inChqDepBookOrderBookPages = value;
    }

    /**
     * Gets the value of the inChqDepBookOrderBooksNumber property.
     * 
     */
    public int getInChqDepBookOrderBooksNumber() {
        return inChqDepBookOrderBooksNumber;
    }

    /**
     * Sets the value of the inChqDepBookOrderBooksNumber property.
     * 
     */
    public void setInChqDepBookOrderBooksNumber(int value) {
        this.inChqDepBookOrderBooksNumber = value;
    }

    /**
     * Gets the value of the inChqDepBookOrderChequeCd property.
     * 
     */
    public short getInChqDepBookOrderChequeCd() {
        return inChqDepBookOrderChequeCd;
    }

    /**
     * Sets the value of the inChqDepBookOrderChequeCd property.
     * 
     */
    public void setInChqDepBookOrderChequeCd(short value) {
        this.inChqDepBookOrderChequeCd = value;
    }

    /**
     * Gets the value of the inChqDepBookOrderChequeFstNumber property.
     * 
     */
    public double getInChqDepBookOrderChequeFstNumber() {
        return inChqDepBookOrderChequeFstNumber;
    }

    /**
     * Sets the value of the inChqDepBookOrderChequeFstNumber property.
     * 
     */
    public void setInChqDepBookOrderChequeFstNumber(double value) {
        this.inChqDepBookOrderChequeFstNumber = value;
    }

    /**
     * Gets the value of the inChqDepBookOrderOrderCreationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInChqDepBookOrderOrderCreationDt() {
        return inChqDepBookOrderOrderCreationDt;
    }

    /**
     * Sets the value of the inChqDepBookOrderOrderCreationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInChqDepBookOrderOrderCreationDt(XMLGregorianCalendar value) {
        this.inChqDepBookOrderOrderCreationDt = value;
    }

    /**
     * Gets the value of the inChqDepBookOrderOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChqDepBookOrderOrderType() {
        return inChqDepBookOrderOrderType;
    }

    /**
     * Sets the value of the inChqDepBookOrderOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChqDepBookOrderOrderType(String value) {
        this.inChqDepBookOrderOrderType = value;
    }

    /**
     * Gets the value of the inOrderDepositAccountAccountNumber property.
     * 
     */
    public double getInOrderDepositAccountAccountNumber() {
        return inOrderDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the inOrderDepositAccountAccountNumber property.
     * 
     */
    public void setInOrderDepositAccountAccountNumber(double value) {
        this.inOrderDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inOrderDepositAccountCDigit property.
     * 
     */
    public short getInOrderDepositAccountCDigit() {
        return inOrderDepositAccountCDigit;
    }

    /**
     * Sets the value of the inOrderDepositAccountCDigit property.
     * 
     */
    public void setInOrderDepositAccountCDigit(short value) {
        this.inOrderDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the inTypeGenericDetailSerialNum property.
     * 
     */
    public int getInTypeGenericDetailSerialNum() {
        return inTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inTypeGenericDetailSerialNum property.
     * 
     */
    public void setInTypeGenericDetailSerialNum(int value) {
        this.inTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTypeGenericDetailDescription() {
        return inTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the inTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTypeGenericDetailDescription(String value) {
        this.inTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTypeGenericDetailParameterType() {
        return inTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the inTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTypeGenericDetailParameterType(String value) {
        this.inTypeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inChargeCharSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChargeCharSuppliedChar1() {
        return inChargeCharSuppliedChar1;
    }

    /**
     * Sets the value of the inChargeCharSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChargeCharSuppliedChar1(String value) {
        this.inChargeCharSuppliedChar1 = value;
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

}
