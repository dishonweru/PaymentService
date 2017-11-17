
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InOwnbankUnpaid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InOwnbankUnpaid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InOwnbankUnpaidInGrmBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InOwnbankUnpaid", propOrder = {
    "inOwnbankUnpaidInGrmBillBillSerialNum"
})
public class InOwnbankUnpaid {

    @XmlElement(name = "InOwnbankUnpaidInGrmBillBillSerialNum")
    protected double inOwnbankUnpaidInGrmBillBillSerialNum;

    /**
     * Gets the value of the inOwnbankUnpaidInGrmBillBillSerialNum property.
     * 
     */
    public double getInOwnbankUnpaidInGrmBillBillSerialNum() {
        return inOwnbankUnpaidInGrmBillBillSerialNum;
    }

    /**
     * Sets the value of the inOwnbankUnpaidInGrmBillBillSerialNum property.
     * 
     */
    public void setInOwnbankUnpaidInGrmBillBillSerialNum(double value) {
        this.inOwnbankUnpaidInGrmBillBillSerialNum = value;
    }

}
