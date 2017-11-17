
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
 *         &lt;element name="D0315V_StopChequeResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}StopChequeExport" minOccurs="0"/>
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
    "d0315VStopChequeResult"
})
@XmlRootElement(name = "D0315V_StopChequeResponse")
public class D0315VStopChequeResponse {

    @XmlElement(name = "D0315V_StopChequeResult")
    protected StopChequeExport d0315VStopChequeResult;

    /**
     * Gets the value of the d0315VStopChequeResult property.
     * 
     * @return
     *     possible object is
     *     {@link StopChequeExport }
     *     
     */
    public StopChequeExport getD0315VStopChequeResult() {
        return d0315VStopChequeResult;
    }

    /**
     * Sets the value of the d0315VStopChequeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopChequeExport }
     *     
     */
    public void setD0315VStopChequeResult(StopChequeExport value) {
        this.d0315VStopChequeResult = value;
    }

}
