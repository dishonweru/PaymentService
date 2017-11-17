
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0437VOutGrpIssuanceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0437VOutGrpIssuanceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpIssuanceOutGrmIssPrdProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0437VOutGrpIssuanceItem", propOrder = {
    "outGrpIssuanceOutGrmIssPrdProductDescription",
    "outGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt"
})
public class L0437VOutGrpIssuanceItem {

    @XmlElement(name = "OutGrpIssuanceOutGrmIssPrdProductDescription")
    protected String outGrpIssuanceOutGrmIssPrdProductDescription;
    @XmlElement(name = "OutGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt", required = true)
    protected BigDecimal outGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt;

    /**
     * Gets the value of the outGrpIssuanceOutGrmIssPrdProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIssuanceOutGrmIssPrdProductDescription() {
        return outGrpIssuanceOutGrmIssPrdProductDescription;
    }

    /**
     * Sets the value of the outGrpIssuanceOutGrmIssPrdProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIssuanceOutGrmIssPrdProductDescription(String value) {
        this.outGrpIssuanceOutGrmIssPrdProductDescription = value;
    }

    /**
     * Gets the value of the outGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt() {
        return outGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt;
    }

    /**
     * Sets the value of the outGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt(BigDecimal value) {
        this.outGrpIssuanceOutGrmIssRemainIssPremiumCalcRemainingAmnt = value;
    }

}
