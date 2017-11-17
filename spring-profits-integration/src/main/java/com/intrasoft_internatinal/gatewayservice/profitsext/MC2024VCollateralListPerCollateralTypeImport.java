
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2024VCollateralListPerCollateralTypeImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2024VCollateralListPerCollateralTypeImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InRecordTypeCollateralWorkRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2024VCollateralListPerCollateralTypeImport", propOrder = {
    "inBankParametersCurrTrxDate",
    "inContinueCollateralTableInternalSn",
    "inRecordTypeCollateralWorkRecordType",
    "inSelectedCustomerCDigit",
    "inSelectedCustomerCustId"
})
public class MC2024VCollateralListPerCollateralTypeImport
    extends BaseImport
{

    @XmlElement(name = "InBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBankParametersCurrTrxDate;
    @XmlElement(name = "InContinueCollateralTableInternalSn")
    protected double inContinueCollateralTableInternalSn;
    @XmlElement(name = "InRecordTypeCollateralWorkRecordType")
    protected String inRecordTypeCollateralWorkRecordType;
    @XmlElement(name = "InSelectedCustomerCDigit")
    protected short inSelectedCustomerCDigit;
    @XmlElement(name = "InSelectedCustomerCustId")
    protected int inSelectedCustomerCustId;

    /**
     * Gets the value of the inBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBankParametersCurrTrxDate() {
        return inBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the inBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.inBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the inContinueCollateralTableInternalSn property.
     * 
     */
    public double getInContinueCollateralTableInternalSn() {
        return inContinueCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inContinueCollateralTableInternalSn property.
     * 
     */
    public void setInContinueCollateralTableInternalSn(double value) {
        this.inContinueCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inRecordTypeCollateralWorkRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecordTypeCollateralWorkRecordType() {
        return inRecordTypeCollateralWorkRecordType;
    }

    /**
     * Sets the value of the inRecordTypeCollateralWorkRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecordTypeCollateralWorkRecordType(String value) {
        this.inRecordTypeCollateralWorkRecordType = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public short getInSelectedCustomerCDigit() {
        return inSelectedCustomerCDigit;
    }

    /**
     * Sets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public void setInSelectedCustomerCDigit(short value) {
        this.inSelectedCustomerCDigit = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCustId property.
     * 
     */
    public int getInSelectedCustomerCustId() {
        return inSelectedCustomerCustId;
    }

    /**
     * Sets the value of the inSelectedCustomerCustId property.
     * 
     */
    public void setInSelectedCustomerCustId(int value) {
        this.inSelectedCustomerCustId = value;
    }

}
