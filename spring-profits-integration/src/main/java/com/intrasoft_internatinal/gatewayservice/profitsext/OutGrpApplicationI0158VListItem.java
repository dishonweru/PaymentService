
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpApplicationI0158VListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpApplicationI0158VListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationApplicationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationRequestDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpApplicationOutGrmApplicationCustomerApplicationInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpApplicationI0158VListItem", propOrder = {
    "outGrpApplicationOutGrmApplicationUnitUnitCode",
    "outGrpApplicationOutGrmApplicationUnitUnitUnitName",
    "outGrpApplicationOutGrmApplicationCustomerCustId",
    "outGrpApplicationOutGrmApplicationCustomerCDigit",
    "outGrpApplicationOutGrmApplicationCustomerAlertMsg",
    "outGrpApplicationOutGrmApplicationNameListSetDescription",
    "outGrpApplicationOutGrmApplicationCustomerApplicationApplicationId",
    "outGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber",
    "outGrpApplicationOutGrmApplicationCustomerApplicationAccountCd",
    "outGrpApplicationOutGrmApplicationCustomerApplicationApplicationType",
    "outGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts",
    "outGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn",
    "outGrpApplicationOutGrmApplicationCustomerApplicationRequestDt",
    "outGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast",
    "outGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr",
    "outGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts",
    "outGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr",
    "outGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt",
    "outGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts",
    "outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt",
    "outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn",
    "outGrpApplicationOutGrmApplicationCustomerApplicationTmstamp",
    "outGrpApplicationOutGrmApplicationCustomerApplicationInternalSn"
})
public class OutGrpApplicationI0158VListItem {

    @XmlElement(name = "OutGrpApplicationOutGrmApplicationUnitUnitCode")
    protected int outGrpApplicationOutGrmApplicationUnitUnitCode;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationUnitUnitUnitName")
    protected String outGrpApplicationOutGrmApplicationUnitUnitUnitName;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerCustId")
    protected int outGrpApplicationOutGrmApplicationCustomerCustId;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerCDigit")
    protected short outGrpApplicationOutGrmApplicationCustomerCDigit;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerAlertMsg")
    protected String outGrpApplicationOutGrmApplicationCustomerAlertMsg;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationNameListSetDescription")
    protected String outGrpApplicationOutGrmApplicationNameListSetDescription;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationApplicationId")
    protected String outGrpApplicationOutGrmApplicationCustomerApplicationApplicationId;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber")
    protected String outGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationAccountCd")
    protected short outGrpApplicationOutGrmApplicationCustomerApplicationAccountCd;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationApplicationType")
    protected int outGrpApplicationOutGrmApplicationCustomerApplicationApplicationType;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts")
    protected String outGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn", required = true)
    protected BigDecimal outGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationRequestDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpApplicationOutGrmApplicationCustomerApplicationRequestDt;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast")
    protected String outGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr")
    protected String outGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts")
    protected String outGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr")
    protected String outGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts")
    protected String outGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn", required = true)
    protected BigDecimal outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpApplicationOutGrmApplicationCustomerApplicationTmstamp;
    @XmlElement(name = "OutGrpApplicationOutGrmApplicationCustomerApplicationInternalSn")
    protected double outGrpApplicationOutGrmApplicationCustomerApplicationInternalSn;

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationUnitUnitCode property.
     * 
     */
    public int getOutGrpApplicationOutGrmApplicationUnitUnitCode() {
        return outGrpApplicationOutGrmApplicationUnitUnitCode;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationUnitUnitCode property.
     * 
     */
    public void setOutGrpApplicationOutGrmApplicationUnitUnitCode(int value) {
        this.outGrpApplicationOutGrmApplicationUnitUnitCode = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationUnitUnitUnitName() {
        return outGrpApplicationOutGrmApplicationUnitUnitUnitName;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationUnitUnitUnitName(String value) {
        this.outGrpApplicationOutGrmApplicationUnitUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerCustId property.
     * 
     */
    public int getOutGrpApplicationOutGrmApplicationCustomerCustId() {
        return outGrpApplicationOutGrmApplicationCustomerCustId;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerCustId property.
     * 
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerCustId(int value) {
        this.outGrpApplicationOutGrmApplicationCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerCDigit property.
     * 
     */
    public short getOutGrpApplicationOutGrmApplicationCustomerCDigit() {
        return outGrpApplicationOutGrmApplicationCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerCDigit property.
     * 
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerCDigit(short value) {
        this.outGrpApplicationOutGrmApplicationCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationCustomerAlertMsg() {
        return outGrpApplicationOutGrmApplicationCustomerAlertMsg;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerAlertMsg(String value) {
        this.outGrpApplicationOutGrmApplicationCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationNameListSetDescription() {
        return outGrpApplicationOutGrmApplicationNameListSetDescription;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationNameListSetDescription(String value) {
        this.outGrpApplicationOutGrmApplicationNameListSetDescription = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationCustomerApplicationApplicationId() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationApplicationId;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationApplicationId(String value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationApplicationId = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber(String value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationAccountCd property.
     * 
     */
    public short getOutGrpApplicationOutGrmApplicationCustomerApplicationAccountCd() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationAccountCd;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationAccountCd property.
     * 
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationAccountCd(short value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationAccountCd = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationApplicationType property.
     * 
     */
    public int getOutGrpApplicationOutGrmApplicationCustomerApplicationApplicationType() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationApplicationType;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationApplicationType property.
     * 
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationApplicationType(int value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationApplicationType = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts(String value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationApplicationSts = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn(BigDecimal value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationRequestAmn = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpApplicationOutGrmApplicationCustomerApplicationRequestDt() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationRequestDt;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationRequestDt(XMLGregorianCalendar value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationRequestDt = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast(String value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationRequestForecast = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr(String value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationInsertUsr = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts(String value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationInsertCmnts = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr(String value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationConfirmUsr = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt(XMLGregorianCalendar value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationConfirmDt = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts(String value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationConfirmCmnts = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt(XMLGregorianCalendar value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownDt = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn(BigDecimal value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationDrawdownAmn = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpApplicationOutGrmApplicationCustomerApplicationTmstamp() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationTmstamp;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationTmstamp(XMLGregorianCalendar value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationTmstamp = value;
    }

    /**
     * Gets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationInternalSn property.
     * 
     */
    public double getOutGrpApplicationOutGrmApplicationCustomerApplicationInternalSn() {
        return outGrpApplicationOutGrmApplicationCustomerApplicationInternalSn;
    }

    /**
     * Sets the value of the outGrpApplicationOutGrmApplicationCustomerApplicationInternalSn property.
     * 
     */
    public void setOutGrpApplicationOutGrmApplicationCustomerApplicationInternalSn(double value) {
        this.outGrpApplicationOutGrmApplicationCustomerApplicationInternalSn = value;
    }

}
