
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpReplyOutGrmCollectionReplyActionId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpReplyOutGrmCollectionReplyCollectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpReplyOutGrmCollectionReplyPromiseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpReplyOutGrmCollectionReplyPromiseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpReplyOutGrmInfoCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpReply", propOrder = {
    "outGrpReplyOutGrmCollectionReplyActionId",
    "outGrpReplyOutGrmCollectionReplyCollectDate",
    "outGrpReplyOutGrmCollectionReplyPromiseAmount",
    "outGrpReplyOutGrmCollectionReplyPromiseDate",
    "outGrpReplyOutGrmInfoCharSuppliedChar20"
})
public class OutGrpReply {

    @XmlElement(name = "OutGrpReplyOutGrmCollectionReplyActionId")
    protected short outGrpReplyOutGrmCollectionReplyActionId;
    @XmlElement(name = "OutGrpReplyOutGrmCollectionReplyCollectDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpReplyOutGrmCollectionReplyCollectDate;
    @XmlElement(name = "OutGrpReplyOutGrmCollectionReplyPromiseAmount", required = true)
    protected BigDecimal outGrpReplyOutGrmCollectionReplyPromiseAmount;
    @XmlElement(name = "OutGrpReplyOutGrmCollectionReplyPromiseDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpReplyOutGrmCollectionReplyPromiseDate;
    @XmlElement(name = "OutGrpReplyOutGrmInfoCharSuppliedChar20")
    protected String outGrpReplyOutGrmInfoCharSuppliedChar20;

    /**
     * Gets the value of the outGrpReplyOutGrmCollectionReplyActionId property.
     * 
     */
    public short getOutGrpReplyOutGrmCollectionReplyActionId() {
        return outGrpReplyOutGrmCollectionReplyActionId;
    }

    /**
     * Sets the value of the outGrpReplyOutGrmCollectionReplyActionId property.
     * 
     */
    public void setOutGrpReplyOutGrmCollectionReplyActionId(short value) {
        this.outGrpReplyOutGrmCollectionReplyActionId = value;
    }

    /**
     * Gets the value of the outGrpReplyOutGrmCollectionReplyCollectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpReplyOutGrmCollectionReplyCollectDate() {
        return outGrpReplyOutGrmCollectionReplyCollectDate;
    }

    /**
     * Sets the value of the outGrpReplyOutGrmCollectionReplyCollectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpReplyOutGrmCollectionReplyCollectDate(XMLGregorianCalendar value) {
        this.outGrpReplyOutGrmCollectionReplyCollectDate = value;
    }

    /**
     * Gets the value of the outGrpReplyOutGrmCollectionReplyPromiseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpReplyOutGrmCollectionReplyPromiseAmount() {
        return outGrpReplyOutGrmCollectionReplyPromiseAmount;
    }

    /**
     * Sets the value of the outGrpReplyOutGrmCollectionReplyPromiseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpReplyOutGrmCollectionReplyPromiseAmount(BigDecimal value) {
        this.outGrpReplyOutGrmCollectionReplyPromiseAmount = value;
    }

    /**
     * Gets the value of the outGrpReplyOutGrmCollectionReplyPromiseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpReplyOutGrmCollectionReplyPromiseDate() {
        return outGrpReplyOutGrmCollectionReplyPromiseDate;
    }

    /**
     * Sets the value of the outGrpReplyOutGrmCollectionReplyPromiseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpReplyOutGrmCollectionReplyPromiseDate(XMLGregorianCalendar value) {
        this.outGrpReplyOutGrmCollectionReplyPromiseDate = value;
    }

    /**
     * Gets the value of the outGrpReplyOutGrmInfoCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpReplyOutGrmInfoCharSuppliedChar20() {
        return outGrpReplyOutGrmInfoCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpReplyOutGrmInfoCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpReplyOutGrmInfoCharSuppliedChar20(String value) {
        this.outGrpReplyOutGrmInfoCharSuppliedChar20 = value;
    }

}
