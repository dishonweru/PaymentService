
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGrpFlexOmitInstl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpFlexOmitInstl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpFlexOmitInstl", propOrder = {
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn",
    "inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn"
})
public class InGrpFlexOmitInstl {

    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn")
    protected short inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn;
    @XmlElement(name = "InGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn", required = true)
    protected BigDecimal inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn;

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallCapAmn = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallChargeAmn = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt(XMLGregorianCalendar value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallDt = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallEfteAmn = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallInsurance = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallIntAmn = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallmentAmn = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallN128Amn = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn property.
     * 
     */
    public short getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn property.
     * 
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn(short value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSn = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSpreadAmn = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoInstallSubsidyAmn = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn() {
        return inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn(BigDecimal value) {
        this.inGrpFlexOmitInstlInGrmFlexOmitInstlLoanInstallmentInfoRemainingCapitalAmn = value;
    }

}
