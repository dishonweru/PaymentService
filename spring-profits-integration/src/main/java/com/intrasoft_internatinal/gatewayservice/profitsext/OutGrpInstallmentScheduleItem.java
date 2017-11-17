
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpInstallmentScheduleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpInstallmentScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpInstallmentScheduleItem", propOrder = {
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn",
    "outGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn",
    "outGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152",
    "outGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152"
})
public class OutGrpInstallmentScheduleItem {

    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn")
    protected short outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152;
    @XmlElement(name = "OutGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152", required = true)
    protected BigDecimal outGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152;

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallCapAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallChargeAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt(XMLGregorianCalendar value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallDt = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallEfteAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallInsurance = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallIntAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallmentAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallN128Amn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn property.
     * 
     */
    public short getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn property.
     * 
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn(short value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSpreadAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoInstallSubsidyAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn() {
        return outGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrmLoanInstallmentInfoRemainingCapitalAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152() {
        return outGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrpSumInstallInsurIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152() {
        return outGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152(BigDecimal value) {
        this.outGrpInstallmentScheduleOutGrpSumComAmnIefSuppliedNumber152 = value;
    }

}
