
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InCoinsuredGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InCoinsuredGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InCoinsuredGrpItem", propOrder = {
    "inCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate",
    "inCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage"
})
public class InCoinsuredGrpItem {

    @XmlElement(name = "InCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate;
    @XmlElement(name = "InCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage", required = true)
    protected BigDecimal inCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage;

    /**
     * Gets the value of the inCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate() {
        return inCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate;
    }

    /**
     * Sets the value of the inCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate(XMLGregorianCalendar value) {
        this.inCoinsuredGrpInBirthdateCoinsGrmIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage() {
        return inCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage;
    }

    /**
     * Sets the value of the inCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage(BigDecimal value) {
        this.inCoinsuredGrpInGrmIssCommitmentCoinsLoadingPercentage = value;
    }

}
