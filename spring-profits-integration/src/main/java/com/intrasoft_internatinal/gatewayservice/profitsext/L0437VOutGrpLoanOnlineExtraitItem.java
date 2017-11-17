
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0437VOutGrpLoanOnlineExtraitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0437VOutGrpLoanOnlineExtraitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmCharSuppliedChar14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0437VOutGrpLoanOnlineExtraitItem", propOrder = {
    "outGrpLoanOnlineExtraitOutGrmCharSuppliedChar14",
    "outGrpLoanOnlineExtraitOutGrmCharSuppliedChar20",
    "outGrpLoanOnlineExtraitOutGrmCharSuppliedChar40",
    "outGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount",
    "outGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount",
    "outGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription",
    "outGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar",
    "outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode",
    "outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate",
    "outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt",
    "outGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount",
    "outGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount",
    "outGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40"
})
public class L0437VOutGrpLoanOnlineExtraitItem {

    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmCharSuppliedChar14")
    protected String outGrpLoanOnlineExtraitOutGrmCharSuppliedChar14;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmCharSuppliedChar20")
    protected String outGrpLoanOnlineExtraitOutGrmCharSuppliedChar20;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmCharSuppliedChar40")
    protected String outGrpLoanOnlineExtraitOutGrmCharSuppliedChar40;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount", required = true)
    protected BigDecimal outGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount", required = true)
    protected BigDecimal outGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription")
    protected String outGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar")
    protected String outGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode")
    protected int outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount", required = true)
    protected BigDecimal outGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount", required = true)
    protected BigDecimal outGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount;
    @XmlElement(name = "OutGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40")
    protected String outGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40;

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmCharSuppliedChar14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanOnlineExtraitOutGrmCharSuppliedChar14() {
        return outGrpLoanOnlineExtraitOutGrmCharSuppliedChar14;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmCharSuppliedChar14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmCharSuppliedChar14(String value) {
        this.outGrpLoanOnlineExtraitOutGrmCharSuppliedChar14 = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanOnlineExtraitOutGrmCharSuppliedChar20() {
        return outGrpLoanOnlineExtraitOutGrmCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmCharSuppliedChar20(String value) {
        this.outGrpLoanOnlineExtraitOutGrmCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanOnlineExtraitOutGrmCharSuppliedChar40() {
        return outGrpLoanOnlineExtraitOutGrmCharSuppliedChar40;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmCharSuppliedChar40(String value) {
        this.outGrpLoanOnlineExtraitOutGrmCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount() {
        return outGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount(BigDecimal value) {
        this.outGrpLoanOnlineExtraitOutGrmCrIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount() {
        return outGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount(BigDecimal value) {
        this.outGrpLoanOnlineExtraitOutGrmDbIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription() {
        return outGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription(String value) {
        this.outGrpLoanOnlineExtraitOutGrmDetailInfoIefSuppliedDescription = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar() {
        return outGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpLoanOnlineExtraitOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode property.
     * 
     */
    public int getOutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode() {
        return outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode property.
     * 
     */
    public void setOutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode(int value) {
        this.outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTransactionCode = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate() {
        return outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate(XMLGregorianCalendar value) {
        this.outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitTrxDate = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt() {
        return outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt(XMLGregorianCalendar value) {
        this.outGrpLoanOnlineExtraitOutGrmLoanAccountExtraitValeurDt = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount() {
        return outGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount(BigDecimal value) {
        this.outGrpLoanOnlineExtraitOutGrmNewLineBalIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount() {
        return outGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount(BigDecimal value) {
        this.outGrpLoanOnlineExtraitOutGrmNewLineOvBalIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40() {
        return outGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40(String value) {
        this.outGrpLoanOnlineExtraitOutGrmTransIefSuppliedChar40 = value;
    }

}
