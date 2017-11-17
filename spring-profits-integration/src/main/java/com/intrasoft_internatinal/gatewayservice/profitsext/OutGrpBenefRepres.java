
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpBenefRepres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpBenefRepres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpBenefRepresOutGrmBeneficiaryCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpBenefRepresOutGrmBeneficiaryCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpBenefRepresOutGrmBeneficiaryCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpBenefRepresOutGrmBenefIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpBenefRepresOutGrmBenefRepresCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpBenefRepresOutGrmBenefRepresCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpBenefRepresOutGrmBenefRepresCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpBenefRepresOutGrmBenefRepresCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpBenefRepres", propOrder = {
    "outGrpBenefRepresOutGrmBeneficiaryCustomerCDigit",
    "outGrpBenefRepresOutGrmBeneficiaryCustomerCustId",
    "outGrpBenefRepresOutGrmBeneficiaryCustomerSurname",
    "outGrpBenefRepresOutGrmBenefIefSuppliedChar1",
    "outGrpBenefRepresOutGrmBenefRepresCustomerCDigit",
    "outGrpBenefRepresOutGrmBenefRepresCustomerCustId",
    "outGrpBenefRepresOutGrmBenefRepresCustomerCustType",
    "outGrpBenefRepresOutGrmBenefRepresCustomerSurname"
})
public class OutGrpBenefRepres {

    @XmlElement(name = "OutGrpBenefRepresOutGrmBeneficiaryCustomerCDigit")
    protected short outGrpBenefRepresOutGrmBeneficiaryCustomerCDigit;
    @XmlElement(name = "OutGrpBenefRepresOutGrmBeneficiaryCustomerCustId")
    protected int outGrpBenefRepresOutGrmBeneficiaryCustomerCustId;
    @XmlElement(name = "OutGrpBenefRepresOutGrmBeneficiaryCustomerSurname")
    protected String outGrpBenefRepresOutGrmBeneficiaryCustomerSurname;
    @XmlElement(name = "OutGrpBenefRepresOutGrmBenefIefSuppliedChar1")
    protected String outGrpBenefRepresOutGrmBenefIefSuppliedChar1;
    @XmlElement(name = "OutGrpBenefRepresOutGrmBenefRepresCustomerCDigit")
    protected short outGrpBenefRepresOutGrmBenefRepresCustomerCDigit;
    @XmlElement(name = "OutGrpBenefRepresOutGrmBenefRepresCustomerCustId")
    protected int outGrpBenefRepresOutGrmBenefRepresCustomerCustId;
    @XmlElement(name = "OutGrpBenefRepresOutGrmBenefRepresCustomerCustType")
    protected String outGrpBenefRepresOutGrmBenefRepresCustomerCustType;
    @XmlElement(name = "OutGrpBenefRepresOutGrmBenefRepresCustomerSurname")
    protected String outGrpBenefRepresOutGrmBenefRepresCustomerSurname;

    /**
     * Gets the value of the outGrpBenefRepresOutGrmBeneficiaryCustomerCDigit property.
     * 
     */
    public short getOutGrpBenefRepresOutGrmBeneficiaryCustomerCDigit() {
        return outGrpBenefRepresOutGrmBeneficiaryCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpBenefRepresOutGrmBeneficiaryCustomerCDigit property.
     * 
     */
    public void setOutGrpBenefRepresOutGrmBeneficiaryCustomerCDigit(short value) {
        this.outGrpBenefRepresOutGrmBeneficiaryCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpBenefRepresOutGrmBeneficiaryCustomerCustId property.
     * 
     */
    public int getOutGrpBenefRepresOutGrmBeneficiaryCustomerCustId() {
        return outGrpBenefRepresOutGrmBeneficiaryCustomerCustId;
    }

    /**
     * Sets the value of the outGrpBenefRepresOutGrmBeneficiaryCustomerCustId property.
     * 
     */
    public void setOutGrpBenefRepresOutGrmBeneficiaryCustomerCustId(int value) {
        this.outGrpBenefRepresOutGrmBeneficiaryCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpBenefRepresOutGrmBeneficiaryCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBenefRepresOutGrmBeneficiaryCustomerSurname() {
        return outGrpBenefRepresOutGrmBeneficiaryCustomerSurname;
    }

    /**
     * Sets the value of the outGrpBenefRepresOutGrmBeneficiaryCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBenefRepresOutGrmBeneficiaryCustomerSurname(String value) {
        this.outGrpBenefRepresOutGrmBeneficiaryCustomerSurname = value;
    }

    /**
     * Gets the value of the outGrpBenefRepresOutGrmBenefIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBenefRepresOutGrmBenefIefSuppliedChar1() {
        return outGrpBenefRepresOutGrmBenefIefSuppliedChar1;
    }

    /**
     * Sets the value of the outGrpBenefRepresOutGrmBenefIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBenefRepresOutGrmBenefIefSuppliedChar1(String value) {
        this.outGrpBenefRepresOutGrmBenefIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the outGrpBenefRepresOutGrmBenefRepresCustomerCDigit property.
     * 
     */
    public short getOutGrpBenefRepresOutGrmBenefRepresCustomerCDigit() {
        return outGrpBenefRepresOutGrmBenefRepresCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpBenefRepresOutGrmBenefRepresCustomerCDigit property.
     * 
     */
    public void setOutGrpBenefRepresOutGrmBenefRepresCustomerCDigit(short value) {
        this.outGrpBenefRepresOutGrmBenefRepresCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpBenefRepresOutGrmBenefRepresCustomerCustId property.
     * 
     */
    public int getOutGrpBenefRepresOutGrmBenefRepresCustomerCustId() {
        return outGrpBenefRepresOutGrmBenefRepresCustomerCustId;
    }

    /**
     * Sets the value of the outGrpBenefRepresOutGrmBenefRepresCustomerCustId property.
     * 
     */
    public void setOutGrpBenefRepresOutGrmBenefRepresCustomerCustId(int value) {
        this.outGrpBenefRepresOutGrmBenefRepresCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpBenefRepresOutGrmBenefRepresCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBenefRepresOutGrmBenefRepresCustomerCustType() {
        return outGrpBenefRepresOutGrmBenefRepresCustomerCustType;
    }

    /**
     * Sets the value of the outGrpBenefRepresOutGrmBenefRepresCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBenefRepresOutGrmBenefRepresCustomerCustType(String value) {
        this.outGrpBenefRepresOutGrmBenefRepresCustomerCustType = value;
    }

    /**
     * Gets the value of the outGrpBenefRepresOutGrmBenefRepresCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBenefRepresOutGrmBenefRepresCustomerSurname() {
        return outGrpBenefRepresOutGrmBenefRepresCustomerSurname;
    }

    /**
     * Sets the value of the outGrpBenefRepresOutGrmBenefRepresCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBenefRepresOutGrmBenefRepresCustomerSurname(String value) {
        this.outGrpBenefRepresOutGrmBenefRepresCustomerSurname = value;
    }

}
