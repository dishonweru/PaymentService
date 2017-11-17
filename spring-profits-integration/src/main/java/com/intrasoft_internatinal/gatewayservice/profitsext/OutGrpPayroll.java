
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpPayroll complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpPayroll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgChangeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgChangeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgInstallFixedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgMoratorN128Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgMoratorNrmRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgMoratorSprRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgMoratorSubsRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgPayrollAgrCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgPrepaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPayrollOutGrmLoanInstallChgProcessedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPayrollOutGrmReasonCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpPayroll", propOrder = {
    "outGrpPayrollOutGrmLoanInstallChgChangeDt",
    "outGrpPayrollOutGrmLoanInstallChgChangeReason",
    "outGrpPayrollOutGrmLoanInstallChgInstallFixedAmn",
    "outGrpPayrollOutGrmLoanInstallChgMoratorN128Rate",
    "outGrpPayrollOutGrmLoanInstallChgMoratorNrmRate",
    "outGrpPayrollOutGrmLoanInstallChgMoratorSprRate",
    "outGrpPayrollOutGrmLoanInstallChgMoratorSubsRate",
    "outGrpPayrollOutGrmLoanInstallChgPayrollAgrCode",
    "outGrpPayrollOutGrmLoanInstallChgPrepaymentAmount",
    "outGrpPayrollOutGrmLoanInstallChgProcessedFlg",
    "outGrpPayrollOutGrmReasonCharSuppliedChar20"
})
public class OutGrpPayroll {

    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgChangeDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpPayrollOutGrmLoanInstallChgChangeDt;
    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgChangeReason")
    protected String outGrpPayrollOutGrmLoanInstallChgChangeReason;
    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgInstallFixedAmn", required = true)
    protected BigDecimal outGrpPayrollOutGrmLoanInstallChgInstallFixedAmn;
    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgMoratorN128Rate", required = true)
    protected BigDecimal outGrpPayrollOutGrmLoanInstallChgMoratorN128Rate;
    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgMoratorNrmRate", required = true)
    protected BigDecimal outGrpPayrollOutGrmLoanInstallChgMoratorNrmRate;
    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgMoratorSprRate", required = true)
    protected BigDecimal outGrpPayrollOutGrmLoanInstallChgMoratorSprRate;
    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgMoratorSubsRate", required = true)
    protected BigDecimal outGrpPayrollOutGrmLoanInstallChgMoratorSubsRate;
    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgPayrollAgrCode")
    protected int outGrpPayrollOutGrmLoanInstallChgPayrollAgrCode;
    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgPrepaymentAmount", required = true)
    protected BigDecimal outGrpPayrollOutGrmLoanInstallChgPrepaymentAmount;
    @XmlElement(name = "OutGrpPayrollOutGrmLoanInstallChgProcessedFlg")
    protected String outGrpPayrollOutGrmLoanInstallChgProcessedFlg;
    @XmlElement(name = "OutGrpPayrollOutGrmReasonCharSuppliedChar20")
    protected String outGrpPayrollOutGrmReasonCharSuppliedChar20;

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgChangeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpPayrollOutGrmLoanInstallChgChangeDt() {
        return outGrpPayrollOutGrmLoanInstallChgChangeDt;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgChangeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgChangeDt(XMLGregorianCalendar value) {
        this.outGrpPayrollOutGrmLoanInstallChgChangeDt = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPayrollOutGrmLoanInstallChgChangeReason() {
        return outGrpPayrollOutGrmLoanInstallChgChangeReason;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgChangeReason(String value) {
        this.outGrpPayrollOutGrmLoanInstallChgChangeReason = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgInstallFixedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPayrollOutGrmLoanInstallChgInstallFixedAmn() {
        return outGrpPayrollOutGrmLoanInstallChgInstallFixedAmn;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgInstallFixedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgInstallFixedAmn(BigDecimal value) {
        this.outGrpPayrollOutGrmLoanInstallChgInstallFixedAmn = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgMoratorN128Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPayrollOutGrmLoanInstallChgMoratorN128Rate() {
        return outGrpPayrollOutGrmLoanInstallChgMoratorN128Rate;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgMoratorN128Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgMoratorN128Rate(BigDecimal value) {
        this.outGrpPayrollOutGrmLoanInstallChgMoratorN128Rate = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgMoratorNrmRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPayrollOutGrmLoanInstallChgMoratorNrmRate() {
        return outGrpPayrollOutGrmLoanInstallChgMoratorNrmRate;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgMoratorNrmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgMoratorNrmRate(BigDecimal value) {
        this.outGrpPayrollOutGrmLoanInstallChgMoratorNrmRate = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgMoratorSprRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPayrollOutGrmLoanInstallChgMoratorSprRate() {
        return outGrpPayrollOutGrmLoanInstallChgMoratorSprRate;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgMoratorSprRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgMoratorSprRate(BigDecimal value) {
        this.outGrpPayrollOutGrmLoanInstallChgMoratorSprRate = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgMoratorSubsRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPayrollOutGrmLoanInstallChgMoratorSubsRate() {
        return outGrpPayrollOutGrmLoanInstallChgMoratorSubsRate;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgMoratorSubsRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgMoratorSubsRate(BigDecimal value) {
        this.outGrpPayrollOutGrmLoanInstallChgMoratorSubsRate = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgPayrollAgrCode property.
     * 
     */
    public int getOutGrpPayrollOutGrmLoanInstallChgPayrollAgrCode() {
        return outGrpPayrollOutGrmLoanInstallChgPayrollAgrCode;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgPayrollAgrCode property.
     * 
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgPayrollAgrCode(int value) {
        this.outGrpPayrollOutGrmLoanInstallChgPayrollAgrCode = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgPrepaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPayrollOutGrmLoanInstallChgPrepaymentAmount() {
        return outGrpPayrollOutGrmLoanInstallChgPrepaymentAmount;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgPrepaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgPrepaymentAmount(BigDecimal value) {
        this.outGrpPayrollOutGrmLoanInstallChgPrepaymentAmount = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmLoanInstallChgProcessedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPayrollOutGrmLoanInstallChgProcessedFlg() {
        return outGrpPayrollOutGrmLoanInstallChgProcessedFlg;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmLoanInstallChgProcessedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPayrollOutGrmLoanInstallChgProcessedFlg(String value) {
        this.outGrpPayrollOutGrmLoanInstallChgProcessedFlg = value;
    }

    /**
     * Gets the value of the outGrpPayrollOutGrmReasonCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPayrollOutGrmReasonCharSuppliedChar20() {
        return outGrpPayrollOutGrmReasonCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpPayrollOutGrmReasonCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPayrollOutGrmReasonCharSuppliedChar20(String value) {
        this.outGrpPayrollOutGrmReasonCharSuppliedChar20 = value;
    }

}
