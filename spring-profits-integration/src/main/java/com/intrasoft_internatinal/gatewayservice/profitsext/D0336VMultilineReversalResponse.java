
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
 *         &lt;element name="D0336V_MultilineReversalResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0336VMultilineReversalExport" minOccurs="0"/>
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
    "d0336VMultilineReversalResult"
})
@XmlRootElement(name = "D0336V_MultilineReversalResponse")
public class D0336VMultilineReversalResponse {

    @XmlElement(name = "D0336V_MultilineReversalResult")
    protected D0336VMultilineReversalExport d0336VMultilineReversalResult;

    /**
     * Gets the value of the d0336VMultilineReversalResult property.
     * 
     * @return
     *     possible object is
     *     {@link D0336VMultilineReversalExport }
     *     
     */
    public D0336VMultilineReversalExport getD0336VMultilineReversalResult() {
        return d0336VMultilineReversalResult;
    }

    /**
     * Sets the value of the d0336VMultilineReversalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D0336VMultilineReversalExport }
     *     
     */
    public void setD0336VMultilineReversalResult(D0336VMultilineReversalExport value) {
        this.d0336VMultilineReversalResult = value;
    }

}
