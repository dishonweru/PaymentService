
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CI4000VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI4000VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmUnitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI4000VOutGrpItem", propOrder = {
    "outGrpOutGrmUnitCode",
    "outGrpOutGrmUnitTmstamp"
})
public class CI4000VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmUnitCode")
    protected int outGrpOutGrmUnitCode;
    @XmlElement(name = "OutGrpOutGrmUnitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmUnitTmstamp;

    /**
     * Gets the value of the outGrpOutGrmUnitCode property.
     * 
     */
    public int getOutGrpOutGrmUnitCode() {
        return outGrpOutGrmUnitCode;
    }

    /**
     * Sets the value of the outGrpOutGrmUnitCode property.
     * 
     */
    public void setOutGrpOutGrmUnitCode(int value) {
        this.outGrpOutGrmUnitCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmUnitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmUnitTmstamp() {
        return outGrpOutGrmUnitTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmUnitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmUnitTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmUnitTmstamp = value;
    }

}
