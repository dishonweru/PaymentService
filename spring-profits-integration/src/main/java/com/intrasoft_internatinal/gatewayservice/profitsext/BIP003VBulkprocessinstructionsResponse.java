
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
 *         &lt;element name="BIP003V_BulkprocessinstructionsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BIP003VBulkprocessinstructionsExport" minOccurs="0"/>
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
    "bip003VBulkprocessinstructionsResult"
})
@XmlRootElement(name = "BIP003V_BulkprocessinstructionsResponse")
public class BIP003VBulkprocessinstructionsResponse {

    @XmlElement(name = "BIP003V_BulkprocessinstructionsResult")
    protected BIP003VBulkprocessinstructionsExport bip003VBulkprocessinstructionsResult;

    /**
     * Gets the value of the bip003VBulkprocessinstructionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link BIP003VBulkprocessinstructionsExport }
     *     
     */
    public BIP003VBulkprocessinstructionsExport getBIP003VBulkprocessinstructionsResult() {
        return bip003VBulkprocessinstructionsResult;
    }

    /**
     * Sets the value of the bip003VBulkprocessinstructionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BIP003VBulkprocessinstructionsExport }
     *     
     */
    public void setBIP003VBulkprocessinstructionsResult(BIP003VBulkprocessinstructionsExport value) {
        this.bip003VBulkprocessinstructionsResult = value;
    }

}
