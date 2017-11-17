
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpSendCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpSendCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSendCollectionOutGrmRepCollectionAccountingBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSendCollectionOutGrmRepCollectionDateSend" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpSendCollectionOutGrmRepCollectionInstalmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSendCollectionOutGrmRepCollectionLastPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSendCollectionOutGrmRepCollectionLastPaymentDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSendCollectionOutGrmRepCollectionUnpaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpSendCollection", propOrder = {
    "outGrpSendCollectionOutGrmRepCollectionAccountingBal",
    "outGrpSendCollectionOutGrmRepCollectionDateSend",
    "outGrpSendCollectionOutGrmRepCollectionInstalmentAmount",
    "outGrpSendCollectionOutGrmRepCollectionLastPaymentAmount",
    "outGrpSendCollectionOutGrmRepCollectionLastPaymentDt",
    "outGrpSendCollectionOutGrmRepCollectionUnpaidAmount",
    "outGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo"
})
public class OutGrpSendCollection {

    @XmlElement(name = "OutGrpSendCollectionOutGrmRepCollectionAccountingBal", required = true)
    protected BigDecimal outGrpSendCollectionOutGrmRepCollectionAccountingBal;
    @XmlElement(name = "OutGrpSendCollectionOutGrmRepCollectionDateSend", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpSendCollectionOutGrmRepCollectionDateSend;
    @XmlElement(name = "OutGrpSendCollectionOutGrmRepCollectionInstalmentAmount", required = true)
    protected BigDecimal outGrpSendCollectionOutGrmRepCollectionInstalmentAmount;
    @XmlElement(name = "OutGrpSendCollectionOutGrmRepCollectionLastPaymentAmount", required = true)
    protected BigDecimal outGrpSendCollectionOutGrmRepCollectionLastPaymentAmount;
    @XmlElement(name = "OutGrpSendCollectionOutGrmRepCollectionLastPaymentDt")
    protected String outGrpSendCollectionOutGrmRepCollectionLastPaymentDt;
    @XmlElement(name = "OutGrpSendCollectionOutGrmRepCollectionUnpaidAmount", required = true)
    protected BigDecimal outGrpSendCollectionOutGrmRepCollectionUnpaidAmount;
    @XmlElement(name = "OutGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo")
    protected short outGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo;

    /**
     * Gets the value of the outGrpSendCollectionOutGrmRepCollectionAccountingBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSendCollectionOutGrmRepCollectionAccountingBal() {
        return outGrpSendCollectionOutGrmRepCollectionAccountingBal;
    }

    /**
     * Sets the value of the outGrpSendCollectionOutGrmRepCollectionAccountingBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSendCollectionOutGrmRepCollectionAccountingBal(BigDecimal value) {
        this.outGrpSendCollectionOutGrmRepCollectionAccountingBal = value;
    }

    /**
     * Gets the value of the outGrpSendCollectionOutGrmRepCollectionDateSend property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpSendCollectionOutGrmRepCollectionDateSend() {
        return outGrpSendCollectionOutGrmRepCollectionDateSend;
    }

    /**
     * Sets the value of the outGrpSendCollectionOutGrmRepCollectionDateSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpSendCollectionOutGrmRepCollectionDateSend(XMLGregorianCalendar value) {
        this.outGrpSendCollectionOutGrmRepCollectionDateSend = value;
    }

    /**
     * Gets the value of the outGrpSendCollectionOutGrmRepCollectionInstalmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSendCollectionOutGrmRepCollectionInstalmentAmount() {
        return outGrpSendCollectionOutGrmRepCollectionInstalmentAmount;
    }

    /**
     * Sets the value of the outGrpSendCollectionOutGrmRepCollectionInstalmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSendCollectionOutGrmRepCollectionInstalmentAmount(BigDecimal value) {
        this.outGrpSendCollectionOutGrmRepCollectionInstalmentAmount = value;
    }

    /**
     * Gets the value of the outGrpSendCollectionOutGrmRepCollectionLastPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSendCollectionOutGrmRepCollectionLastPaymentAmount() {
        return outGrpSendCollectionOutGrmRepCollectionLastPaymentAmount;
    }

    /**
     * Sets the value of the outGrpSendCollectionOutGrmRepCollectionLastPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSendCollectionOutGrmRepCollectionLastPaymentAmount(BigDecimal value) {
        this.outGrpSendCollectionOutGrmRepCollectionLastPaymentAmount = value;
    }

    /**
     * Gets the value of the outGrpSendCollectionOutGrmRepCollectionLastPaymentDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSendCollectionOutGrmRepCollectionLastPaymentDt() {
        return outGrpSendCollectionOutGrmRepCollectionLastPaymentDt;
    }

    /**
     * Sets the value of the outGrpSendCollectionOutGrmRepCollectionLastPaymentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSendCollectionOutGrmRepCollectionLastPaymentDt(String value) {
        this.outGrpSendCollectionOutGrmRepCollectionLastPaymentDt = value;
    }

    /**
     * Gets the value of the outGrpSendCollectionOutGrmRepCollectionUnpaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSendCollectionOutGrmRepCollectionUnpaidAmount() {
        return outGrpSendCollectionOutGrmRepCollectionUnpaidAmount;
    }

    /**
     * Sets the value of the outGrpSendCollectionOutGrmRepCollectionUnpaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSendCollectionOutGrmRepCollectionUnpaidAmount(BigDecimal value) {
        this.outGrpSendCollectionOutGrmRepCollectionUnpaidAmount = value;
    }

    /**
     * Gets the value of the outGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo property.
     * 
     */
    public short getOutGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo() {
        return outGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo;
    }

    /**
     * Sets the value of the outGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo property.
     * 
     */
    public void setOutGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo(short value) {
        this.outGrpSendCollectionOutGrmRepCollectionUnpaidInstalmentNo = value;
    }

}
