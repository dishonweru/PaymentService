
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpGraceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpGraceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpGraceItem", propOrder = {
    "outGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn",
    "outGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt",
    "outGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance",
    "outGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn",
    "outGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn",
    "outGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn",
    "outGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn",
    "outGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152",
    "outGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn"
})
public class OutGrpGraceItem {

    @XmlElement(name = "OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn", required = true)
    protected BigDecimal outGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn;
    @XmlElement(name = "OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt;
    @XmlElement(name = "OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance", required = true)
    protected BigDecimal outGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance;
    @XmlElement(name = "OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn", required = true)
    protected BigDecimal outGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn;
    @XmlElement(name = "OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn", required = true)
    protected BigDecimal outGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn;
    @XmlElement(name = "OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn")
    protected short outGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn;
    @XmlElement(name = "OutGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn", required = true)
    protected BigDecimal outGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn;
    @XmlElement(name = "OutGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152", required = true)
    protected BigDecimal outGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152;
    @XmlElement(name = "OutGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn", required = true)
    protected BigDecimal outGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn;

    /**
     * Gets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn() {
        return outGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn;
    }

    /**
     * Sets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn(BigDecimal value) {
        this.outGrpGraceOutGrmGraceLoanInstallmentInfoInstallChargeAmn = value;
    }

    /**
     * Gets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt() {
        return outGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt;
    }

    /**
     * Sets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt(XMLGregorianCalendar value) {
        this.outGrpGraceOutGrmGraceLoanInstallmentInfoInstallDt = value;
    }

    /**
     * Gets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance() {
        return outGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance;
    }

    /**
     * Sets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance(BigDecimal value) {
        this.outGrpGraceOutGrmGraceLoanInstallmentInfoInstallInsurance = value;
    }

    /**
     * Gets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn() {
        return outGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn;
    }

    /**
     * Sets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn(BigDecimal value) {
        this.outGrpGraceOutGrmGraceLoanInstallmentInfoInstallmentAmn = value;
    }

    /**
     * Gets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn() {
        return outGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn;
    }

    /**
     * Sets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn(BigDecimal value) {
        this.outGrpGraceOutGrmGraceLoanInstallmentInfoInstallN128Amn = value;
    }

    /**
     * Gets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn property.
     * 
     */
    public short getOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn() {
        return outGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn;
    }

    /**
     * Sets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn property.
     * 
     */
    public void setOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn(short value) {
        this.outGrpGraceOutGrmGraceLoanInstallmentInfoInstallSn = value;
    }

    /**
     * Gets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn() {
        return outGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn;
    }

    /**
     * Sets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn(BigDecimal value) {
        this.outGrpGraceOutGrmGraceLoanInstallmentInfoRemainingCapitalAmn = value;
    }

    /**
     * Gets the value of the outGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152() {
        return outGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152(BigDecimal value) {
        this.outGrpGraceOutGrmGraceInstallAndInsurIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn() {
        return outGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn;
    }

    /**
     * Sets the value of the outGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn(BigDecimal value) {
        this.outGrpGraceOutGrmGraceLoanInstallmentInfoInstallComAmn = value;
    }

}
