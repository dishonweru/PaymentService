
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGrpCapitalLr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpCapitalLr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpCapitalLrInGrmCapitalLoanRequestRequestSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpCapitalLrInGrmCapitalLoanRequestRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpCapitalLr", propOrder = {
    "inGrpCapitalLrInGrmCapitalLoanRequestRequestSn",
    "inGrpCapitalLrInGrmCapitalLoanRequestRequestType",
    "inGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal",
    "inGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt",
    "inGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar"
})
public class InGrpCapitalLr {

    @XmlElement(name = "InGrpCapitalLrInGrmCapitalLoanRequestRequestSn")
    protected short inGrpCapitalLrInGrmCapitalLoanRequestRequestSn;
    @XmlElement(name = "InGrpCapitalLrInGrmCapitalLoanRequestRequestType")
    protected String inGrpCapitalLrInGrmCapitalLoanRequestRequestType;
    @XmlElement(name = "InGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal", required = true)
    protected BigDecimal inGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal;
    @XmlElement(name = "InGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt;
    @XmlElement(name = "InGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar")
    protected String inGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpCapitalLrInGrmCapitalLoanRequestRequestSn property.
     * 
     */
    public short getInGrpCapitalLrInGrmCapitalLoanRequestRequestSn() {
        return inGrpCapitalLrInGrmCapitalLoanRequestRequestSn;
    }

    /**
     * Sets the value of the inGrpCapitalLrInGrmCapitalLoanRequestRequestSn property.
     * 
     */
    public void setInGrpCapitalLrInGrmCapitalLoanRequestRequestSn(short value) {
        this.inGrpCapitalLrInGrmCapitalLoanRequestRequestSn = value;
    }

    /**
     * Gets the value of the inGrpCapitalLrInGrmCapitalLoanRequestRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCapitalLrInGrmCapitalLoanRequestRequestType() {
        return inGrpCapitalLrInGrmCapitalLoanRequestRequestType;
    }

    /**
     * Sets the value of the inGrpCapitalLrInGrmCapitalLoanRequestRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCapitalLrInGrmCapitalLoanRequestRequestType(String value) {
        this.inGrpCapitalLrInGrmCapitalLoanRequestRequestType = value;
    }

    /**
     * Gets the value of the inGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal() {
        return inGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal;
    }

    /**
     * Sets the value of the inGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal(BigDecimal value) {
        this.inGrpCapitalLrInGrmCapitalLoanRequestRqCapitalBal = value;
    }

    /**
     * Gets the value of the inGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt() {
        return inGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt;
    }

    /**
     * Sets the value of the inGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt(XMLGregorianCalendar value) {
        this.inGrpCapitalLrInGrmCapitalLoanRequestRqExpireDt = value;
    }

    /**
     * Gets the value of the inGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar() {
        return inGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar(String value) {
        this.inGrpCapitalLrInGrmCapitalLoanRequestIefSuppliedSelectChar = value;
    }

}
