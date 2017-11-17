
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0357VOutGrpMntExtraitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0357VOutGrpMntExtraitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpMntExtraitOutGrpTimeDepMntExtrComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpMntExtraitOutGrpTimeDepMntExtrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0357VOutGrpMntExtraitItem", propOrder = {
    "outGrpMntExtraitOutGrpTimeDepMntExtrComments",
    "outGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate",
    "outGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd",
    "outGrpMntExtraitOutGrpTimeDepMntExtrTrxDate"
})
public class D0357VOutGrpMntExtraitItem {

    @XmlElement(name = "OutGrpMntExtraitOutGrpTimeDepMntExtrComments")
    protected String outGrpMntExtraitOutGrpTimeDepMntExtrComments;
    @XmlElement(name = "OutGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate", required = true)
    protected BigDecimal outGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate;
    @XmlElement(name = "OutGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd")
    protected String outGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd;
    @XmlElement(name = "OutGrpMntExtraitOutGrpTimeDepMntExtrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpMntExtraitOutGrpTimeDepMntExtrTrxDate;

    /**
     * Gets the value of the outGrpMntExtraitOutGrpTimeDepMntExtrComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMntExtraitOutGrpTimeDepMntExtrComments() {
        return outGrpMntExtraitOutGrpTimeDepMntExtrComments;
    }

    /**
     * Sets the value of the outGrpMntExtraitOutGrpTimeDepMntExtrComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMntExtraitOutGrpTimeDepMntExtrComments(String value) {
        this.outGrpMntExtraitOutGrpTimeDepMntExtrComments = value;
    }

    /**
     * Gets the value of the outGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate() {
        return outGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate;
    }

    /**
     * Sets the value of the outGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate(BigDecimal value) {
        this.outGrpMntExtraitOutGrpTimeDepMntExtrICrInterRate = value;
    }

    /**
     * Gets the value of the outGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd() {
        return outGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd;
    }

    /**
     * Sets the value of the outGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd(String value) {
        this.outGrpMntExtraitOutGrpTimeDepMntExtrInterestPayInd = value;
    }

    /**
     * Gets the value of the outGrpMntExtraitOutGrpTimeDepMntExtrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpMntExtraitOutGrpTimeDepMntExtrTrxDate() {
        return outGrpMntExtraitOutGrpTimeDepMntExtrTrxDate;
    }

    /**
     * Sets the value of the outGrpMntExtraitOutGrpTimeDepMntExtrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpMntExtraitOutGrpTimeDepMntExtrTrxDate(XMLGregorianCalendar value) {
        this.outGrpMntExtraitOutGrpTimeDepMntExtrTrxDate = value;
    }

}
