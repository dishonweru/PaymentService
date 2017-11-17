
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmTrxCountTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmTrxCountUsrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrp", propOrder = {
    "outGrpOutGrmTrxCountAdvCounter",
    "outGrpOutGrmTrxCountTrxCounter",
    "outGrpOutGrmTrxCountTrxDate",
    "outGrpOutGrmTrxCountUsrStatus"
})
public class OutGrp {

    @XmlElement(name = "OutGrpOutGrmTrxCountAdvCounter")
    protected int outGrpOutGrmTrxCountAdvCounter;
    @XmlElement(name = "OutGrpOutGrmTrxCountTrxCounter")
    protected int outGrpOutGrmTrxCountTrxCounter;
    @XmlElement(name = "OutGrpOutGrmTrxCountTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmTrxCountTrxDate;
    @XmlElement(name = "OutGrpOutGrmTrxCountUsrStatus")
    protected String outGrpOutGrmTrxCountUsrStatus;

    /**
     * Gets the value of the outGrpOutGrmTrxCountAdvCounter property.
     * 
     */
    public int getOutGrpOutGrmTrxCountAdvCounter() {
        return outGrpOutGrmTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outGrpOutGrmTrxCountAdvCounter property.
     * 
     */
    public void setOutGrpOutGrmTrxCountAdvCounter(int value) {
        this.outGrpOutGrmTrxCountAdvCounter = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrxCountTrxCounter property.
     * 
     */
    public int getOutGrpOutGrmTrxCountTrxCounter() {
        return outGrpOutGrmTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outGrpOutGrmTrxCountTrxCounter property.
     * 
     */
    public void setOutGrpOutGrmTrxCountTrxCounter(int value) {
        this.outGrpOutGrmTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrxCountTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmTrxCountTrxDate() {
        return outGrpOutGrmTrxCountTrxDate;
    }

    /**
     * Sets the value of the outGrpOutGrmTrxCountTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmTrxCountTrxDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmTrxCountTrxDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrxCountUsrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTrxCountUsrStatus() {
        return outGrpOutGrmTrxCountUsrStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmTrxCountUsrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTrxCountUsrStatus(String value) {
        this.outGrpOutGrmTrxCountUsrStatus = value;
    }

}
