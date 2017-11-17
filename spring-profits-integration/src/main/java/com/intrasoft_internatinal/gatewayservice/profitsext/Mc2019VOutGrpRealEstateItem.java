
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2019VOutGrpRealEstateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2019VOutGrpRealEstateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpRealEstateOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRealEstateAgreementValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRealEstateEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRealEstateInsOriginalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRealEstateLandRegistId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRealEstateRealEstateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRealEstateRealEstateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2019VOutGrpRealEstateItem", propOrder = {
    "outGrpRealEstateOutGrmIefSuppliedSelectChar",
    "outGrpRealEstateOutGrmRealEstateAgreementValue",
    "outGrpRealEstateOutGrmRealEstateEntryStatus",
    "outGrpRealEstateOutGrmRealEstateId",
    "outGrpRealEstateOutGrmRealEstateInsOriginalAmn",
    "outGrpRealEstateOutGrmRealEstateLandRegistId",
    "outGrpRealEstateOutGrmRealEstateRealEstateDesc",
    "outGrpRealEstateOutGrmRealEstateRealEstateType"
})
public class Mc2019VOutGrpRealEstateItem {

    @XmlElement(name = "OutGrpRealEstateOutGrmIefSuppliedSelectChar")
    protected String outGrpRealEstateOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpRealEstateOutGrmRealEstateAgreementValue", required = true)
    protected BigDecimal outGrpRealEstateOutGrmRealEstateAgreementValue;
    @XmlElement(name = "OutGrpRealEstateOutGrmRealEstateEntryStatus")
    protected String outGrpRealEstateOutGrmRealEstateEntryStatus;
    @XmlElement(name = "OutGrpRealEstateOutGrmRealEstateId")
    protected double outGrpRealEstateOutGrmRealEstateId;
    @XmlElement(name = "OutGrpRealEstateOutGrmRealEstateInsOriginalAmn", required = true)
    protected BigDecimal outGrpRealEstateOutGrmRealEstateInsOriginalAmn;
    @XmlElement(name = "OutGrpRealEstateOutGrmRealEstateLandRegistId")
    protected String outGrpRealEstateOutGrmRealEstateLandRegistId;
    @XmlElement(name = "OutGrpRealEstateOutGrmRealEstateRealEstateDesc")
    protected String outGrpRealEstateOutGrmRealEstateRealEstateDesc;
    @XmlElement(name = "OutGrpRealEstateOutGrmRealEstateRealEstateType")
    protected String outGrpRealEstateOutGrmRealEstateRealEstateType;

    /**
     * Gets the value of the outGrpRealEstateOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmIefSuppliedSelectChar() {
        return outGrpRealEstateOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpRealEstateOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRealEstateAgreementValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpRealEstateOutGrmRealEstateAgreementValue() {
        return outGrpRealEstateOutGrmRealEstateAgreementValue;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRealEstateAgreementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpRealEstateOutGrmRealEstateAgreementValue(BigDecimal value) {
        this.outGrpRealEstateOutGrmRealEstateAgreementValue = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRealEstateEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmRealEstateEntryStatus() {
        return outGrpRealEstateOutGrmRealEstateEntryStatus;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRealEstateEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmRealEstateEntryStatus(String value) {
        this.outGrpRealEstateOutGrmRealEstateEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRealEstateId property.
     * 
     */
    public double getOutGrpRealEstateOutGrmRealEstateId() {
        return outGrpRealEstateOutGrmRealEstateId;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRealEstateId property.
     * 
     */
    public void setOutGrpRealEstateOutGrmRealEstateId(double value) {
        this.outGrpRealEstateOutGrmRealEstateId = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRealEstateInsOriginalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpRealEstateOutGrmRealEstateInsOriginalAmn() {
        return outGrpRealEstateOutGrmRealEstateInsOriginalAmn;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRealEstateInsOriginalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpRealEstateOutGrmRealEstateInsOriginalAmn(BigDecimal value) {
        this.outGrpRealEstateOutGrmRealEstateInsOriginalAmn = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRealEstateLandRegistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmRealEstateLandRegistId() {
        return outGrpRealEstateOutGrmRealEstateLandRegistId;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRealEstateLandRegistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmRealEstateLandRegistId(String value) {
        this.outGrpRealEstateOutGrmRealEstateLandRegistId = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRealEstateRealEstateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmRealEstateRealEstateDesc() {
        return outGrpRealEstateOutGrmRealEstateRealEstateDesc;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRealEstateRealEstateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmRealEstateRealEstateDesc(String value) {
        this.outGrpRealEstateOutGrmRealEstateRealEstateDesc = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRealEstateRealEstateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmRealEstateRealEstateType() {
        return outGrpRealEstateOutGrmRealEstateRealEstateType;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRealEstateRealEstateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmRealEstateRealEstateType(String value) {
        this.outGrpRealEstateOutGrmRealEstateRealEstateType = value;
    }

}
