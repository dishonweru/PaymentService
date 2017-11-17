
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2029VCollateralPfgListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2029VCollateralPfgListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDefaultJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRecordTypeCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedRealEstateRealEstateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2029VCollateralPfgListImport", propOrder = {
    "command",
    "inContinueCollateralTableInternalSn",
    "inDefaultJustificIdJustific",
    "inDefaultProductIdProduct",
    "inIefSuppliedCommand",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inRecordTypeCollateralTableRecordType",
    "inSelectedCustomerCDigit",
    "inSelectedCustomerCustId",
    "inSelectedRealEstateId",
    "inSelectedRealEstateRealEstateDesc"
})
public class MC2029VCollateralPfgListImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InContinueCollateralTableInternalSn")
    protected double inContinueCollateralTableInternalSn;
    @XmlElement(name = "InDefaultJustificIdJustific")
    protected int inDefaultJustificIdJustific;
    @XmlElement(name = "InDefaultProductIdProduct")
    protected int inDefaultProductIdProduct;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InRecordTypeCollateralTableRecordType")
    protected String inRecordTypeCollateralTableRecordType;
    @XmlElement(name = "InSelectedCustomerCDigit")
    protected short inSelectedCustomerCDigit;
    @XmlElement(name = "InSelectedCustomerCustId")
    protected int inSelectedCustomerCustId;
    @XmlElement(name = "InSelectedRealEstateId")
    protected double inSelectedRealEstateId;
    @XmlElement(name = "InSelectedRealEstateRealEstateDesc")
    protected String inSelectedRealEstateRealEstateDesc;

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
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingReversalFlag() {
        return inLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingReversalFlag(String value) {
        this.inLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingTerminalNumber() {
        return inLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingTerminalNumber(String value) {
        this.inLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public int getInLogMntRecordingTrxCode() {
        return inLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public void setInLogMntRecordingTrxCode(int value) {
        this.inLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inRecordTypeCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecordTypeCollateralTableRecordType() {
        return inRecordTypeCollateralTableRecordType;
    }

    /**
     * Sets the value of the inRecordTypeCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecordTypeCollateralTableRecordType(String value) {
        this.inRecordTypeCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public short getInSelectedCustomerCDigit() {
        return inSelectedCustomerCDigit;
    }

    /**
     * Sets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public void setInSelectedCustomerCDigit(short value) {
        this.inSelectedCustomerCDigit = value;
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
     * Gets the value of the inSelectedRealEstateId property.
     * 
     */
    public double getInSelectedRealEstateId() {
        return inSelectedRealEstateId;
    }

    /**
     * Sets the value of the inSelectedRealEstateId property.
     * 
     */
    public void setInSelectedRealEstateId(double value) {
        this.inSelectedRealEstateId = value;
    }

    /**
     * Gets the value of the inSelectedRealEstateRealEstateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedRealEstateRealEstateDesc() {
        return inSelectedRealEstateRealEstateDesc;
    }

    /**
     * Sets the value of the inSelectedRealEstateRealEstateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedRealEstateRealEstateDesc(String value) {
        this.inSelectedRealEstateRealEstateDesc = value;
    }

}
