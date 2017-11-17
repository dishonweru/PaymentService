
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0117VOutGrpSameIdItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0117VOutGrpSameIdItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSameIdOutGrm1CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpSameIdOutGrm1CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSameIdOutGrm1CustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameIdOutGrm1CustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameIdOutGrm1OtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameIdOutGrm1OtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpSameIdOutGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0117VOutGrpSameIdItem", propOrder = {
    "outGrpSameIdOutGrm1CustomerCDigit",
    "outGrpSameIdOutGrm1CustomerCustId",
    "outGrpSameIdOutGrm1CustomerFirstName",
    "outGrpSameIdOutGrm1CustomerSurname",
    "outGrpSameIdOutGrm1OtherIdIdNo",
    "outGrpSameIdOutGrm1OtherIdTmstamp",
    "outGrpSameIdOutGrmGenericDetailSerialNum"
})
public class I0117VOutGrpSameIdItem {

    @XmlElement(name = "OutGrpSameIdOutGrm1CustomerCDigit")
    protected short outGrpSameIdOutGrm1CustomerCDigit;
    @XmlElement(name = "OutGrpSameIdOutGrm1CustomerCustId")
    protected int outGrpSameIdOutGrm1CustomerCustId;
    @XmlElement(name = "OutGrpSameIdOutGrm1CustomerFirstName")
    protected String outGrpSameIdOutGrm1CustomerFirstName;
    @XmlElement(name = "OutGrpSameIdOutGrm1CustomerSurname")
    protected String outGrpSameIdOutGrm1CustomerSurname;
    @XmlElement(name = "OutGrpSameIdOutGrm1OtherIdIdNo")
    protected String outGrpSameIdOutGrm1OtherIdIdNo;
    @XmlElement(name = "OutGrpSameIdOutGrm1OtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpSameIdOutGrm1OtherIdTmstamp;
    @XmlElement(name = "OutGrpSameIdOutGrmGenericDetailSerialNum")
    protected int outGrpSameIdOutGrmGenericDetailSerialNum;

    /**
     * Gets the value of the outGrpSameIdOutGrm1CustomerCDigit property.
     * 
     */
    public short getOutGrpSameIdOutGrm1CustomerCDigit() {
        return outGrpSameIdOutGrm1CustomerCDigit;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrm1CustomerCDigit property.
     * 
     */
    public void setOutGrpSameIdOutGrm1CustomerCDigit(short value) {
        this.outGrpSameIdOutGrm1CustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrm1CustomerCustId property.
     * 
     */
    public int getOutGrpSameIdOutGrm1CustomerCustId() {
        return outGrpSameIdOutGrm1CustomerCustId;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrm1CustomerCustId property.
     * 
     */
    public void setOutGrpSameIdOutGrm1CustomerCustId(int value) {
        this.outGrpSameIdOutGrm1CustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrm1CustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameIdOutGrm1CustomerFirstName() {
        return outGrpSameIdOutGrm1CustomerFirstName;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrm1CustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameIdOutGrm1CustomerFirstName(String value) {
        this.outGrpSameIdOutGrm1CustomerFirstName = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrm1CustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameIdOutGrm1CustomerSurname() {
        return outGrpSameIdOutGrm1CustomerSurname;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrm1CustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameIdOutGrm1CustomerSurname(String value) {
        this.outGrpSameIdOutGrm1CustomerSurname = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrm1OtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameIdOutGrm1OtherIdIdNo() {
        return outGrpSameIdOutGrm1OtherIdIdNo;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrm1OtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameIdOutGrm1OtherIdIdNo(String value) {
        this.outGrpSameIdOutGrm1OtherIdIdNo = value;
    }

    /**
     * Gets the value of the outGrpSameIdOutGrm1OtherIdTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpSameIdOutGrm1OtherIdTmstamp() {
        return outGrpSameIdOutGrm1OtherIdTmstamp;
    }

    /**
     * Sets the value of the outGrpSameIdOutGrm1OtherIdTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpSameIdOutGrm1OtherIdTmstamp(XMLGregorianCalendar value) {
        this.outGrpSameIdOutGrm1OtherIdTmstamp = value;
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

}
