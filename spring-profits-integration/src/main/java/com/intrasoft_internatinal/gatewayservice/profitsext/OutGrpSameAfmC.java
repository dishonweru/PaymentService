
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpSameAfmC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpSameAfmC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSameAfmOutGrmOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameAfmOutGrmOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpSameAfmOutGrmSameAfmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpSameAfmOutGrmSameAfmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSameAfmOutGrmSameAfmCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSameAfmOutGrmSameAfmCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpSameAfmC", propOrder = {
    "outGrpSameAfmOutGrmOtherAfmAfmNo",
    "outGrpSameAfmOutGrmOtherAfmTmstamp",
    "outGrpSameAfmOutGrmSameAfmCustomerCDigit",
    "outGrpSameAfmOutGrmSameAfmCustomerCustId",
    "outGrpSameAfmOutGrmSameAfmCustomerFirstName",
    "outGrpSameAfmOutGrmSameAfmCustomerSurname"
})
public class OutGrpSameAfmC {

    @XmlElement(name = "OutGrpSameAfmOutGrmOtherAfmAfmNo")
    protected String outGrpSameAfmOutGrmOtherAfmAfmNo;
    @XmlElement(name = "OutGrpSameAfmOutGrmOtherAfmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpSameAfmOutGrmOtherAfmTmstamp;
    @XmlElement(name = "OutGrpSameAfmOutGrmSameAfmCustomerCDigit")
    protected short outGrpSameAfmOutGrmSameAfmCustomerCDigit;
    @XmlElement(name = "OutGrpSameAfmOutGrmSameAfmCustomerCustId")
    protected int outGrpSameAfmOutGrmSameAfmCustomerCustId;
    @XmlElement(name = "OutGrpSameAfmOutGrmSameAfmCustomerFirstName")
    protected String outGrpSameAfmOutGrmSameAfmCustomerFirstName;
    @XmlElement(name = "OutGrpSameAfmOutGrmSameAfmCustomerSurname")
    protected String outGrpSameAfmOutGrmSameAfmCustomerSurname;

    /**
     * Gets the value of the outGrpSameAfmOutGrmOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSameAfmOutGrmOtherAfmAfmNo() {
        return outGrpSameAfmOutGrmOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outGrpSameAfmOutGrmOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSameAfmOutGrmOtherAfmAfmNo(String value) {
        this.outGrpSameAfmOutGrmOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outGrpSameAfmOutGrmOtherAfmTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpSameAfmOutGrmOtherAfmTmstamp() {
        return outGrpSameAfmOutGrmOtherAfmTmstamp;
    }

    /**
     * Sets the value of the outGrpSameAfmOutGrmOtherAfmTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpSameAfmOutGrmOtherAfmTmstamp(XMLGregorianCalendar value) {
        this.outGrpSameAfmOutGrmOtherAfmTmstamp = value;
    }

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

}
