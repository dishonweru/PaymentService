
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutRegSegmGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutRegSegmGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmCharSuppliedChar6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmCharSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegSegmGrpOutRegSegmGrmBillMassregSegmComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutRegSegmGrp", propOrder = {
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp",
    "outRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount",
    "outRegSegmGrpOutRegSegmGrmCharSuppliedChar20",
    "outRegSegmGrpOutRegSegmGrmCharSuppliedChar6",
    "outRegSegmGrpOutRegSegmGrmCharSuppliedChar5",
    "outRegSegmGrpOutRegSegmGrmBillMassregSegmComments"
})
public class OutRegSegmGrp {

    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd")
    protected short outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber")
    protected String outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys")
    protected short outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount", required = true)
    protected BigDecimal outRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum")
    protected double outRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar")
    protected String outRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo")
    protected String outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod")
    protected String outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate", required = true)
    protected BigDecimal outRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount", required = true)
    protected BigDecimal outRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmCharSuppliedChar20")
    protected String outRegSegmGrpOutRegSegmGrmCharSuppliedChar20;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmCharSuppliedChar6")
    protected String outRegSegmGrpOutRegSegmGrmCharSuppliedChar6;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmCharSuppliedChar5")
    protected String outRegSegmGrpOutRegSegmGrmCharSuppliedChar5;
    @XmlElement(name = "OutRegSegmGrpOutRegSegmGrmBillMassregSegmComments")
    protected String outRegSegmGrpOutRegSegmGrmBillMassregSegmComments;

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd property.
     * 
     */
    public short getOutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd property.
     * 
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd(short value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccCd = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber(String value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCrAccNumber = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys property.
     * 
     */
    public short getOutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys property.
     * 
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys(short value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmBillCraccPrfsys = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount(BigDecimal value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmCraccAmount = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum property.
     * 
     */
    public double getOutRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum property.
     * 
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum(double value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmMassegSerialNum = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp(XMLGregorianCalendar value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmTmstamp = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar() {
        return outRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar(String value) {
        this.outRegSegmGrpOutRegSegmGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo(String value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerRefNo = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod(String value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmDealerUsrcod = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate(BigDecimal value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmConversionRate = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount(BigDecimal value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmConvertedAmount = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegSegmGrpOutRegSegmGrmCharSuppliedChar20() {
        return outRegSegmGrpOutRegSegmGrmCharSuppliedChar20;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmCharSuppliedChar20(String value) {
        this.outRegSegmGrpOutRegSegmGrmCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmCharSuppliedChar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegSegmGrpOutRegSegmGrmCharSuppliedChar6() {
        return outRegSegmGrpOutRegSegmGrmCharSuppliedChar6;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmCharSuppliedChar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmCharSuppliedChar6(String value) {
        this.outRegSegmGrpOutRegSegmGrmCharSuppliedChar6 = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmCharSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegSegmGrpOutRegSegmGrmCharSuppliedChar5() {
        return outRegSegmGrpOutRegSegmGrmCharSuppliedChar5;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmCharSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmCharSuppliedChar5(String value) {
        this.outRegSegmGrpOutRegSegmGrmCharSuppliedChar5 = value;
    }

    /**
     * Gets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegSegmGrpOutRegSegmGrmBillMassregSegmComments() {
        return outRegSegmGrpOutRegSegmGrmBillMassregSegmComments;
    }

    /**
     * Sets the value of the outRegSegmGrpOutRegSegmGrmBillMassregSegmComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegSegmGrpOutRegSegmGrmBillMassregSegmComments(String value) {
        this.outRegSegmGrpOutRegSegmGrmBillMassregSegmComments = value;
    }

}
