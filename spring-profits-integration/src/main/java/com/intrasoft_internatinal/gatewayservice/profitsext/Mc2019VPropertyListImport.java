
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2019VPropertyListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2019VPropertyListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InContinueRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCriteriaRealEstateLandRegistId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRecordTypeCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedCollateralWorkRealEstateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedRecatGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedRecbkGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2019VPropertyListImport", propOrder = {
    "inContinueCollateralTableInternalSn",
    "inContinueRealEstateId",
    "inCriteriaRealEstateLandRegistId",
    "inDefaultJustificIdJustific",
    "inDefaultProductIdProduct",
    "inIefSuppliedCommand",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inRecordTypeCollateralTableRecordType",
    "inSelectedCollateralWorkRealEstateType",
    "inSelectedCustomerCDigit",
    "inSelectedCustomerCustId",
    "inSelectedRecatGenericDetailSerialNum",
    "inSelectedRecbkGenericDetailSerialNum"
})
public class Mc2019VPropertyListImport
    extends BaseImport
{

    @XmlElement(name = "InContinueCollateralTableInternalSn")
    protected double inContinueCollateralTableInternalSn;
    @XmlElement(name = "InContinueRealEstateId")
    protected double inContinueRealEstateId;
    @XmlElement(name = "InCriteriaRealEstateLandRegistId")
    protected String inCriteriaRealEstateLandRegistId;
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
    @XmlElement(name = "InSelectedCollateralWorkRealEstateType")
    protected String inSelectedCollateralWorkRealEstateType;
    @XmlElement(name = "InSelectedCustomerCDigit")
    protected short inSelectedCustomerCDigit;
    @XmlElement(name = "InSelectedCustomerCustId")
    protected int inSelectedCustomerCustId;
    @XmlElement(name = "InSelectedRecatGenericDetailSerialNum")
    protected int inSelectedRecatGenericDetailSerialNum;
    @XmlElement(name = "InSelectedRecbkGenericDetailSerialNum")
    protected int inSelectedRecbkGenericDetailSerialNum;

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
     * Gets the value of the inContinueRealEstateId property.
     * 
     */
    public double getInContinueRealEstateId() {
        return inContinueRealEstateId;
    }

    /**
     * Sets the value of the inContinueRealEstateId property.
     * 
     */
    public void setInContinueRealEstateId(double value) {
        this.inContinueRealEstateId = value;
    }

    /**
     * Gets the value of the inCriteriaRealEstateLandRegistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaRealEstateLandRegistId() {
        return inCriteriaRealEstateLandRegistId;
    }

    /**
     * Sets the value of the inCriteriaRealEstateLandRegistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaRealEstateLandRegistId(String value) {
        this.inCriteriaRealEstateLandRegistId = value;
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
     * Gets the value of the inSelectedCollateralWorkRealEstateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedCollateralWorkRealEstateType() {
        return inSelectedCollateralWorkRealEstateType;
    }

    /**
     * Sets the value of the inSelectedCollateralWorkRealEstateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedCollateralWorkRealEstateType(String value) {
        this.inSelectedCollateralWorkRealEstateType = value;
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
     * Gets the value of the inSelectedRecatGenericDetailSerialNum property.
     * 
     */
    public int getInSelectedRecatGenericDetailSerialNum() {
        return inSelectedRecatGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSelectedRecatGenericDetailSerialNum property.
     * 
     */
    public void setInSelectedRecatGenericDetailSerialNum(int value) {
        this.inSelectedRecatGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSelectedRecbkGenericDetailSerialNum property.
     * 
     */
    public int getInSelectedRecbkGenericDetailSerialNum() {
        return inSelectedRecbkGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSelectedRecbkGenericDetailSerialNum property.
     * 
     */
    public void setInSelectedRecbkGenericDetailSerialNum(int value) {
        this.inSelectedRecbkGenericDetailSerialNum = value;
    }

}
