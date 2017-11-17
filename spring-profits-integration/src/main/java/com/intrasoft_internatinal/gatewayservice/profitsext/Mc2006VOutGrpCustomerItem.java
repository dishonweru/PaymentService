
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2006VOutGrpCustomerItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VOutGrpCustomerItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustomerOutGrmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustomerOutGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustomerOutGrmCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerOutGrmCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerOutGrmCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerOutGrmEikyrGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerOutGrmEikyrGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerOutGrmEikyrGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustomerOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerOutGrmRealEstateCustContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerOutGrmRealEstateCustEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerOutGrmRealEstateCustInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpCustomerOutGrmRealEstateCustOwnershPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustomerOutGrmRealEstateCustRegistProprietor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VOutGrpCustomerItem", propOrder = {
    "outGrpCustomerOutGrmCustomerCDigit",
    "outGrpCustomerOutGrmCustomerCustId",
    "outGrpCustomerOutGrmCustomerFirstName",
    "outGrpCustomerOutGrmCustomerSurname",
    "outGrpCustomerOutGrmCustomerCustType",
    "outGrpCustomerOutGrmEikyrGenericDetailDescription",
    "outGrpCustomerOutGrmEikyrGenericDetailParameterType",
    "outGrpCustomerOutGrmEikyrGenericDetailSerialNum",
    "outGrpCustomerOutGrmIefSuppliedSelectChar",
    "outGrpCustomerOutGrmRealEstateCustContractId",
    "outGrpCustomerOutGrmRealEstateCustEntryStatus",
    "outGrpCustomerOutGrmRealEstateCustInternalSn",
    "outGrpCustomerOutGrmRealEstateCustOwnershPerc",
    "outGrpCustomerOutGrmRealEstateCustRegistProprietor"
})
public class Mc2006VOutGrpCustomerItem {

    @XmlElement(name = "OutGrpCustomerOutGrmCustomerCDigit")
    protected short outGrpCustomerOutGrmCustomerCDigit;
    @XmlElement(name = "OutGrpCustomerOutGrmCustomerCustId")
    protected int outGrpCustomerOutGrmCustomerCustId;
    @XmlElement(name = "OutGrpCustomerOutGrmCustomerFirstName")
    protected String outGrpCustomerOutGrmCustomerFirstName;
    @XmlElement(name = "OutGrpCustomerOutGrmCustomerSurname")
    protected String outGrpCustomerOutGrmCustomerSurname;
    @XmlElement(name = "OutGrpCustomerOutGrmCustomerCustType")
    protected String outGrpCustomerOutGrmCustomerCustType;
    @XmlElement(name = "OutGrpCustomerOutGrmEikyrGenericDetailDescription")
    protected String outGrpCustomerOutGrmEikyrGenericDetailDescription;
    @XmlElement(name = "OutGrpCustomerOutGrmEikyrGenericDetailParameterType")
    protected String outGrpCustomerOutGrmEikyrGenericDetailParameterType;
    @XmlElement(name = "OutGrpCustomerOutGrmEikyrGenericDetailSerialNum")
    protected int outGrpCustomerOutGrmEikyrGenericDetailSerialNum;
    @XmlElement(name = "OutGrpCustomerOutGrmIefSuppliedSelectChar")
    protected String outGrpCustomerOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpCustomerOutGrmRealEstateCustContractId")
    protected String outGrpCustomerOutGrmRealEstateCustContractId;
    @XmlElement(name = "OutGrpCustomerOutGrmRealEstateCustEntryStatus")
    protected String outGrpCustomerOutGrmRealEstateCustEntryStatus;
    @XmlElement(name = "OutGrpCustomerOutGrmRealEstateCustInternalSn")
    protected double outGrpCustomerOutGrmRealEstateCustInternalSn;
    @XmlElement(name = "OutGrpCustomerOutGrmRealEstateCustOwnershPerc", required = true)
    protected BigDecimal outGrpCustomerOutGrmRealEstateCustOwnershPerc;
    @XmlElement(name = "OutGrpCustomerOutGrmRealEstateCustRegistProprietor")
    protected String outGrpCustomerOutGrmRealEstateCustRegistProprietor;

    /**
     * Gets the value of the outGrpCustomerOutGrmCustomerCDigit property.
     * 
     */
    public short getOutGrpCustomerOutGrmCustomerCDigit() {
        return outGrpCustomerOutGrmCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmCustomerCDigit property.
     * 
     */
    public void setOutGrpCustomerOutGrmCustomerCDigit(short value) {
        this.outGrpCustomerOutGrmCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmCustomerCustId property.
     * 
     */
    public int getOutGrpCustomerOutGrmCustomerCustId() {
        return outGrpCustomerOutGrmCustomerCustId;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmCustomerCustId property.
     * 
     */
    public void setOutGrpCustomerOutGrmCustomerCustId(int value) {
        this.outGrpCustomerOutGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerOutGrmCustomerFirstName() {
        return outGrpCustomerOutGrmCustomerFirstName;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerOutGrmCustomerFirstName(String value) {
        this.outGrpCustomerOutGrmCustomerFirstName = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerOutGrmCustomerSurname() {
        return outGrpCustomerOutGrmCustomerSurname;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerOutGrmCustomerSurname(String value) {
        this.outGrpCustomerOutGrmCustomerSurname = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerOutGrmCustomerCustType() {
        return outGrpCustomerOutGrmCustomerCustType;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerOutGrmCustomerCustType(String value) {
        this.outGrpCustomerOutGrmCustomerCustType = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmEikyrGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerOutGrmEikyrGenericDetailDescription() {
        return outGrpCustomerOutGrmEikyrGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmEikyrGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerOutGrmEikyrGenericDetailDescription(String value) {
        this.outGrpCustomerOutGrmEikyrGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmEikyrGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerOutGrmEikyrGenericDetailParameterType() {
        return outGrpCustomerOutGrmEikyrGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmEikyrGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerOutGrmEikyrGenericDetailParameterType(String value) {
        this.outGrpCustomerOutGrmEikyrGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmEikyrGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpCustomerOutGrmEikyrGenericDetailSerialNum() {
        return outGrpCustomerOutGrmEikyrGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmEikyrGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpCustomerOutGrmEikyrGenericDetailSerialNum(int value) {
        this.outGrpCustomerOutGrmEikyrGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerOutGrmIefSuppliedSelectChar() {
        return outGrpCustomerOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpCustomerOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmRealEstateCustContractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerOutGrmRealEstateCustContractId() {
        return outGrpCustomerOutGrmRealEstateCustContractId;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmRealEstateCustContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerOutGrmRealEstateCustContractId(String value) {
        this.outGrpCustomerOutGrmRealEstateCustContractId = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmRealEstateCustEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerOutGrmRealEstateCustEntryStatus() {
        return outGrpCustomerOutGrmRealEstateCustEntryStatus;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmRealEstateCustEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerOutGrmRealEstateCustEntryStatus(String value) {
        this.outGrpCustomerOutGrmRealEstateCustEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmRealEstateCustInternalSn property.
     * 
     */
    public double getOutGrpCustomerOutGrmRealEstateCustInternalSn() {
        return outGrpCustomerOutGrmRealEstateCustInternalSn;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmRealEstateCustInternalSn property.
     * 
     */
    public void setOutGrpCustomerOutGrmRealEstateCustInternalSn(double value) {
        this.outGrpCustomerOutGrmRealEstateCustInternalSn = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmRealEstateCustOwnershPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustomerOutGrmRealEstateCustOwnershPerc() {
        return outGrpCustomerOutGrmRealEstateCustOwnershPerc;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmRealEstateCustOwnershPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustomerOutGrmRealEstateCustOwnershPerc(BigDecimal value) {
        this.outGrpCustomerOutGrmRealEstateCustOwnershPerc = value;
    }

    /**
     * Gets the value of the outGrpCustomerOutGrmRealEstateCustRegistProprietor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerOutGrmRealEstateCustRegistProprietor() {
        return outGrpCustomerOutGrmRealEstateCustRegistProprietor;
    }

    /**
     * Sets the value of the outGrpCustomerOutGrmRealEstateCustRegistProprietor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerOutGrmRealEstateCustRegistProprietor(String value) {
        this.outGrpCustomerOutGrmRealEstateCustRegistProprietor = value;
    }

}
