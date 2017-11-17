
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGroupD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGroupD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGroupOutGrpRetainInterResAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGroupOutGrpRetainInterResCrIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpRetainInterResProgressiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpRetainInterResTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGroupD", propOrder = {
    "outGroupOutGrpRetainInterResAccSn",
    "outGroupOutGrpRetainInterResCrIntAmn",
    "outGroupOutGrpRetainInterResProgressiveAmn",
    "outGroupOutGrpRetainInterResTrxDate"
})
public class OutGroupD {

    @XmlElement(name = "OutGroupOutGrpRetainInterResAccSn")
    protected double outGroupOutGrpRetainInterResAccSn;
    @XmlElement(name = "OutGroupOutGrpRetainInterResCrIntAmn", required = true)
    protected BigDecimal outGroupOutGrpRetainInterResCrIntAmn;
    @XmlElement(name = "OutGroupOutGrpRetainInterResProgressiveAmn", required = true)
    protected BigDecimal outGroupOutGrpRetainInterResProgressiveAmn;
    @XmlElement(name = "OutGroupOutGrpRetainInterResTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrpRetainInterResTrxDate;

    /**
     * Gets the value of the outGroupOutGrpRetainInterResAccSn property.
     * 
     */
    public double getOutGroupOutGrpRetainInterResAccSn() {
        return outGroupOutGrpRetainInterResAccSn;
    }

    /**
     * Sets the value of the outGroupOutGrpRetainInterResAccSn property.
     * 
     */
    public void setOutGroupOutGrpRetainInterResAccSn(double value) {
        this.outGroupOutGrpRetainInterResAccSn = value;
    }

    /**
     * Gets the value of the outGroupOutGrpRetainInterResCrIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpRetainInterResCrIntAmn() {
        return outGroupOutGrpRetainInterResCrIntAmn;
    }

    /**
     * Sets the value of the outGroupOutGrpRetainInterResCrIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpRetainInterResCrIntAmn(BigDecimal value) {
        this.outGroupOutGrpRetainInterResCrIntAmn = value;
    }

    /**
     * Gets the value of the outGroupOutGrpRetainInterResProgressiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpRetainInterResProgressiveAmn() {
        return outGroupOutGrpRetainInterResProgressiveAmn;
    }

    /**
     * Sets the value of the outGroupOutGrpRetainInterResProgressiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpRetainInterResProgressiveAmn(BigDecimal value) {
        this.outGroupOutGrpRetainInterResProgressiveAmn = value;
    }

    /**
     * Gets the value of the outGroupOutGrpRetainInterResTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrpRetainInterResTrxDate() {
        return outGroupOutGrpRetainInterResTrxDate;
    }

    /**
     * Sets the value of the outGroupOutGrpRetainInterResTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrpRetainInterResTrxDate(XMLGregorianCalendar value) {
        this.outGroupOutGrpRetainInterResTrxDate = value;
    }

}
