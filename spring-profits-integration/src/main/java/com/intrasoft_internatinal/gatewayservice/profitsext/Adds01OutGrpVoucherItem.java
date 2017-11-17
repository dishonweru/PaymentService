
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adds01OutGrpVoucherItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adds01OutGrpVoucherItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpVoucherOutGrmParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adds01OutGrpVoucherItem", propOrder = {
    "outGrpVoucherOutGrmParVoucherRunVoucherLine"
})
public class Adds01OutGrpVoucherItem {

    @XmlElement(name = "OutGrpVoucherOutGrmParVoucherRunVoucherLine")
    protected String outGrpVoucherOutGrmParVoucherRunVoucherLine;

    /**
     * Gets the value of the outGrpVoucherOutGrmParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVoucherOutGrmParVoucherRunVoucherLine() {
        return outGrpVoucherOutGrmParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outGrpVoucherOutGrmParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVoucherOutGrmParVoucherRunVoucherLine(String value) {
        this.outGrpVoucherOutGrmParVoucherRunVoucherLine = value;
    }

}
