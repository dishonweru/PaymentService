
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FTRSC2_InterbankOutgoingOrderValueDateImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTRSC2_InterbankOutgoingOrderValueDateImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAmountIefSuppliedGenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDateIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIntegerIefSuppliedNumber15" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRateIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTextIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTRSC2_InterbankOutgoingOrderValueDateImport", propOrder = {
    "outAmountIefSuppliedGenAmount",
    "outDateIefSuppliedDate",
    "outIntegerIefSuppliedNumber15",
    "outRateIefSuppliedRate",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedSrvStatus",
    "outTextIefSuppliedChar100",
    "outUnitCode"
})
public class FTRSC2InterbankOutgoingOrderValueDateImport
    extends BaseExport
{

    @XmlElement(name = "OutAmountIefSuppliedGenAmount", required = true)
    protected BigDecimal outAmountIefSuppliedGenAmount;
    @XmlElement(name = "OutDateIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDateIefSuppliedDate;
    @XmlElement(name = "OutIntegerIefSuppliedNumber15")
    protected double outIntegerIefSuppliedNumber15;
    @XmlElement(name = "OutRateIefSuppliedRate", required = true)
    protected BigDecimal outRateIefSuppliedRate;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutTextIefSuppliedChar100")
    protected String outTextIefSuppliedChar100;
    @XmlElement(name = "OutUnitCode")
    protected int outUnitCode;

    /**
     * Gets the value of the outAmountIefSuppliedGenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAmountIefSuppliedGenAmount() {
        return outAmountIefSuppliedGenAmount;
    }

    /**
     * Sets the value of the outAmountIefSuppliedGenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAmountIefSuppliedGenAmount(BigDecimal value) {
        this.outAmountIefSuppliedGenAmount = value;
    }

    /**
     * Gets the value of the outDateIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDateIefSuppliedDate() {
        return outDateIefSuppliedDate;
    }

    /**
     * Sets the value of the outDateIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDateIefSuppliedDate(XMLGregorianCalendar value) {
        this.outDateIefSuppliedDate = value;
    }

    /**
     * Gets the value of the outIntegerIefSuppliedNumber15 property.
     * 
     */
    public double getOutIntegerIefSuppliedNumber15() {
        return outIntegerIefSuppliedNumber15;
    }

    /**
     * Sets the value of the outIntegerIefSuppliedNumber15 property.
     * 
     */
    public void setOutIntegerIefSuppliedNumber15(double value) {
        this.outIntegerIefSuppliedNumber15 = value;
    }

    /**
     * Gets the value of the outRateIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateIefSuppliedRate() {
        return outRateIefSuppliedRate;
    }

    /**
     * Sets the value of the outRateIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateIefSuppliedRate(BigDecimal value) {
        this.outRateIefSuppliedRate = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryDesc() {
        return outStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryDesc(String value) {
        this.outStatusIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedSrvStatus() {
        return outStatusIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedSrvStatus(String value) {
        this.outStatusIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outTextIefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTextIefSuppliedChar100() {
        return outTextIefSuppliedChar100;
    }

    /**
     * Sets the value of the outTextIefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTextIefSuppliedChar100(String value) {
        this.outTextIefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outUnitCode property.
     * 
     */
    public int getOutUnitCode() {
        return outUnitCode;
    }

    /**
     * Sets the value of the outUnitCode property.
     * 
     */
    public void setOutUnitCode(int value) {
        this.outUnitCode = value;
    }

}
