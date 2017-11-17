
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGrpLoanAddInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpLoanAddInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpLoanAddInfo", propOrder = {
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData",
    "inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData"
})
public class InGrpLoanAddInfo {

    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn")
    protected double inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType")
    protected short inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit")
    protected int inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData", required = true)
    protected BigDecimal inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData")
    protected double inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData", required = true)
    protected BigDecimal inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId")
    protected int inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn")
    protected int inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag")
    protected String inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData")
    protected String inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData;
    @XmlElement(name = "InGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData;

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn property.
     * 
     */
    public double getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn property.
     * 
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn(double value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccSn = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType property.
     * 
     */
    public short getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType property.
     * 
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType(short value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccType = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit property.
     * 
     */
    public int getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit property.
     * 
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit(int value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAccUnit = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData(BigDecimal value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoAmountData = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData(XMLGregorianCalendar value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoDateData = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData property.
     * 
     */
    public double getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData property.
     * 
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData(double value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoNumData = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData(BigDecimal value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRateData = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId property.
     * 
     */
    public int getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId property.
     * 
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId(int value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowId = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn property.
     * 
     */
    public int getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn property.
     * 
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn(int value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoRowInternalSn = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag(String value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoShowFlag = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData(String value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTextData = value;
    }

    /**
     * Gets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData() {
        return inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData(XMLGregorianCalendar value) {
        this.inGrpLoanAddInfoInGrmLoanAddInfoLoanAddInfoTmstampData = value;
    }

}
