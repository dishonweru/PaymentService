
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpAnnual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpAnnual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpAnnual", propOrder = {
    "outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn",
    "outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt",
    "outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear",
    "outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn",
    "outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt",
    "outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn"
})
public class OutGrpAnnual {

    @XmlElement(name = "OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn", required = true)
    protected BigDecimal outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn;
    @XmlElement(name = "OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt;
    @XmlElement(name = "OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear")
    protected short outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear;
    @XmlElement(name = "OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn", required = true)
    protected BigDecimal outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn;
    @XmlElement(name = "OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt;
    @XmlElement(name = "OutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn")
    protected short outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn;

    /**
     * Gets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn() {
        return outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn;
    }

    /**
     * Sets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn(BigDecimal value) {
        this.outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationAnnualCapAmn = value;
    }

    /**
     * Gets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt() {
        return outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt;
    }

    /**
     * Sets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt(XMLGregorianCalendar value) {
        this.outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationEndDt = value;
    }

    /**
     * Gets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear property.
     * 
     */
    public short getOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear() {
        return outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear;
    }

    /**
     * Sets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear property.
     * 
     */
    public void setOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear(short value) {
        this.outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationInstallPerYear = value;
    }

    /**
     * Gets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn() {
        return outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn;
    }

    /**
     * Sets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn(BigDecimal value) {
        this.outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationRemainingCapAmn = value;
    }

    /**
     * Gets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt() {
        return outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt;
    }

    /**
     * Sets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt(XMLGregorianCalendar value) {
        this.outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationStartDt = value;
    }

    /**
     * Gets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn property.
     * 
     */
    public short getOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn() {
        return outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn;
    }

    /**
     * Sets the value of the outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn property.
     * 
     */
    public void setOutGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn(short value) {
        this.outGrpAnnualOutGrmAnnualTunnelAnnualAmortizationYearSn = value;
    }

}
