
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2028VShipMortgageListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2028VShipMortgageListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAmount1FromCollateralTableAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAmount1ToCollateralTableAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCodeFromCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCodeToCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDefaultJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedTypeCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSmoddGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSmoddGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSmoddGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSmoddGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSmoddGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSmoddGenericDetailTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSmorrGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSmorrGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSmorrGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSmorrGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSmorrGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSmorrGenericDetailTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "MC2028VShipMortgageListImport", propOrder = {
    "command",
    "inAmount1FromCollateralTableAmount1",
    "inAmount1ToCollateralTableAmount1",
    "inCodeFromCollateralTableInternalSn",
    "inCodeToCollateralTableInternalSn",
    "inCommandIefSuppliedCommand",
    "inContinueCollateralTableInternalSn",
    "inDefaultJustificIdJustific",
    "inDefaultProductIdProduct",
    "inSelectedTypeCollateralTableRecordType",
    "inSmoddGenericDetailDescription",
    "inSmoddGenericDetailEntryStatus",
    "inSmoddGenericDetailParameterType",
    "inSmoddGenericDetailSerialNum",
    "inSmoddGenericDetailShortDescription",
    "inSmoddGenericDetailTmstamp",
    "inSmorrGenericDetailDescription",
    "inSmorrGenericDetailEntryStatus",
    "inSmorrGenericDetailParameterType",
    "inSmorrGenericDetailSerialNum",
    "inSmorrGenericDetailShortDescription",
    "inSmorrGenericDetailTmstamp",
    "inTrxPrftTransactionIdTransact",
    "inTrxTerminalTerminalNumber"
})
public class MC2028VShipMortgageListImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAmount1FromCollateralTableAmount1", required = true)
    protected BigDecimal inAmount1FromCollateralTableAmount1;
    @XmlElement(name = "InAmount1ToCollateralTableAmount1", required = true)
    protected BigDecimal inAmount1ToCollateralTableAmount1;
    @XmlElement(name = "InCodeFromCollateralTableInternalSn")
    protected double inCodeFromCollateralTableInternalSn;
    @XmlElement(name = "InCodeToCollateralTableInternalSn")
    protected double inCodeToCollateralTableInternalSn;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinueCollateralTableInternalSn")
    protected double inContinueCollateralTableInternalSn;
    @XmlElement(name = "InDefaultJustificIdJustific")
    protected int inDefaultJustificIdJustific;
    @XmlElement(name = "InDefaultProductIdProduct")
    protected int inDefaultProductIdProduct;
    @XmlElement(name = "InSelectedTypeCollateralTableRecordType")
    protected String inSelectedTypeCollateralTableRecordType;
    @XmlElement(name = "InSmoddGenericDetailDescription")
    protected String inSmoddGenericDetailDescription;
    @XmlElement(name = "InSmoddGenericDetailEntryStatus")
    protected String inSmoddGenericDetailEntryStatus;
    @XmlElement(name = "InSmoddGenericDetailParameterType")
    protected String inSmoddGenericDetailParameterType;
    @XmlElement(name = "InSmoddGenericDetailSerialNum")
    protected int inSmoddGenericDetailSerialNum;
    @XmlElement(name = "InSmoddGenericDetailShortDescription")
    protected String inSmoddGenericDetailShortDescription;
    @XmlElement(name = "InSmoddGenericDetailTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSmoddGenericDetailTmstamp;
    @XmlElement(name = "InSmorrGenericDetailDescription")
    protected String inSmorrGenericDetailDescription;
    @XmlElement(name = "InSmorrGenericDetailEntryStatus")
    protected String inSmorrGenericDetailEntryStatus;
    @XmlElement(name = "InSmorrGenericDetailParameterType")
    protected String inSmorrGenericDetailParameterType;
    @XmlElement(name = "InSmorrGenericDetailSerialNum")
    protected int inSmorrGenericDetailSerialNum;
    @XmlElement(name = "InSmorrGenericDetailShortDescription")
    protected String inSmorrGenericDetailShortDescription;
    @XmlElement(name = "InSmorrGenericDetailTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSmorrGenericDetailTmstamp;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
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
     * Gets the value of the inAmount1FromCollateralTableAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAmount1FromCollateralTableAmount1() {
        return inAmount1FromCollateralTableAmount1;
    }

    /**
     * Sets the value of the inAmount1FromCollateralTableAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAmount1FromCollateralTableAmount1(BigDecimal value) {
        this.inAmount1FromCollateralTableAmount1 = value;
    }

    /**
     * Gets the value of the inAmount1ToCollateralTableAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAmount1ToCollateralTableAmount1() {
        return inAmount1ToCollateralTableAmount1;
    }

    /**
     * Sets the value of the inAmount1ToCollateralTableAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAmount1ToCollateralTableAmount1(BigDecimal value) {
        this.inAmount1ToCollateralTableAmount1 = value;
    }

    /**
     * Gets the value of the inCodeFromCollateralTableInternalSn property.
     * 
     */
    public double getInCodeFromCollateralTableInternalSn() {
        return inCodeFromCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inCodeFromCollateralTableInternalSn property.
     * 
     */
    public void setInCodeFromCollateralTableInternalSn(double value) {
        this.inCodeFromCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inCodeToCollateralTableInternalSn property.
     * 
     */
    public double getInCodeToCollateralTableInternalSn() {
        return inCodeToCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inCodeToCollateralTableInternalSn property.
     * 
     */
    public void setInCodeToCollateralTableInternalSn(double value) {
        this.inCodeToCollateralTableInternalSn = value;
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
     * Gets the value of the inContinueCollateralTableInternalSn property.
     * 
     */
    public double getInContinueCollateralTableInternalSn() {
        return inContinueCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inContinueCollateralTableInternalSn property.
     * 
     */
    public void setInContinueCollateralTableInternalSn(double value) {
        this.inContinueCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inDefaultJustificIdJustific property.
     * 
     */
    public int getInDefaultJustificIdJustific() {
        return inDefaultJustificIdJustific;
    }

    /**
     * Sets the value of the inDefaultJustificIdJustific property.
     * 
     */
    public void setInDefaultJustificIdJustific(int value) {
        this.inDefaultJustificIdJustific = value;
    }

    /**
     * Gets the value of the inDefaultProductIdProduct property.
     * 
     */
    public int getInDefaultProductIdProduct() {
        return inDefaultProductIdProduct;
    }

    /**
     * Sets the value of the inDefaultProductIdProduct property.
     * 
     */
    public void setInDefaultProductIdProduct(int value) {
        this.inDefaultProductIdProduct = value;
    }

    /**
     * Gets the value of the inSelectedTypeCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedTypeCollateralTableRecordType() {
        return inSelectedTypeCollateralTableRecordType;
    }

    /**
     * Sets the value of the inSelectedTypeCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedTypeCollateralTableRecordType(String value) {
        this.inSelectedTypeCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the inSmoddGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSmoddGenericDetailDescription() {
        return inSmoddGenericDetailDescription;
    }

    /**
     * Sets the value of the inSmoddGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSmoddGenericDetailDescription(String value) {
        this.inSmoddGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inSmoddGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSmoddGenericDetailEntryStatus() {
        return inSmoddGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inSmoddGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSmoddGenericDetailEntryStatus(String value) {
        this.inSmoddGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inSmoddGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSmoddGenericDetailParameterType() {
        return inSmoddGenericDetailParameterType;
    }

    /**
     * Sets the value of the inSmoddGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSmoddGenericDetailParameterType(String value) {
        this.inSmoddGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inSmoddGenericDetailSerialNum property.
     * 
     */
    public int getInSmoddGenericDetailSerialNum() {
        return inSmoddGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSmoddGenericDetailSerialNum property.
     * 
     */
    public void setInSmoddGenericDetailSerialNum(int value) {
        this.inSmoddGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSmoddGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSmoddGenericDetailShortDescription() {
        return inSmoddGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inSmoddGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSmoddGenericDetailShortDescription(String value) {
        this.inSmoddGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inSmoddGenericDetailTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSmoddGenericDetailTmstamp() {
        return inSmoddGenericDetailTmstamp;
    }

    /**
     * Sets the value of the inSmoddGenericDetailTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSmoddGenericDetailTmstamp(XMLGregorianCalendar value) {
        this.inSmoddGenericDetailTmstamp = value;
    }

    /**
     * Gets the value of the inSmorrGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSmorrGenericDetailDescription() {
        return inSmorrGenericDetailDescription;
    }

    /**
     * Sets the value of the inSmorrGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSmorrGenericDetailDescription(String value) {
        this.inSmorrGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inSmorrGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSmorrGenericDetailEntryStatus() {
        return inSmorrGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inSmorrGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSmorrGenericDetailEntryStatus(String value) {
        this.inSmorrGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inSmorrGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSmorrGenericDetailParameterType() {
        return inSmorrGenericDetailParameterType;
    }

    /**
     * Sets the value of the inSmorrGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSmorrGenericDetailParameterType(String value) {
        this.inSmorrGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inSmorrGenericDetailSerialNum property.
     * 
     */
    public int getInSmorrGenericDetailSerialNum() {
        return inSmorrGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSmorrGenericDetailSerialNum property.
     * 
     */
    public void setInSmorrGenericDetailSerialNum(int value) {
        this.inSmorrGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSmorrGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSmorrGenericDetailShortDescription() {
        return inSmorrGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inSmorrGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSmorrGenericDetailShortDescription(String value) {
        this.inSmorrGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inSmorrGenericDetailTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSmorrGenericDetailTmstamp() {
        return inSmorrGenericDetailTmstamp;
    }

    /**
     * Sets the value of the inSmorrGenericDetailTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSmorrGenericDetailTmstamp(XMLGregorianCalendar value) {
        this.inSmorrGenericDetailTmstamp = value;
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

}
