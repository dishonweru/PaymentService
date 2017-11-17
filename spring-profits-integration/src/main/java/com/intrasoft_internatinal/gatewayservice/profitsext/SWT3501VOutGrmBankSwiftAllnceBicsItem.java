
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWT3501VOutGrmBankSwiftAllnceBicsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501VOutGrmBankSwiftAllnceBicsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrmBankSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501VOutGrmBankSwiftAllnceBicsItem", propOrder = {
    "outGrmBankSwiftAllnceBicsBankDescr"
})
public class SWT3501VOutGrmBankSwiftAllnceBicsItem {

    @XmlElement(name = "OutGrmBankSwiftAllnceBicsBankDescr")
    protected String outGrmBankSwiftAllnceBicsBankDescr;

    /**
     * Gets the value of the outGrmBankSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrmBankSwiftAllnceBicsBankDescr() {
        return outGrmBankSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the outGrmBankSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrmBankSwiftAllnceBicsBankDescr(String value) {
        this.outGrmBankSwiftAllnceBicsBankDescr = value;
    }

}
