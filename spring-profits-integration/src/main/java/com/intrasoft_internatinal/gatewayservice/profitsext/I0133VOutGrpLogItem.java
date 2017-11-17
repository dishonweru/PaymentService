
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0133VOutGrpLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0133VOutGrpLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLogOutGrmMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLogOutGrmMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLogOutGrmMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0133VOutGrpLogItem", propOrder = {
    "outGrpLogOutGrmMntRecordingGrpSubscript",
    "outGrpLogOutGrmMntRecordingIdJustific",
    "outGrpLogOutGrmMntRecordingIdProduct",
    "outGrpLogOutGrmMntRecordingTmstamp",
    "outGrpLogOutGrmMntRecordingTrxUsrSn"
})
public class I0133VOutGrpLogItem {

    @XmlElement(name = "OutGrpLogOutGrmMntRecordingGrpSubscript")
    protected short outGrpLogOutGrmMntRecordingGrpSubscript;
    @XmlElement(name = "OutGrpLogOutGrmMntRecordingIdJustific")
    protected int outGrpLogOutGrmMntRecordingIdJustific;
    @XmlElement(name = "OutGrpLogOutGrmMntRecordingIdProduct")
    protected int outGrpLogOutGrmMntRecordingIdProduct;
    @XmlElement(name = "OutGrpLogOutGrmMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLogOutGrmMntRecordingTmstamp;
    @XmlElement(name = "OutGrpLogOutGrmMntRecordingTrxUsrSn")
    protected int outGrpLogOutGrmMntRecordingTrxUsrSn;

    /**
     * Gets the value of the outGrpLogOutGrmMntRecordingGrpSubscript property.
     * 
     */
    public short getOutGrpLogOutGrmMntRecordingGrpSubscript() {
        return outGrpLogOutGrmMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outGrpLogOutGrmMntRecordingGrpSubscript property.
     * 
     */
    public void setOutGrpLogOutGrmMntRecordingGrpSubscript(short value) {
        this.outGrpLogOutGrmMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmMntRecordingIdJustific property.
     * 
     */
    public int getOutGrpLogOutGrmMntRecordingIdJustific() {
        return outGrpLogOutGrmMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outGrpLogOutGrmMntRecordingIdJustific property.
     * 
     */
    public void setOutGrpLogOutGrmMntRecordingIdJustific(int value) {
        this.outGrpLogOutGrmMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmMntRecordingIdProduct property.
     * 
     */
    public int getOutGrpLogOutGrmMntRecordingIdProduct() {
        return outGrpLogOutGrmMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outGrpLogOutGrmMntRecordingIdProduct property.
     * 
     */
    public void setOutGrpLogOutGrmMntRecordingIdProduct(int value) {
        this.outGrpLogOutGrmMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLogOutGrmMntRecordingTmstamp() {
        return outGrpLogOutGrmMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outGrpLogOutGrmMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLogOutGrmMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outGrpLogOutGrmMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutGrpLogOutGrmMntRecordingTrxUsrSn() {
        return outGrpLogOutGrmMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outGrpLogOutGrmMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutGrpLogOutGrmMntRecordingTrxUsrSn(int value) {
        this.outGrpLogOutGrmMntRecordingTrxUsrSn = value;
    }

}
