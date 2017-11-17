
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TUN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrxUserSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUN", propOrder = {
    "trxDate",
    "trxUnit",
    "trxUser",
    "trxUserSn",
    "tunInternalSn"
})
public class TUN {

    @XmlElement(name = "TrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trxDate;
    @XmlElement(name = "TrxUnit")
    protected int trxUnit;
    @XmlElement(name = "TrxUser")
    protected String trxUser;
    @XmlElement(name = "TrxUserSn")
    protected int trxUserSn;
    @XmlElement(name = "TunInternalSn")
    protected short tunInternalSn;

    /**
     * Gets the value of the trxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrxDate() {
        return trxDate;
    }

    /**
     * Sets the value of the trxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrxDate(XMLGregorianCalendar value) {
        this.trxDate = value;
    }

    /**
     * Gets the value of the trxUnit property.
     * 
     */
    public int getTrxUnit() {
        return trxUnit;
    }

    /**
     * Sets the value of the trxUnit property.
     * 
     */
    public void setTrxUnit(int value) {
        this.trxUnit = value;
    }

    /**
     * Gets the value of the trxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxUser() {
        return trxUser;
    }

    /**
     * Sets the value of the trxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxUser(String value) {
        this.trxUser = value;
    }

    /**
     * Gets the value of the trxUserSn property.
     * 
     */
    public int getTrxUserSn() {
        return trxUserSn;
    }

    /**
     * Sets the value of the trxUserSn property.
     * 
     */
    public void setTrxUserSn(int value) {
        this.trxUserSn = value;
    }

    /**
     * Gets the value of the tunInternalSn property.
     * 
     */
    public short getTunInternalSn() {
        return tunInternalSn;
    }

    /**
     * Sets the value of the tunInternalSn property.
     * 
     */
    public void setTunInternalSn(short value) {
        this.tunInternalSn = value;
    }

}
