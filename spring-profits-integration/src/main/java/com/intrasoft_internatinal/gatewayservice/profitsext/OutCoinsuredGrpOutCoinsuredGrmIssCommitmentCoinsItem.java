
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem", propOrder = {
    "outCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId"
})
public class OutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem {

    @XmlElement(name = "OutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId")
    protected int outCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId;

    /**
     * Gets the value of the outCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId property.
     * 
     */
    public int getOutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId() {
        return outCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId;
    }

    /**
     * Sets the value of the outCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId property.
     * 
     */
    public void setOutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId(int value) {
        this.outCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsCustId = value;
    }

}
