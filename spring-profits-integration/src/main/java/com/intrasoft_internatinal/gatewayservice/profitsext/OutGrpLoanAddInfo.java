
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpLoanAddInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpLoanAddInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpLoanAddInfo", propOrder = {
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData",
    "outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData"
})
public class OutGrpLoanAddInfo {

    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn")
    protected double outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType")
    protected short outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit")
    protected int outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData", required = true)
    protected BigDecimal outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData")
    protected double outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData", required = true)
    protected BigDecimal outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId")
    protected int outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn")
    protected int outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag")
    protected String outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData")
    protected String outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData;
    @XmlElement(name = "OutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData;

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn property.
     * 
     */
    public double getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn property.
     * 
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn(double value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccSn = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType property.
     * 
     */
    public short getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType property.
     * 
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType(short value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccType = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit property.
     * 
     */
    public int getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit property.
     * 
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit(int value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAccUnit = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData(BigDecimal value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoAmountData = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData(XMLGregorianCalendar value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoDateData = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData property.
     * 
     */
    public double getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData property.
     * 
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData(double value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoNumData = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData(BigDecimal value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRateData = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId property.
     * 
     */
    public int getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId property.
     * 
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId(int value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowId = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn property.
     * 
     */
    public int getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn property.
     * 
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn(int value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoRowInternalSn = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag(String value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoShowFlag = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData(String value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTextData = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData() {
        return outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData(XMLGregorianCalendar value) {
        this.outGrpLoanAddInfoOutGrmLoanAddInfoLoanAddInfoTmstampData = value;
    }

}
