
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutExtraitJust complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutExtraitJust">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutExtraitJustOutExtraitJustCharCharSuppliedChar25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutExtraitJust", propOrder = {
    "outExtraitJustOutExtraitJustCharCharSuppliedChar25"
})
public class OutExtraitJust {

    @XmlElement(name = "OutExtraitJustOutExtraitJustCharCharSuppliedChar25")
    protected String outExtraitJustOutExtraitJustCharCharSuppliedChar25;

    /**
     * Gets the value of the outExtraitJustOutExtraitJustCharCharSuppliedChar25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitJustOutExtraitJustCharCharSuppliedChar25() {
        return outExtraitJustOutExtraitJustCharCharSuppliedChar25;
    }

    /**
     * Sets the value of the outExtraitJustOutExtraitJustCharCharSuppliedChar25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitJustOutExtraitJustCharCharSuppliedChar25(String value) {
        this.outExtraitJustOutExtraitJustCharCharSuppliedChar25 = value;
    }

}
