
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCollectionOutGrmLoanAccCollectCollectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCollectionOutGrmLoanAccCollectCollectionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollectionOutGrmLoanAccCollectCollectionTries" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCollectionOutGrmLoanAccCollectTrxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollectionOutGrmLoanAccCollectTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollectionOutGrmLoanAccCollectTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollectionOutGrmLoanAccCollectTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpCollection", propOrder = {
    "outGrpCollectionOutGrmLoanAccCollectCollectDate",
    "outGrpCollectionOutGrmLoanAccCollectCollectionStatus",
    "outGrpCollectionOutGrmLoanAccCollectCollectionTries",
    "outGrpCollectionOutGrmLoanAccCollectTrxAmount",
    "outGrpCollectionOutGrmLoanAccCollectTrxCode",
    "outGrpCollectionOutGrmLoanAccCollectTrxUnit",
    "outGrpCollectionOutGrmLoanAccCollectTrxUsr"
})
public class OutGrpCollection {

    @XmlElement(name = "OutGrpCollectionOutGrmLoanAccCollectCollectDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCollectionOutGrmLoanAccCollectCollectDate;
    @XmlElement(name = "OutGrpCollectionOutGrmLoanAccCollectCollectionStatus")
    protected String outGrpCollectionOutGrmLoanAccCollectCollectionStatus;
    @XmlElement(name = "OutGrpCollectionOutGrmLoanAccCollectCollectionTries")
    protected short outGrpCollectionOutGrmLoanAccCollectCollectionTries;
    @XmlElement(name = "OutGrpCollectionOutGrmLoanAccCollectTrxAmount", required = true)
    protected BigDecimal outGrpCollectionOutGrmLoanAccCollectTrxAmount;
    @XmlElement(name = "OutGrpCollectionOutGrmLoanAccCollectTrxCode")
    protected int outGrpCollectionOutGrmLoanAccCollectTrxCode;
    @XmlElement(name = "OutGrpCollectionOutGrmLoanAccCollectTrxUnit")
    protected int outGrpCollectionOutGrmLoanAccCollectTrxUnit;
    @XmlElement(name = "OutGrpCollectionOutGrmLoanAccCollectTrxUsr")
    protected String outGrpCollectionOutGrmLoanAccCollectTrxUsr;

    /**
     * Gets the value of the outGrpCollectionOutGrmLoanAccCollectCollectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCollectionOutGrmLoanAccCollectCollectDate() {
        return outGrpCollectionOutGrmLoanAccCollectCollectDate;
    }

    /**
     * Sets the value of the outGrpCollectionOutGrmLoanAccCollectCollectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCollectionOutGrmLoanAccCollectCollectDate(XMLGregorianCalendar value) {
        this.outGrpCollectionOutGrmLoanAccCollectCollectDate = value;
    }

    /**
     * Gets the value of the outGrpCollectionOutGrmLoanAccCollectCollectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollectionOutGrmLoanAccCollectCollectionStatus() {
        return outGrpCollectionOutGrmLoanAccCollectCollectionStatus;
    }

    /**
     * Sets the value of the outGrpCollectionOutGrmLoanAccCollectCollectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollectionOutGrmLoanAccCollectCollectionStatus(String value) {
        this.outGrpCollectionOutGrmLoanAccCollectCollectionStatus = value;
    }

    /**
     * Gets the value of the outGrpCollectionOutGrmLoanAccCollectCollectionTries property.
     * 
     */
    public short getOutGrpCollectionOutGrmLoanAccCollectCollectionTries() {
        return outGrpCollectionOutGrmLoanAccCollectCollectionTries;
    }

    /**
     * Sets the value of the outGrpCollectionOutGrmLoanAccCollectCollectionTries property.
     * 
     */
    public void setOutGrpCollectionOutGrmLoanAccCollectCollectionTries(short value) {
        this.outGrpCollectionOutGrmLoanAccCollectCollectionTries = value;
    }

    /**
     * Gets the value of the outGrpCollectionOutGrmLoanAccCollectTrxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollectionOutGrmLoanAccCollectTrxAmount() {
        return outGrpCollectionOutGrmLoanAccCollectTrxAmount;
    }

    /**
     * Sets the value of the outGrpCollectionOutGrmLoanAccCollectTrxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollectionOutGrmLoanAccCollectTrxAmount(BigDecimal value) {
        this.outGrpCollectionOutGrmLoanAccCollectTrxAmount = value;
    }

    /**
     * Gets the value of the outGrpCollectionOutGrmLoanAccCollectTrxCode property.
     * 
     */
    public int getOutGrpCollectionOutGrmLoanAccCollectTrxCode() {
        return outGrpCollectionOutGrmLoanAccCollectTrxCode;
    }

    /**
     * Sets the value of the outGrpCollectionOutGrmLoanAccCollectTrxCode property.
     * 
     */
    public void setOutGrpCollectionOutGrmLoanAccCollectTrxCode(int value) {
        this.outGrpCollectionOutGrmLoanAccCollectTrxCode = value;
    }

    /**
     * Gets the value of the outGrpCollectionOutGrmLoanAccCollectTrxUnit property.
     * 
     */
    public int getOutGrpCollectionOutGrmLoanAccCollectTrxUnit() {
        return outGrpCollectionOutGrmLoanAccCollectTrxUnit;
    }

    /**
     * Sets the value of the outGrpCollectionOutGrmLoanAccCollectTrxUnit property.
     * 
     */
    public void setOutGrpCollectionOutGrmLoanAccCollectTrxUnit(int value) {
        this.outGrpCollectionOutGrmLoanAccCollectTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpCollectionOutGrmLoanAccCollectTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollectionOutGrmLoanAccCollectTrxUsr() {
        return outGrpCollectionOutGrmLoanAccCollectTrxUsr;
    }

    /**
     * Sets the value of the outGrpCollectionOutGrmLoanAccCollectTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollectionOutGrmLoanAccCollectTrxUsr(String value) {
        this.outGrpCollectionOutGrmLoanAccCollectTrxUsr = value;
    }

}
