
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem", propOrder = {
    "inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId",
    "inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName",
    "inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage"
})
public class InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem {

    @XmlElement(name = "InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId")
    protected int inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId;
    @XmlElement(name = "InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName")
    protected String inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName;
    @XmlElement(name = "InCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage", required = true)
    protected BigDecimal inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage;

    /**
     * Gets the value of the inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId property.
     * 
     */
    public int getInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId() {
        return inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId;
    }

    /**
     * Sets the value of the inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId property.
     * 
     */
    public void setInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId(int value) {
        this.inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustId = value;
    }

    /**
     * Gets the value of the inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName() {
        return inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName;
    }

    /**
     * Sets the value of the inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName(String value) {
        this.inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsCustName = value;
    }

    /**
     * Gets the value of the inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage() {
        return inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage;
    }

    /**
     * Sets the value of the inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage(BigDecimal value) {
        this.inCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsLoadingPercentage = value;
    }

}
