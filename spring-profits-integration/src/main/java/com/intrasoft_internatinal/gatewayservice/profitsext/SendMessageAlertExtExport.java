
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendMessageAlertExtExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendMessageAlertExtExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="UniqueMessageId" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMessageAlertExtExport", propOrder = {
    "uniqueMessageId"
})
public class SendMessageAlertExtExport
    extends BaseExport
{

    @XmlElement(name = "UniqueMessageId", required = true)
    protected BigDecimal uniqueMessageId;

    /**
     * Gets the value of the uniqueMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUniqueMessageId() {
        return uniqueMessageId;
    }

    /**
     * Sets the value of the uniqueMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUniqueMessageId(BigDecimal value) {
        this.uniqueMessageId = value;
    }

}
