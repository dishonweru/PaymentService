
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for D0325VOutCobGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0325VOutCobGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutCobGrpOutBeneficiaryBeneficiarySn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCobGrpOutCobenfLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCobGrpOutCustCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCobGrpOutCustCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCobGrpOutCustCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCobGrpOutCustCustomerSpouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCobGrpOutCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCobGrpOutCustOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0325VOutCobGrpItem", propOrder = {
    "outCobGrpOutBeneficiaryBeneficiarySn",
    "outCobGrpOutCobenfLnsSuppliedName",
    "outCobGrpOutCustCustomerCDigit",
    "outCobGrpOutCustCustomerCustId",
    "outCobGrpOutCustCustomerFatherName",
    "outCobGrpOutCustCustomerSpouseName",
    "outCobGrpOutCustOtherAfmAfmNo",
    "outCobGrpOutCustOtherIdIdNo"
})
public class D0325VOutCobGrpItem {

    @XmlElement(name = "OutCobGrpOutBeneficiaryBeneficiarySn")
    protected short outCobGrpOutBeneficiaryBeneficiarySn;
    @XmlElement(name = "OutCobGrpOutCobenfLnsSuppliedName")
    protected String outCobGrpOutCobenfLnsSuppliedName;
    @XmlElement(name = "OutCobGrpOutCustCustomerCDigit")
    protected short outCobGrpOutCustCustomerCDigit;
    @XmlElement(name = "OutCobGrpOutCustCustomerCustId")
    protected int outCobGrpOutCustCustomerCustId;
    @XmlElement(name = "OutCobGrpOutCustCustomerFatherName")
    protected String outCobGrpOutCustCustomerFatherName;
    @XmlElement(name = "OutCobGrpOutCustCustomerSpouseName")
    protected String outCobGrpOutCustCustomerSpouseName;
    @XmlElement(name = "OutCobGrpOutCustOtherAfmAfmNo")
    protected String outCobGrpOutCustOtherAfmAfmNo;
    @XmlElement(name = "OutCobGrpOutCustOtherIdIdNo")
    protected String outCobGrpOutCustOtherIdIdNo;

    /**
     * Gets the value of the outCobGrpOutBeneficiaryBeneficiarySn property.
     * 
     */
    public short getOutCobGrpOutBeneficiaryBeneficiarySn() {
        return outCobGrpOutBeneficiaryBeneficiarySn;
    }

    /**
     * Sets the value of the outCobGrpOutBeneficiaryBeneficiarySn property.
     * 
     */
    public void setOutCobGrpOutBeneficiaryBeneficiarySn(short value) {
        this.outCobGrpOutBeneficiaryBeneficiarySn = value;
    }

    /**
     * Gets the value of the outCobGrpOutCobenfLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCobGrpOutCobenfLnsSuppliedName() {
        return outCobGrpOutCobenfLnsSuppliedName;
    }

    /**
     * Sets the value of the outCobGrpOutCobenfLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCobGrpOutCobenfLnsSuppliedName(String value) {
        this.outCobGrpOutCobenfLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCobGrpOutCustCustomerCDigit property.
     * 
     */
    public short getOutCobGrpOutCustCustomerCDigit() {
        return outCobGrpOutCustCustomerCDigit;
    }

    /**
     * Sets the value of the outCobGrpOutCustCustomerCDigit property.
     * 
     */
    public void setOutCobGrpOutCustCustomerCDigit(short value) {
        this.outCobGrpOutCustCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCobGrpOutCustCustomerCustId property.
     * 
     */
    public int getOutCobGrpOutCustCustomerCustId() {
        return outCobGrpOutCustCustomerCustId;
    }

    /**
     * Sets the value of the outCobGrpOutCustCustomerCustId property.
     * 
     */
    public void setOutCobGrpOutCustCustomerCustId(int value) {
        this.outCobGrpOutCustCustomerCustId = value;
    }

    /**
     * Gets the value of the outCobGrpOutCustCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCobGrpOutCustCustomerFatherName() {
        return outCobGrpOutCustCustomerFatherName;
    }

    /**
     * Sets the value of the outCobGrpOutCustCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCobGrpOutCustCustomerFatherName(String value) {
        this.outCobGrpOutCustCustomerFatherName = value;
    }

    /**
     * Gets the value of the outCobGrpOutCustCustomerSpouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCobGrpOutCustCustomerSpouseName() {
        return outCobGrpOutCustCustomerSpouseName;
    }

    /**
     * Sets the value of the outCobGrpOutCustCustomerSpouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCobGrpOutCustCustomerSpouseName(String value) {
        this.outCobGrpOutCustCustomerSpouseName = value;
    }

    /**
     * Gets the value of the outCobGrpOutCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCobGrpOutCustOtherAfmAfmNo() {
        return outCobGrpOutCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outCobGrpOutCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCobGrpOutCustOtherAfmAfmNo(String value) {
        this.outCobGrpOutCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outCobGrpOutCustOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCobGrpOutCustOtherIdIdNo() {
        return outCobGrpOutCustOtherIdIdNo;
    }

    /**
     * Sets the value of the outCobGrpOutCustOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCobGrpOutCustOtherIdIdNo(String value) {
        this.outCobGrpOutCustOtherIdIdNo = value;
    }

}
