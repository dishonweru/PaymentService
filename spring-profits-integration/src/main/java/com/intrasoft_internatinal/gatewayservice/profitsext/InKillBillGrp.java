
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InKillBillGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InKillBillGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InKillBillGrpInForKillBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InKillBillGrp", propOrder = {
    "inKillBillGrpInForKillBillBillSerialNum"
})
public class InKillBillGrp {

    @XmlElement(name = "InKillBillGrpInForKillBillBillSerialNum")
    protected double inKillBillGrpInForKillBillBillSerialNum;

    /**
     * Gets the value of the inKillBillGrpInForKillBillBillSerialNum property.
     * 
     */
    public double getInKillBillGrpInForKillBillBillSerialNum() {
        return inKillBillGrpInForKillBillBillSerialNum;
    }

    /**
     * Sets the value of the inKillBillGrpInForKillBillBillSerialNum property.
     * 
     */
    public void setInKillBillGrpInForKillBillBillSerialNum(double value) {
        this.inKillBillGrpInForKillBillBillSerialNum = value;
    }

}
