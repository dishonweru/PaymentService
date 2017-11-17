
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpInstallments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpInstallments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpInstallments", propOrder = {
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays",
    "outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt",
    "outGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152"
})
public class OutGrpInstallments {

    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn")
    protected int outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg")
    protected String outGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod")
    protected String outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn")
    protected int outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType")
    protected String outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus")
    protected String outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays")
    protected int outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays;
    @XmlElement(name = "OutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt;
    @XmlElement(name = "OutGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152", required = true)
    protected BigDecimal outGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152;

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCapitalAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCostOfOptionAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged(XMLGregorianCalendar value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDateInterChanged = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsDbInterestAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallInsurance = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn property.
     * 
     */
    public int getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn property.
     * 
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn(int value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInstallSn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsInterestAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterestAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsN128InterPerc = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsNormalInterPerc = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg(String value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsOmitedFlg = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRemainCapAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt(XMLGregorianCalendar value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestDt = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod(String value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestPeriod = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn property.
     * 
     */
    public int getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn property.
     * 
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn(int value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestSn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType(String value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRequestType = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRoundingAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSprdInterestAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSpreadInterPerc = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubs2InterestAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidy2InterPerc = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsidyInterPerc = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsSubsInterestAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsCommissionAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsExpenseAmn = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus(String value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqStatus = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt(XMLGregorianCalendar value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqLstPaymentDt = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays property.
     * 
     */
    public int getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays property.
     * 
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays(int value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqOverdueDays = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt() {
        return outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt(BigDecimal value) {
        this.outGrpInstallmentsOutGrpInstallmentLoanInstallmentsRqRemainingAmnt = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152() {
        return outGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152(BigDecimal value) {
        this.outGrpInstallmentsOutGrpSumInstallInsurIefSuppliedNumber152 = value;
    }

}
