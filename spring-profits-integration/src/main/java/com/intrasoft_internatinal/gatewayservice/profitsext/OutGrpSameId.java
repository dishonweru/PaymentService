
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpSameId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpSameId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSameIdOutGrmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpSameIdOutGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSameIdOutGrmCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameIdOutGrmCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameIdOutGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSameIdOutGrmOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameIdOutGrmOtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpSameId", propOrder = {
    "outGrpSameIdOutGrmCustomerCDigit",
    "outGrpSameIdOutGrmCustomerCustId",
    "outGrpSameIdOutGrmCustomerFirstName",
    "outGrpSameIdOutGrmCustomerSurname",
    "outGrpSameIdOutGrmGenericDetailSerialNum",
    "outGrpSameIdOutGrmOtherIdIdNo",
    "outGrpSameIdOutGrmOtherIdTmstamp"
})
public class OutGrpSameId {

    @XmlElement(name = "OutGrpSameIdOutGrmCustomerCDigit")
    protected short outGrpSameIdOutGrmCustomerCDigit;
    @XmlElement(name = "OutGrpSameIdOutGrmCustomerCustId")
    protected int outGrpSameIdOutGrmCustomerCustId;
    @XmlElement(name = "OutGrpSameIdOutGrmCustomerFirstName")
    protected String outGrpSameIdOutGrmCustomerFirstName;
    @XmlElement(name = "OutGrpSameIdOutGrmCustomerSurname")
    protected String outGrpSameIdOutGrmCustomerSurname;
    @XmlElement(name = "OutGrpSameIdOutGrmGenericDetailSerialNum")
    protected int outGrpSameIdOutGrmGenericDetailSerialNum;
    @XmlElement(name = "OutGrpSameIdOutGrmOtherIdIdNo")
    protected String outGrpSameIdOutGrmOtherIdIdNo;
    @XmlElement(name = "OutGrpSameIdOutGrmOtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpSameIdOutGrmOtherIdTmstamp;

    /**
     * Gets the value of the outGrpSameIdOutGrmCustomerCDigit property.
     * 
     */
    public short getOutGrpSameIdOutGrmCustomerCDigit() {
        return outGrpSameIdOutGrmCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrmCustomerCDigit property.
     * 
     */
    public void setOutGrpSameIdOutGrmCustomerCDigit(short value) {
        this.outGrpSameIdOutGrmCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrmCustomerCustId property.
     * 
     */
    public int getOutGrpSameIdOutGrmCustomerCustId() {
        return outGrpSameIdOutGrmCustomerCustId;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrmCustomerCustId property.
     * 
     */
    public void setOutGrpSameIdOutGrmCustomerCustId(int value) {
        this.outGrpSameIdOutGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrmCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameIdOutGrmCustomerFirstName() {
        return outGrpSameIdOutGrmCustomerFirstName;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrmCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameIdOutGrmCustomerFirstName(String value) {
        this.outGrpSameIdOutGrmCustomerFirstName = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrmCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameIdOutGrmCustomerSurname() {
        return outGrpSameIdOutGrmCustomerSurname;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrmCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameIdOutGrmCustomerSurname(String value) {
        this.outGrpSameIdOutGrmCustomerSurname = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrmGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpSameIdOutGrmGenericDetailSerialNum() {
        return outGrpSameIdOutGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrmGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpSameIdOutGrmGenericDetailSerialNum(int value) {
        this.outGrpSameIdOutGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrmOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameIdOutGrmOtherIdIdNo() {
        return outGrpSameIdOutGrmOtherIdIdNo;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrmOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameIdOutGrmOtherIdIdNo(String value) {
        this.outGrpSameIdOutGrmOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrmOtherIdTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpSameIdOutGrmOtherIdTmstamp() {
        return outGrpSameIdOutGrmOtherIdTmstamp;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrmOtherIdTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpSameIdOutGrmOtherIdTmstamp(XMLGregorianCalendar value) {
        this.outGrpSameIdOutGrmOtherIdTmstamp = value;
    }

}
