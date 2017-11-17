
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
 *         &lt;element name="BIP001V_BulkloadinstructionsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BIP001VBulkloadinstructionsExport" minOccurs="0"/>
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
    "bip001VBulkloadinstructionsResult"
})
@XmlRootElement(name = "BIP001V_BulkloadinstructionsResponse")
public class BIP001VBulkloadinstructionsResponse {

    @XmlElement(name = "BIP001V_BulkloadinstructionsResult")
    protected BIP001VBulkloadinstructionsExport bip001VBulkloadinstructionsResult;

    /**
     * Gets the value of the bip001VBulkloadinstructionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link BIP001VBulkloadinstructionsExport }
     *     
     */
    public BIP001VBulkloadinstructionsExport getBIP001VBulkloadinstructionsResult() {
        return bip001VBulkloadinstructionsResult;
    }

    /**
     * Sets the value of the bip001VBulkloadinstructionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BIP001VBulkloadinstructionsExport }
     *     
     */
    public void setBIP001VBulkloadinstructionsResult(BIP001VBulkloadinstructionsExport value) {
        this.bip001VBulkloadinstructionsResult = value;
    }

}
