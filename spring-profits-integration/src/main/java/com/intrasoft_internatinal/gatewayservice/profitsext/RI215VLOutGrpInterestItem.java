
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RI215VLOutGrpInterestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RI215VLOutGrpInterestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpInterestOutGrmLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInterestOutGrmLnsInterestDurationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInterestOutGrmLnsInterestDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInterestOutGrmLnsInterestEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInterestOutGrmLnsInterestFixedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInterestOutGrmLnsInterestForDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInterestOutGrmLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpInterestOutGrmLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpInterestOutGrmPercentageIntScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInterestOutGrmPercentageIntScaleValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpInterestOutGrmTypeInterestDescType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RI215VLOutGrpInterestItem", propOrder = {
    "outGrpInterestOutGrmLnsInterestDescription",
    "outGrpInterestOutGrmLnsInterestDurationInd",
    "outGrpInterestOutGrmLnsInterestDurationUnit",
    "outGrpInterestOutGrmLnsInterestEntryStatus",
    "outGrpInterestOutGrmLnsInterestFixedFlg",
    "outGrpInterestOutGrmLnsInterestForDebit",
    "outGrpInterestOutGrmLnsInterestIdInterest",
    "outGrpInterestOutGrmLnsInterestIntDuration",
    "outGrpInterestOutGrmPercentageIntScalePercentage",
    "outGrpInterestOutGrmPercentageIntScaleValidityDate",
    "outGrpInterestOutGrmTypeInterestDescType"
})
public class RI215VLOutGrpInterestItem {

    @XmlElement(name = "OutGrpInterestOutGrmLnsInterestDescription")
    protected String outGrpInterestOutGrmLnsInterestDescription;
    @XmlElement(name = "OutGrpInterestOutGrmLnsInterestDurationInd")
    protected String outGrpInterestOutGrmLnsInterestDurationInd;
    @XmlElement(name = "OutGrpInterestOutGrmLnsInterestDurationUnit")
    protected String outGrpInterestOutGrmLnsInterestDurationUnit;
    @XmlElement(name = "OutGrpInterestOutGrmLnsInterestEntryStatus")
    protected String outGrpInterestOutGrmLnsInterestEntryStatus;
    @XmlElement(name = "OutGrpInterestOutGrmLnsInterestFixedFlg")
    protected String outGrpInterestOutGrmLnsInterestFixedFlg;
    @XmlElement(name = "OutGrpInterestOutGrmLnsInterestForDebit")
    protected String outGrpInterestOutGrmLnsInterestForDebit;
    @XmlElement(name = "OutGrpInterestOutGrmLnsInterestIdInterest")
    protected int outGrpInterestOutGrmLnsInterestIdInterest;
    @XmlElement(name = "OutGrpInterestOutGrmLnsInterestIntDuration")
    protected short outGrpInterestOutGrmLnsInterestIntDuration;
    @XmlElement(name = "OutGrpInterestOutGrmPercentageIntScalePercentage", required = true)
    protected BigDecimal outGrpInterestOutGrmPercentageIntScalePercentage;
    @XmlElement(name = "OutGrpInterestOutGrmPercentageIntScaleValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpInterestOutGrmPercentageIntScaleValidityDate;
    @XmlElement(name = "OutGrpInterestOutGrmTypeInterestDescType")
    protected String outGrpInterestOutGrmTypeInterestDescType;

    /**
     * Gets the value of the outGrpInterestOutGrmLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInterestOutGrmLnsInterestDescription() {
        return outGrpInterestOutGrmLnsInterestDescription;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInterestOutGrmLnsInterestDescription(String value) {
        this.outGrpInterestOutGrmLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmLnsInterestDurationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInterestOutGrmLnsInterestDurationInd() {
        return outGrpInterestOutGrmLnsInterestDurationInd;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmLnsInterestDurationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInterestOutGrmLnsInterestDurationInd(String value) {
        this.outGrpInterestOutGrmLnsInterestDurationInd = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmLnsInterestDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInterestOutGrmLnsInterestDurationUnit() {
        return outGrpInterestOutGrmLnsInterestDurationUnit;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmLnsInterestDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInterestOutGrmLnsInterestDurationUnit(String value) {
        this.outGrpInterestOutGrmLnsInterestDurationUnit = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmLnsInterestEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInterestOutGrmLnsInterestEntryStatus() {
        return outGrpInterestOutGrmLnsInterestEntryStatus;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmLnsInterestEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInterestOutGrmLnsInterestEntryStatus(String value) {
        this.outGrpInterestOutGrmLnsInterestEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmLnsInterestFixedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInterestOutGrmLnsInterestFixedFlg() {
        return outGrpInterestOutGrmLnsInterestFixedFlg;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmLnsInterestFixedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInterestOutGrmLnsInterestFixedFlg(String value) {
        this.outGrpInterestOutGrmLnsInterestFixedFlg = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmLnsInterestForDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInterestOutGrmLnsInterestForDebit() {
        return outGrpInterestOutGrmLnsInterestForDebit;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmLnsInterestForDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInterestOutGrmLnsInterestForDebit(String value) {
        this.outGrpInterestOutGrmLnsInterestForDebit = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmLnsInterestIdInterest property.
     * 
     */
    public int getOutGrpInterestOutGrmLnsInterestIdInterest() {
        return outGrpInterestOutGrmLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmLnsInterestIdInterest property.
     * 
     */
    public void setOutGrpInterestOutGrmLnsInterestIdInterest(int value) {
        this.outGrpInterestOutGrmLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmLnsInterestIntDuration property.
     * 
     */
    public short getOutGrpInterestOutGrmLnsInterestIntDuration() {
        return outGrpInterestOutGrmLnsInterestIntDuration;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmLnsInterestIntDuration property.
     * 
     */
    public void setOutGrpInterestOutGrmLnsInterestIntDuration(short value) {
        this.outGrpInterestOutGrmLnsInterestIntDuration = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmPercentageIntScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInterestOutGrmPercentageIntScalePercentage() {
        return outGrpInterestOutGrmPercentageIntScalePercentage;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmPercentageIntScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInterestOutGrmPercentageIntScalePercentage(BigDecimal value) {
        this.outGrpInterestOutGrmPercentageIntScalePercentage = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmPercentageIntScaleValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpInterestOutGrmPercentageIntScaleValidityDate() {
        return outGrpInterestOutGrmPercentageIntScaleValidityDate;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmPercentageIntScaleValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpInterestOutGrmPercentageIntScaleValidityDate(XMLGregorianCalendar value) {
        this.outGrpInterestOutGrmPercentageIntScaleValidityDate = value;
    }

    /**
     * Gets the value of the outGrpInterestOutGrmTypeInterestDescType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInterestOutGrmTypeInterestDescType() {
        return outGrpInterestOutGrmTypeInterestDescType;
    }

    /**
     * Sets the value of the outGrpInterestOutGrmTypeInterestDescType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInterestOutGrmTypeInterestDescType(String value) {
        this.outGrpInterestOutGrmTypeInterestDescType = value;
    }

}
