
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InRegSegmGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InRegSegmGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmCharSuppliedChar6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmCharSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegSegmGrpInRegSegmGrmBillMassregSegmComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InRegSegmGrp", propOrder = {
    "inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp",
    "inRegSegmGrpInRegSegmGrmCharSuppliedChar20",
    "inRegSegmGrpInRegSegmGrmIefSuppliedSelectChar",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount",
    "inRegSegmGrpInRegSegmGrmCharSuppliedChar6",
    "inRegSegmGrpInRegSegmGrmCharSuppliedChar5",
    "inRegSegmGrpInRegSegmGrmBillMassregSegmComments"
})
public class InRegSegmGrp {

    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd")
    protected short inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber")
    protected String inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys")
    protected short inRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount", required = true)
    protected BigDecimal inRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum")
    protected double inRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmCharSuppliedChar20")
    protected String inRegSegmGrpInRegSegmGrmCharSuppliedChar20;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmIefSuppliedSelectChar")
    protected String inRegSegmGrpInRegSegmGrmIefSuppliedSelectChar;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo")
    protected String inRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod")
    protected String inRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate", required = true)
    protected BigDecimal inRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount", required = true)
    protected BigDecimal inRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmCharSuppliedChar6")
    protected String inRegSegmGrpInRegSegmGrmCharSuppliedChar6;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmCharSuppliedChar5")
    protected String inRegSegmGrpInRegSegmGrmCharSuppliedChar5;
    @XmlElement(name = "InRegSegmGrpInRegSegmGrmBillMassregSegmComments")
    protected String inRegSegmGrpInRegSegmGrmBillMassregSegmComments;

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd property.
     * 
     */
    public short getInRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd property.
     * 
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd(short value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccCd = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber(String value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmBillCrAccNumber = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys property.
     * 
     */
    public short getInRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys property.
     * 
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys(short value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmBillCraccPrfsys = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount(BigDecimal value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmCraccAmount = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum property.
     * 
     */
    public double getInRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum property.
     * 
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum(double value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmMassegSerialNum = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp(XMLGregorianCalendar value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmTmstamp = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegSegmGrpInRegSegmGrmCharSuppliedChar20() {
        return inRegSegmGrpInRegSegmGrmCharSuppliedChar20;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmCharSuppliedChar20(String value) {
        this.inRegSegmGrpInRegSegmGrmCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegSegmGrpInRegSegmGrmIefSuppliedSelectChar() {
        return inRegSegmGrpInRegSegmGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmIefSuppliedSelectChar(String value) {
        this.inRegSegmGrpInRegSegmGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo(String value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmDealerRefNo = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod(String value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmDealerUsrcod = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate(BigDecimal value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmConversionRate = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount(BigDecimal value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmConvertedAmount = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmCharSuppliedChar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegSegmGrpInRegSegmGrmCharSuppliedChar6() {
        return inRegSegmGrpInRegSegmGrmCharSuppliedChar6;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmCharSuppliedChar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmCharSuppliedChar6(String value) {
        this.inRegSegmGrpInRegSegmGrmCharSuppliedChar6 = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmCharSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegSegmGrpInRegSegmGrmCharSuppliedChar5() {
        return inRegSegmGrpInRegSegmGrmCharSuppliedChar5;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmCharSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmCharSuppliedChar5(String value) {
        this.inRegSegmGrpInRegSegmGrmCharSuppliedChar5 = value;
    }

    /**
     * Gets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegSegmGrpInRegSegmGrmBillMassregSegmComments() {
        return inRegSegmGrpInRegSegmGrmBillMassregSegmComments;
    }

    /**
     * Sets the value of the inRegSegmGrpInRegSegmGrmBillMassregSegmComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegSegmGrpInRegSegmGrmBillMassregSegmComments(String value) {
        this.inRegSegmGrpInRegSegmGrmBillMassregSegmComments = value;
    }

}
