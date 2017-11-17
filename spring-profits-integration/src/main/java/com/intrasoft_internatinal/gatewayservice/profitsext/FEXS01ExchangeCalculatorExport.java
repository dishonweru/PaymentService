
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FEXS01_ExchangeCalculatorExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01_ExchangeCalculatorExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBoughtAmountIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSoldAmountIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFinalRateIefSuppliedSourceRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkDatetimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01_ExchangeCalculatorExport", propOrder = {
    "outBoughtAmountIefSuppliedPayableAmount",
    "outSoldAmountIefSuppliedPayableAmount",
    "outFinalRateIefSuppliedSourceRate",
    "outStatusIefSuppliedSrvStatus",
    "outStatusIefSuppliedActionEntryDesc",
    "outSuccessfulTransactionWorkTunInternalSn",
    "outSuccessfulTransactionWorkTrxUnit",
    "outSuccessfulTransactionWorkTrxDate",
    "outSuccessfulTransactionWorkTrxUser",
    "outSuccessfulTransactionWorkTrxUsrSn",
    "outSuccessfulTransactionWorkDatetimestamp",
    "outSuccessfulTransactionWorkAdviceTitle",
    "outSuccessfulTransactionWorkAdviceCounter"
})
public class FEXS01ExchangeCalculatorExport
    extends BaseExport
{

    @XmlElement(name = "OutBoughtAmountIefSuppliedPayableAmount", required = true)
    protected BigDecimal outBoughtAmountIefSuppliedPayableAmount;
    @XmlElement(name = "OutSoldAmountIefSuppliedPayableAmount", required = true)
    protected BigDecimal outSoldAmountIefSuppliedPayableAmount;
    @XmlElement(name = "OutFinalRateIefSuppliedSourceRate", required = true)
    protected BigDecimal outFinalRateIefSuppliedSourceRate;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutSuccessfulTransactionWorkTunInternalSn")
    protected short outSuccessfulTransactionWorkTunInternalSn;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxUnit")
    protected int outSuccessfulTransactionWorkTrxUnit;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuccessfulTransactionWorkTrxDate;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxUser")
    protected String outSuccessfulTransactionWorkTrxUser;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxUsrSn")
    protected int outSuccessfulTransactionWorkTrxUsrSn;
    @XmlElement(name = "OutSuccessfulTransactionWorkDatetimestamp")
    protected String outSuccessfulTransactionWorkDatetimestamp;
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceTitle")
    protected String outSuccessfulTransactionWorkAdviceTitle;
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceCounter")
    protected int outSuccessfulTransactionWorkAdviceCounter;

    /**
     * Gets the value of the outBoughtAmountIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBoughtAmountIefSuppliedPayableAmount() {
        return outBoughtAmountIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the outBoughtAmountIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBoughtAmountIefSuppliedPayableAmount(BigDecimal value) {
        this.outBoughtAmountIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the outSoldAmountIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSoldAmountIefSuppliedPayableAmount() {
        return outSoldAmountIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the outSoldAmountIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSoldAmountIefSuppliedPayableAmount(BigDecimal value) {
        this.outSoldAmountIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the outFinalRateIefSuppliedSourceRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFinalRateIefSuppliedSourceRate() {
        return outFinalRateIefSuppliedSourceRate;
    }

    /**
     * Sets the value of the outFinalRateIefSuppliedSourceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFinalRateIefSuppliedSourceRate(BigDecimal value) {
        this.outFinalRateIefSuppliedSourceRate = value;
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
     * Gets the value of the outSuccessfulTransactionWorkTunInternalSn property.
     * 
     */
    public short getOutSuccessfulTransactionWorkTunInternalSn() {
        return outSuccessfulTransactionWorkTunInternalSn;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTunInternalSn property.
     * 
     */
    public void setOutSuccessfulTransactionWorkTunInternalSn(short value) {
        this.outSuccessfulTransactionWorkTunInternalSn = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxUnit property.
     * 
     */
    public int getOutSuccessfulTransactionWorkTrxUnit() {
        return outSuccessfulTransactionWorkTrxUnit;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxUnit property.
     * 
     */
    public void setOutSuccessfulTransactionWorkTrxUnit(int value) {
        this.outSuccessfulTransactionWorkTrxUnit = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuccessfulTransactionWorkTrxDate() {
        return outSuccessfulTransactionWorkTrxDate;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuccessfulTransactionWorkTrxDate(XMLGregorianCalendar value) {
        this.outSuccessfulTransactionWorkTrxDate = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkTrxUser() {
        return outSuccessfulTransactionWorkTrxUser;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkTrxUser(String value) {
        this.outSuccessfulTransactionWorkTrxUser = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public int getOutSuccessfulTransactionWorkTrxUsrSn() {
        return outSuccessfulTransactionWorkTrxUsrSn;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public void setOutSuccessfulTransactionWorkTrxUsrSn(int value) {
        this.outSuccessfulTransactionWorkTrxUsrSn = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkDatetimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkDatetimestamp() {
        return outSuccessfulTransactionWorkDatetimestamp;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkDatetimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkDatetimestamp(String value) {
        this.outSuccessfulTransactionWorkDatetimestamp = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkAdviceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkAdviceTitle() {
        return outSuccessfulTransactionWorkAdviceTitle;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkAdviceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkAdviceTitle(String value) {
        this.outSuccessfulTransactionWorkAdviceTitle = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public int getOutSuccessfulTransactionWorkAdviceCounter() {
        return outSuccessfulTransactionWorkAdviceCounter;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public void setOutSuccessfulTransactionWorkAdviceCounter(int value) {
        this.outSuccessfulTransactionWorkAdviceCounter = value;
    }

}
