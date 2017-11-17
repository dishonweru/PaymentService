
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2021VOutGrpCustomersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2021VOutGrpCustomersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustomersOutGrmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustomersOutGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustomersOutGrmNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2021VOutGrpCustomersItem", propOrder = {
    "outGrpCustomersOutGrmCustomerCDigit",
    "outGrpCustomersOutGrmCustomerCustId",
    "outGrpCustomersOutGrmNameListSetDescription"
})
public class MC2021VOutGrpCustomersItem {

    @XmlElement(name = "OutGrpCustomersOutGrmCustomerCDigit")
    protected short outGrpCustomersOutGrmCustomerCDigit;
    @XmlElement(name = "OutGrpCustomersOutGrmCustomerCustId")
    protected int outGrpCustomersOutGrmCustomerCustId;
    @XmlElement(name = "OutGrpCustomersOutGrmNameListSetDescription")
    protected String outGrpCustomersOutGrmNameListSetDescription;

    /**
     * Gets the value of the outGrpCustomersOutGrmCustomerCDigit property.
     * 
     */
    public short getOutGrpCustomersOutGrmCustomerCDigit() {
        return outGrpCustomersOutGrmCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpCustomersOutGrmCustomerCDigit property.
     * 
     */
    public void setOutGrpCustomersOutGrmCustomerCDigit(short value) {
        this.outGrpCustomersOutGrmCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpCustomersOutGrmCustomerCustId property.
     * 
     */
    public int getOutGrpCustomersOutGrmCustomerCustId() {
        return outGrpCustomersOutGrmCustomerCustId;
    }

    /**
     * Sets the value of the outGrpCustomersOutGrmCustomerCustId property.
     * 
     */
    public void setOutGrpCustomersOutGrmCustomerCustId(int value) {
        this.outGrpCustomersOutGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpCustomersOutGrmNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomersOutGrmNameListSetDescription() {
        return outGrpCustomersOutGrmNameListSetDescription;
    }

    /**
     * Sets the value of the outGrpCustomersOutGrmNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomersOutGrmNameListSetDescription(String value) {
        this.outGrpCustomersOutGrmNameListSetDescription = value;
    }

}
