
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportMessageAlertExtItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportMessageAlertExtItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RowUniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniqueMessageId" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportMessageAlertExtItem", propOrder = {
    "rowUniqueId",
    "uniqueMessageId"
})
public class ExportMessageAlertExtItem {

    @XmlElement(name = "RowUniqueId")
    protected int rowUniqueId;
    @XmlElement(name = "UniqueMessageId", required = true)
    protected BigDecimal uniqueMessageId;

    /**
     * Gets the value of the rowUniqueId property.
     * 
     */
    public int getRowUniqueId() {
        return rowUniqueId;
    }

    /**
     * Sets the value of the rowUniqueId property.
     * 
     */
    public void setRowUniqueId(int value) {
        this.rowUniqueId = value;
    }

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
