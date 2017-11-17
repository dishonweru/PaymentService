
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InGrpBenefRepres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpBenefRepres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpBenefRepresInGrmBenefRepresCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpBenefRepresInGrmBenefRepresCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpBenefRepresInGrmBenefRepresCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpBenefRepresInGrmBenefRepresCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpBenefRepres", propOrder = {
    "inGrpBenefRepresInGrmBenefRepresCustomerCDigit",
    "inGrpBenefRepresInGrmBenefRepresCustomerCustId",
    "inGrpBenefRepresInGrmBenefRepresCustomerCustType",
    "inGrpBenefRepresInGrmBenefRepresCustomerSurname"
})
public class InGrpBenefRepres {

    @XmlElement(name = "InGrpBenefRepresInGrmBenefRepresCustomerCDigit")
    protected short inGrpBenefRepresInGrmBenefRepresCustomerCDigit;
    @XmlElement(name = "InGrpBenefRepresInGrmBenefRepresCustomerCustId")
    protected int inGrpBenefRepresInGrmBenefRepresCustomerCustId;
    @XmlElement(name = "InGrpBenefRepresInGrmBenefRepresCustomerCustType")
    protected String inGrpBenefRepresInGrmBenefRepresCustomerCustType;
    @XmlElement(name = "InGrpBenefRepresInGrmBenefRepresCustomerSurname")
    protected String inGrpBenefRepresInGrmBenefRepresCustomerSurname;

    /**
     * Gets the value of the inGrpBenefRepresInGrmBenefRepresCustomerCDigit property.
     * 
     */
    public short getInGrpBenefRepresInGrmBenefRepresCustomerCDigit() {
        return inGrpBenefRepresInGrmBenefRepresCustomerCDigit;
    }

    /**
     * Sets the value of the inGrpBenefRepresInGrmBenefRepresCustomerCDigit property.
     * 
     */
    public void setInGrpBenefRepresInGrmBenefRepresCustomerCDigit(short value) {
        this.inGrpBenefRepresInGrmBenefRepresCustomerCDigit = value;
    }

    /**
     * Gets the value of the inGrpBenefRepresInGrmBenefRepresCustomerCustId property.
     * 
     */
    public int getInGrpBenefRepresInGrmBenefRepresCustomerCustId() {
        return inGrpBenefRepresInGrmBenefRepresCustomerCustId;
    }

    /**
     * Sets the value of the inGrpBenefRepresInGrmBenefRepresCustomerCustId property.
     * 
     */
    public void setInGrpBenefRepresInGrmBenefRepresCustomerCustId(int value) {
        this.inGrpBenefRepresInGrmBenefRepresCustomerCustId = value;
    }

    /**
     * Gets the value of the inGrpBenefRepresInGrmBenefRepresCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpBenefRepresInGrmBenefRepresCustomerCustType() {
        return inGrpBenefRepresInGrmBenefRepresCustomerCustType;
    }

    /**
     * Sets the value of the inGrpBenefRepresInGrmBenefRepresCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpBenefRepresInGrmBenefRepresCustomerCustType(String value) {
        this.inGrpBenefRepresInGrmBenefRepresCustomerCustType = value;
    }

    /**
     * Gets the value of the inGrpBenefRepresInGrmBenefRepresCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpBenefRepresInGrmBenefRepresCustomerSurname() {
        return inGrpBenefRepresInGrmBenefRepresCustomerSurname;
    }

    /**
     * Sets the value of the inGrpBenefRepresInGrmBenefRepresCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpBenefRepresInGrmBenefRepresCustomerSurname(String value) {
        this.inGrpBenefRepresInGrmBenefRepresCustomerSurname = value;
    }

}
