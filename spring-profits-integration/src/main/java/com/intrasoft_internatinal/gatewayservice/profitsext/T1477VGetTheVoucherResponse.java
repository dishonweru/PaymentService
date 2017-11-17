
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
 *         &lt;element name="T1477V_GetTheVoucherResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T1477_GetTheVoucherExport" minOccurs="0"/>
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
    "t1477VGetTheVoucherResult"
})
@XmlRootElement(name = "T1477V_GetTheVoucherResponse")
public class T1477VGetTheVoucherResponse {

    @XmlElement(name = "T1477V_GetTheVoucherResult")
    protected T1477GetTheVoucherExport t1477VGetTheVoucherResult;

    /**
     * Gets the value of the t1477VGetTheVoucherResult property.
     * 
     * @return
     *     possible object is
     *     {@link T1477GetTheVoucherExport }
     *     
     */
    public T1477GetTheVoucherExport getT1477VGetTheVoucherResult() {
        return t1477VGetTheVoucherResult;
    }

    /**
     * Sets the value of the t1477VGetTheVoucherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T1477GetTheVoucherExport }
     *     
     */
    public void setT1477VGetTheVoucherResult(T1477GetTheVoucherExport value) {
        this.t1477VGetTheVoucherResult = value;
    }

}
