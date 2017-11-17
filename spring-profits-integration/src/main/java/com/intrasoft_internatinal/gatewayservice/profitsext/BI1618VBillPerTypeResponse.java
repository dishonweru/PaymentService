
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BI1618V_BillPerTypeResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BI1618V_BillPerTypeExport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bi1618VBillPerTypeResult"
})
@XmlRootElement(name = "BI1618V_BillPerTypeResponse")
public class BI1618VBillPerTypeResponse {

    @XmlElement(name = "BI1618V_BillPerTypeResult")
    protected BI1618VBillPerTypeExport bi1618VBillPerTypeResult;

    /**
     * Gets the value of the bi1618VBillPerTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link BI1618VBillPerTypeExport }
     *     
     */
    public BI1618VBillPerTypeExport getBI1618VBillPerTypeResult() {
        return bi1618VBillPerTypeResult;
    }

    /**
     * Sets the value of the bi1618VBillPerTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BI1618VBillPerTypeExport }
     *     
     */
    public void setBI1618VBillPerTypeResult(BI1618VBillPerTypeExport value) {
        this.bi1618VBillPerTypeResult = value;
    }

}
