
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRT022VOutGrpCustomersIACItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRT022VOutGrpCustomersIACItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustomersOutGrmCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomersOutGrmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustomersOutGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustomersOutGrmCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomersOutGrmPrtAccountCustomersCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomersOutGrmPrtAccountCustomersCustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRT022VOutGrpCustomersIACItem", propOrder = {
    "outGrpCustomersOutGrmCustomerAlertMsg",
    "outGrpCustomersOutGrmCustomerCDigit",
    "outGrpCustomersOutGrmCustomerCustId",
    "outGrpCustomersOutGrmCustomerCustType",
    "outGrpCustomersOutGrmPrtAccountCustomersCustomerName",
    "outGrpCustomersOutGrmPrtAccountCustomersCustomerType"
})
public class PRT022VOutGrpCustomersIACItem {

    @XmlElement(name = "OutGrpCustomersOutGrmCustomerAlertMsg")
    protected String outGrpCustomersOutGrmCustomerAlertMsg;
    @XmlElement(name = "OutGrpCustomersOutGrmCustomerCDigit")
    protected short outGrpCustomersOutGrmCustomerCDigit;
    @XmlElement(name = "OutGrpCustomersOutGrmCustomerCustId")
    protected int outGrpCustomersOutGrmCustomerCustId;
    @XmlElement(name = "OutGrpCustomersOutGrmCustomerCustType")
    protected String outGrpCustomersOutGrmCustomerCustType;
    @XmlElement(name = "OutGrpCustomersOutGrmPrtAccountCustomersCustomerName")
    protected String outGrpCustomersOutGrmPrtAccountCustomersCustomerName;
    @XmlElement(name = "OutGrpCustomersOutGrmPrtAccountCustomersCustomerType")
    protected String outGrpCustomersOutGrmPrtAccountCustomersCustomerType;

    /**
     * Gets the value of the outGrpCustomersOutGrmCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomersOutGrmCustomerAlertMsg() {
        return outGrpCustomersOutGrmCustomerAlertMsg;
    }

    /**
     * Sets the value of the outGrpCustomersOutGrmCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomersOutGrmCustomerAlertMsg(String value) {
        this.outGrpCustomersOutGrmCustomerAlertMsg = value;
    }

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
     * Gets the value of the outGrpCustomersOutGrmCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomersOutGrmCustomerCustType() {
        return outGrpCustomersOutGrmCustomerCustType;
    }

    /**
     * Sets the value of the outGrpCustomersOutGrmCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomersOutGrmCustomerCustType(String value) {
        this.outGrpCustomersOutGrmCustomerCustType = value;
    }

    /**
     * Gets the value of the outGrpCustomersOutGrmPrtAccountCustomersCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomersOutGrmPrtAccountCustomersCustomerName() {
        return outGrpCustomersOutGrmPrtAccountCustomersCustomerName;
    }

    /**
     * Sets the value of the outGrpCustomersOutGrmPrtAccountCustomersCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomersOutGrmPrtAccountCustomersCustomerName(String value) {
        this.outGrpCustomersOutGrmPrtAccountCustomersCustomerName = value;
    }

    /**
     * Gets the value of the outGrpCustomersOutGrmPrtAccountCustomersCustomerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomersOutGrmPrtAccountCustomersCustomerType() {
        return outGrpCustomersOutGrmPrtAccountCustomersCustomerType;
    }

    /**
     * Sets the value of the outGrpCustomersOutGrmPrtAccountCustomersCustomerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomersOutGrmPrtAccountCustomersCustomerType(String value) {
        this.outGrpCustomersOutGrmPrtAccountCustomersCustomerType = value;
    }

}
