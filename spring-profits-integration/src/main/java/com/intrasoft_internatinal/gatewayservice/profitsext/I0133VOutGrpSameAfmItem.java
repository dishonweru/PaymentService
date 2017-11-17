
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0133VOutGrpSameAfmItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0133VOutGrpSameAfmItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSameAfmOutGrmSameAfmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpSameAfmOutGrmSameAfmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSameAfmOutGrmSameAfmCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameAfmOutGrmSameAfmCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameAfmOutGrmSameOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameAfmOutGrmSameOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0133VOutGrpSameAfmItem", propOrder = {
    "outGrpSameAfmOutGrmSameAfmCustomerCDigit",
    "outGrpSameAfmOutGrmSameAfmCustomerCustId",
    "outGrpSameAfmOutGrmSameAfmCustomerFirstName",
    "outGrpSameAfmOutGrmSameAfmCustomerSurname",
    "outGrpSameAfmOutGrmSameOtherAfmAfmNo",
    "outGrpSameAfmOutGrmSameOtherAfmTmstamp"
})
public class I0133VOutGrpSameAfmItem {

    @XmlElement(name = "OutGrpSameAfmOutGrmSameAfmCustomerCDigit")
    protected short outGrpSameAfmOutGrmSameAfmCustomerCDigit;
    @XmlElement(name = "OutGrpSameAfmOutGrmSameAfmCustomerCustId")
    protected int outGrpSameAfmOutGrmSameAfmCustomerCustId;
    @XmlElement(name = "OutGrpSameAfmOutGrmSameAfmCustomerFirstName")
    protected String outGrpSameAfmOutGrmSameAfmCustomerFirstName;
    @XmlElement(name = "OutGrpSameAfmOutGrmSameAfmCustomerSurname")
    protected String outGrpSameAfmOutGrmSameAfmCustomerSurname;
    @XmlElement(name = "OutGrpSameAfmOutGrmSameOtherAfmAfmNo")
    protected String outGrpSameAfmOutGrmSameOtherAfmAfmNo;
    @XmlElement(name = "OutGrpSameAfmOutGrmSameOtherAfmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpSameAfmOutGrmSameOtherAfmTmstamp;

    /**
     * Gets the value of the outGrpSameAfmOutGrmSameAfmCustomerCDigit property.
     * 
     */
    public short getOutGrpSameAfmOutGrmSameAfmCustomerCDigit() {
        return outGrpSameAfmOutGrmSameAfmCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpSameAfmOutGrmSameAfmCustomerCDigit property.
     * 
     */
    public void setOutGrpSameAfmOutGrmSameAfmCustomerCDigit(short value) {
        this.outGrpSameAfmOutGrmSameAfmCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpSameAfmOutGrmSameAfmCustomerCustId property.
     * 
     */
    public int getOutGrpSameAfmOutGrmSameAfmCustomerCustId() {
        return outGrpSameAfmOutGrmSameAfmCustomerCustId;
    }

    /**
     * Sets the value of the outGrpSameAfmOutGrmSameAfmCustomerCustId property.
     * 
     */
    public void setOutGrpSameAfmOutGrmSameAfmCustomerCustId(int value) {
        this.outGrpSameAfmOutGrmSameAfmCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpSameAfmOutGrmSameAfmCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameAfmOutGrmSameAfmCustomerFirstName() {
        return outGrpSameAfmOutGrmSameAfmCustomerFirstName;
    }

    /**
     * Sets the value of the outGrpSameAfmOutGrmSameAfmCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameAfmOutGrmSameAfmCustomerFirstName(String value) {
        this.outGrpSameAfmOutGrmSameAfmCustomerFirstName = value;
    }

    /**
     * Gets the value of the outGrpSameAfmOutGrmSameAfmCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameAfmOutGrmSameAfmCustomerSurname() {
        return outGrpSameAfmOutGrmSameAfmCustomerSurname;
    }

    /**
     * Sets the value of the outGrpSameAfmOutGrmSameAfmCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameAfmOutGrmSameAfmCustomerSurname(String value) {
        this.outGrpSameAfmOutGrmSameAfmCustomerSurname = value;
    }

    /**
     * Gets the value of the outGrpSameAfmOutGrmSameOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameAfmOutGrmSameOtherAfmAfmNo() {
        return outGrpSameAfmOutGrmSameOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outGrpSameAfmOutGrmSameOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameAfmOutGrmSameOtherAfmAfmNo(String value) {
        this.outGrpSameAfmOutGrmSameOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outGrpSameAfmOutGrmSameOtherAfmTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpSameAfmOutGrmSameOtherAfmTmstamp() {
        return outGrpSameAfmOutGrmSameOtherAfmTmstamp;
    }

    /**
     * Sets the value of the outGrpSameAfmOutGrmSameOtherAfmTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpSameAfmOutGrmSameOtherAfmTmstamp(XMLGregorianCalendar value) {
        this.outGrpSameAfmOutGrmSameOtherAfmTmstamp = value;
    }

}
