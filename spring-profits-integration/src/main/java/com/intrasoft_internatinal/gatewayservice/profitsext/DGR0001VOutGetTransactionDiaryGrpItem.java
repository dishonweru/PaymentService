
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DGR0001VOutGetTransactionDiaryGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DGR0001VOutGetTransactionDiaryGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DGR0001VOutGetTransactionDiaryGrpItem", propOrder = {
    "outGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription",
    "outGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40",
    "outGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40",
    "outGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40",
    "outGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40",
    "outGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber",
    "outGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName",
    "outGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber",
    "outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter",
    "outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom",
    "outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom",
    "outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate",
    "outGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter"
})
public class DGR0001VOutGetTransactionDiaryGrpItem {

    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription")
    protected String outGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40")
    protected String outGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40")
    protected String outGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40")
    protected String outGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40")
    protected String outGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber")
    protected String outGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName")
    protected String outGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber")
    protected String outGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter")
    protected double outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom", required = true)
    protected BigDecimal outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom", required = true)
    protected BigDecimal outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate;
    @XmlElement(name = "OutGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter")
    protected double outGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter;

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription() {
        return outGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription(String value) {
        this.outGetTransactionDiaryGrpOutGrmDistributionChannelDistrChannelDescription = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40() {
        return outGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40(String value) {
        this.outGetTransactionDiaryGrpOutGrmDistrictCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40() {
        return outGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40(String value) {
        this.outGetTransactionDiaryGrpOutGrmLocationCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40() {
        return outGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40(String value) {
        this.outGetTransactionDiaryGrpOutGrmRegionCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40() {
        return outGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40(String value) {
        this.outGetTransactionDiaryGrpOutGrmSublocationCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber() {
        return outGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber(String value) {
        this.outGetTransactionDiaryGrpOutGrmUserTransactionDiaryDestAccNumber = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName() {
        return outGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName(String value) {
        this.outGetTransactionDiaryGrpOutGrmUserTransactionDiaryServiceName = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber() {
        return outGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber(String value) {
        this.outGetTransactionDiaryGrpOutGrmUserTransactionDiaryPrftAccountNumber = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter property.
     * 
     */
    public double getOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter() {
        return outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter property.
     * 
     */
    public void setOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter(double value) {
        this.outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraCounter = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom() {
        return outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom(BigDecimal value) {
        this.outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraComAmnDom = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom() {
        return outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom(BigDecimal value) {
        this.outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTraTrxAmnDom = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate() {
        return outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate(XMLGregorianCalendar value) {
        this.outGetTransactionDiaryGrpOutGrmUserTransactionDiaryTrxDate = value;
    }

    /**
     * Gets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter property.
     * 
     */
    public double getOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter() {
        return outGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter property.
     * 
     */
    public void setOutGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter(double value) {
        this.outGetTransactionDiaryGrpOutGrmUserTransactionDiaryOrigTraCounter = value;
    }

}
