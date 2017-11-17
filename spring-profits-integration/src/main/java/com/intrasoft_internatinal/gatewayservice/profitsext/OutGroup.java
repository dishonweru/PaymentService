
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGroupOutGrmTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrmTrxCountTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrmTrxCountUsrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGroup", propOrder = {
    "outGroupOutGrmTrxCountAdvCounter",
    "outGroupOutGrmTrxCountTrxCounter",
    "outGroupOutGrmTrxCountTrxDate",
    "outGroupOutGrmTrxCountUsrStatus"
})
public class OutGroup {

    @XmlElement(name = "OutGroupOutGrmTrxCountAdvCounter")
    protected int outGroupOutGrmTrxCountAdvCounter;
    @XmlElement(name = "OutGroupOutGrmTrxCountTrxCounter")
    protected int outGroupOutGrmTrxCountTrxCounter;
    @XmlElement(name = "OutGroupOutGrmTrxCountTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrmTrxCountTrxDate;
    @XmlElement(name = "OutGroupOutGrmTrxCountUsrStatus")
    protected String outGroupOutGrmTrxCountUsrStatus;

    /**
     * Gets the value of the outGroupOutGrmTrxCountAdvCounter property.
     * 
     */
    public int getOutGroupOutGrmTrxCountAdvCounter() {
        return outGroupOutGrmTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outGroupOutGrmTrxCountAdvCounter property.
     * 
     */
    public void setOutGroupOutGrmTrxCountAdvCounter(int value) {
        this.outGroupOutGrmTrxCountAdvCounter = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTrxCountTrxCounter property.
     * 
     */
    public int getOutGroupOutGrmTrxCountTrxCounter() {
        return outGroupOutGrmTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outGroupOutGrmTrxCountTrxCounter property.
     * 
     */
    public void setOutGroupOutGrmTrxCountTrxCounter(int value) {
        this.outGroupOutGrmTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTrxCountTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrmTrxCountTrxDate() {
        return outGroupOutGrmTrxCountTrxDate;
    }

    /**
     * Sets the value of the outGroupOutGrmTrxCountTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrmTrxCountTrxDate(XMLGregorianCalendar value) {
        this.outGroupOutGrmTrxCountTrxDate = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTrxCountUsrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTrxCountUsrStatus() {
        return outGroupOutGrmTrxCountUsrStatus;
    }

    /**
     * Sets the value of the outGroupOutGrmTrxCountUsrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTrxCountUsrStatus(String value) {
        this.outGroupOutGrmTrxCountUsrStatus = value;
    }

}
