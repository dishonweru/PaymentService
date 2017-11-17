
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutOwnbankUnpaid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutOwnbankUnpaid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutOwnbankUnpaidOutGrmBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOwnbankUnpaid", propOrder = {
    "outOwnbankUnpaidOutGrmBillBillSerialNum"
})
public class OutOwnbankUnpaid {

    @XmlElement(name = "OutOwnbankUnpaidOutGrmBillBillSerialNum")
    protected double outOwnbankUnpaidOutGrmBillBillSerialNum;

    /**
     * Gets the value of the outOwnbankUnpaidOutGrmBillBillSerialNum property.
     * 
     */
    public double getOutOwnbankUnpaidOutGrmBillBillSerialNum() {
        return outOwnbankUnpaidOutGrmBillBillSerialNum;
    }

    /**
     * Sets the value of the outOwnbankUnpaidOutGrmBillBillSerialNum property.
     * 
     */
    public void setOutOwnbankUnpaidOutGrmBillBillSerialNum(double value) {
        this.outOwnbankUnpaidOutGrmBillBillSerialNum = value;
    }

}
