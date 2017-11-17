
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpGuarantRepres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpGuarantRepres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpGuarantRepresOutGrmGuarantIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpGuarantRepresOutGrmGuarantorCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpGuarantRepresOutGrmGuarantorCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpGuarantRepresOutGrmGuarantorCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpGuarantRepresOutGrmGuarantRepresCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpGuarantRepresOutGrmGuarantRepresCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpGuarantRepresOutGrmGuarantRepresCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpGuarantRepres", propOrder = {
    "outGrpGuarantRepresOutGrmGuarantIefSuppliedChar1",
    "outGrpGuarantRepresOutGrmGuarantorCustomerCDigit",
    "outGrpGuarantRepresOutGrmGuarantorCustomerCustId",
    "outGrpGuarantRepresOutGrmGuarantorCustomerSurname",
    "outGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit",
    "outGrpGuarantRepresOutGrmGuarantRepresCustomerCustId",
    "outGrpGuarantRepresOutGrmGuarantRepresCustomerCustType",
    "outGrpGuarantRepresOutGrmGuarantRepresCustomerSurname"
})
public class OutGrpGuarantRepres {

    @XmlElement(name = "OutGrpGuarantRepresOutGrmGuarantIefSuppliedChar1")
    protected String outGrpGuarantRepresOutGrmGuarantIefSuppliedChar1;
    @XmlElement(name = "OutGrpGuarantRepresOutGrmGuarantorCustomerCDigit")
    protected short outGrpGuarantRepresOutGrmGuarantorCustomerCDigit;
    @XmlElement(name = "OutGrpGuarantRepresOutGrmGuarantorCustomerCustId")
    protected int outGrpGuarantRepresOutGrmGuarantorCustomerCustId;
    @XmlElement(name = "OutGrpGuarantRepresOutGrmGuarantorCustomerSurname")
    protected String outGrpGuarantRepresOutGrmGuarantorCustomerSurname;
    @XmlElement(name = "OutGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit")
    protected short outGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit;
    @XmlElement(name = "OutGrpGuarantRepresOutGrmGuarantRepresCustomerCustId")
    protected int outGrpGuarantRepresOutGrmGuarantRepresCustomerCustId;
    @XmlElement(name = "OutGrpGuarantRepresOutGrmGuarantRepresCustomerCustType")
    protected String outGrpGuarantRepresOutGrmGuarantRepresCustomerCustType;
    @XmlElement(name = "OutGrpGuarantRepresOutGrmGuarantRepresCustomerSurname")
    protected String outGrpGuarantRepresOutGrmGuarantRepresCustomerSurname;

    /**
     * Gets the value of the outGrpGuarantRepresOutGrmGuarantIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpGuarantRepresOutGrmGuarantIefSuppliedChar1() {
        return outGrpGuarantRepresOutGrmGuarantIefSuppliedChar1;
    }

    /**
     * Sets the value of the outGrpGuarantRepresOutGrmGuarantIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpGuarantRepresOutGrmGuarantIefSuppliedChar1(String value) {
        this.outGrpGuarantRepresOutGrmGuarantIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the outGrpGuarantRepresOutGrmGuarantorCustomerCDigit property.
     * 
     */
    public short getOutGrpGuarantRepresOutGrmGuarantorCustomerCDigit() {
        return outGrpGuarantRepresOutGrmGuarantorCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpGuarantRepresOutGrmGuarantorCustomerCDigit property.
     * 
     */
    public void setOutGrpGuarantRepresOutGrmGuarantorCustomerCDigit(short value) {
        this.outGrpGuarantRepresOutGrmGuarantorCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpGuarantRepresOutGrmGuarantorCustomerCustId property.
     * 
     */
    public int getOutGrpGuarantRepresOutGrmGuarantorCustomerCustId() {
        return outGrpGuarantRepresOutGrmGuarantorCustomerCustId;
    }

    /**
     * Sets the value of the outGrpGuarantRepresOutGrmGuarantorCustomerCustId property.
     * 
     */
    public void setOutGrpGuarantRepresOutGrmGuarantorCustomerCustId(int value) {
        this.outGrpGuarantRepresOutGrmGuarantorCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpGuarantRepresOutGrmGuarantorCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpGuarantRepresOutGrmGuarantorCustomerSurname() {
        return outGrpGuarantRepresOutGrmGuarantorCustomerSurname;
    }

    /**
     * Sets the value of the outGrpGuarantRepresOutGrmGuarantorCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpGuarantRepresOutGrmGuarantorCustomerSurname(String value) {
        this.outGrpGuarantRepresOutGrmGuarantorCustomerSurname = value;
    }

    /**
     * Gets the value of the outGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit property.
     * 
     */
    public short getOutGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit() {
        return outGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit property.
     * 
     */
    public void setOutGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit(short value) {
        this.outGrpGuarantRepresOutGrmGuarantRepresCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpGuarantRepresOutGrmGuarantRepresCustomerCustId property.
     * 
     */
    public int getOutGrpGuarantRepresOutGrmGuarantRepresCustomerCustId() {
        return outGrpGuarantRepresOutGrmGuarantRepresCustomerCustId;
    }

    /**
     * Sets the value of the outGrpGuarantRepresOutGrmGuarantRepresCustomerCustId property.
     * 
     */
    public void setOutGrpGuarantRepresOutGrmGuarantRepresCustomerCustId(int value) {
        this.outGrpGuarantRepresOutGrmGuarantRepresCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpGuarantRepresOutGrmGuarantRepresCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpGuarantRepresOutGrmGuarantRepresCustomerCustType() {
        return outGrpGuarantRepresOutGrmGuarantRepresCustomerCustType;
    }

    /**
     * Sets the value of the outGrpGuarantRepresOutGrmGuarantRepresCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpGuarantRepresOutGrmGuarantRepresCustomerCustType(String value) {
        this.outGrpGuarantRepresOutGrmGuarantRepresCustomerCustType = value;
    }

    /**
     * Gets the value of the outGrpGuarantRepresOutGrmGuarantRepresCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpGuarantRepresOutGrmGuarantRepresCustomerSurname() {
        return outGrpGuarantRepresOutGrmGuarantRepresCustomerSurname;
    }

    /**
     * Sets the value of the outGrpGuarantRepresOutGrmGuarantRepresCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpGuarantRepresOutGrmGuarantRepresCustomerSurname(String value) {
        this.outGrpGuarantRepresOutGrmGuarantRepresCustomerSurname = value;
    }

}
