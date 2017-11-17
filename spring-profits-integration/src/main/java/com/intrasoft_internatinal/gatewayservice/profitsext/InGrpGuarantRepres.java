
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InGrpGuarantRepres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpGuarantRepres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpGuarantRepresInGrmGuarantRepresCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpGuarantRepresInGrmGuarantRepresCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpGuarantRepresInGrmGuarantRepresCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpGuarantRepresInGrmGuarantRepresCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpGuarantRepres", propOrder = {
    "inGrpGuarantRepresInGrmGuarantRepresCustomerCDigit",
    "inGrpGuarantRepresInGrmGuarantRepresCustomerCustId",
    "inGrpGuarantRepresInGrmGuarantRepresCustomerCustType",
    "inGrpGuarantRepresInGrmGuarantRepresCustomerSurname"
})
public class InGrpGuarantRepres {

    @XmlElement(name = "InGrpGuarantRepresInGrmGuarantRepresCustomerCDigit")
    protected short inGrpGuarantRepresInGrmGuarantRepresCustomerCDigit;
    @XmlElement(name = "InGrpGuarantRepresInGrmGuarantRepresCustomerCustId")
    protected int inGrpGuarantRepresInGrmGuarantRepresCustomerCustId;
    @XmlElement(name = "InGrpGuarantRepresInGrmGuarantRepresCustomerCustType")
    protected String inGrpGuarantRepresInGrmGuarantRepresCustomerCustType;
    @XmlElement(name = "InGrpGuarantRepresInGrmGuarantRepresCustomerSurname")
    protected String inGrpGuarantRepresInGrmGuarantRepresCustomerSurname;

    /**
     * Gets the value of the inGrpGuarantRepresInGrmGuarantRepresCustomerCDigit property.
     * 
     */
    public short getInGrpGuarantRepresInGrmGuarantRepresCustomerCDigit() {
        return inGrpGuarantRepresInGrmGuarantRepresCustomerCDigit;
    }

    /**
     * Sets the value of the inGrpGuarantRepresInGrmGuarantRepresCustomerCDigit property.
     * 
     */
    public void setInGrpGuarantRepresInGrmGuarantRepresCustomerCDigit(short value) {
        this.inGrpGuarantRepresInGrmGuarantRepresCustomerCDigit = value;
    }

    /**
     * Gets the value of the inGrpGuarantRepresInGrmGuarantRepresCustomerCustId property.
     * 
     */
    public int getInGrpGuarantRepresInGrmGuarantRepresCustomerCustId() {
        return inGrpGuarantRepresInGrmGuarantRepresCustomerCustId;
    }

    /**
     * Sets the value of the inGrpGuarantRepresInGrmGuarantRepresCustomerCustId property.
     * 
     */
    public void setInGrpGuarantRepresInGrmGuarantRepresCustomerCustId(int value) {
        this.inGrpGuarantRepresInGrmGuarantRepresCustomerCustId = value;
    }

    /**
     * Gets the value of the inGrpGuarantRepresInGrmGuarantRepresCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpGuarantRepresInGrmGuarantRepresCustomerCustType() {
        return inGrpGuarantRepresInGrmGuarantRepresCustomerCustType;
    }

    /**
     * Sets the value of the inGrpGuarantRepresInGrmGuarantRepresCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpGuarantRepresInGrmGuarantRepresCustomerCustType(String value) {
        this.inGrpGuarantRepresInGrmGuarantRepresCustomerCustType = value;
    }

    /**
     * Gets the value of the inGrpGuarantRepresInGrmGuarantRepresCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpGuarantRepresInGrmGuarantRepresCustomerSurname() {
        return inGrpGuarantRepresInGrmGuarantRepresCustomerSurname;
    }

    /**
     * Sets the value of the inGrpGuarantRepresInGrmGuarantRepresCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpGuarantRepresInGrmGuarantRepresCustomerSurname(String value) {
        this.inGrpGuarantRepresInGrmGuarantRepresCustomerSurname = value;
    }

}
