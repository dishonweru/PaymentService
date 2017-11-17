
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutSrvGrpLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutSrvGrpLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutSrvGrpLogOutGrmLogMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSrvGrpLogOutGrmLogMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSrvGrpLogOutGrmLogMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSrvGrpLogOutGrmLogMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSrvGrpLogOutGrmLogMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutSrvGrpLog", propOrder = {
    "outSrvGrpLogOutGrmLogMntRecordingGrpSubscript",
    "outSrvGrpLogOutGrmLogMntRecordingIdJustific",
    "outSrvGrpLogOutGrmLogMntRecordingIdProduct",
    "outSrvGrpLogOutGrmLogMntRecordingTmstamp",
    "outSrvGrpLogOutGrmLogMntRecordingTrxUsrSn"
})
public class OutSrvGrpLog {

    @XmlElement(name = "OutSrvGrpLogOutGrmLogMntRecordingGrpSubscript")
    protected short outSrvGrpLogOutGrmLogMntRecordingGrpSubscript;
    @XmlElement(name = "OutSrvGrpLogOutGrmLogMntRecordingIdJustific")
    protected int outSrvGrpLogOutGrmLogMntRecordingIdJustific;
    @XmlElement(name = "OutSrvGrpLogOutGrmLogMntRecordingIdProduct")
    protected int outSrvGrpLogOutGrmLogMntRecordingIdProduct;
    @XmlElement(name = "OutSrvGrpLogOutGrmLogMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSrvGrpLogOutGrmLogMntRecordingTmstamp;
    @XmlElement(name = "OutSrvGrpLogOutGrmLogMntRecordingTrxUsrSn")
    protected int outSrvGrpLogOutGrmLogMntRecordingTrxUsrSn;

    /**
     * Gets the value of the outSrvGrpLogOutGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public short getOutSrvGrpLogOutGrmLogMntRecordingGrpSubscript() {
        return outSrvGrpLogOutGrmLogMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outSrvGrpLogOutGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public void setOutSrvGrpLogOutGrmLogMntRecordingGrpSubscript(short value) {
        this.outSrvGrpLogOutGrmLogMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outSrvGrpLogOutGrmLogMntRecordingIdJustific property.
     * 
     */
    public int getOutSrvGrpLogOutGrmLogMntRecordingIdJustific() {
        return outSrvGrpLogOutGrmLogMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outSrvGrpLogOutGrmLogMntRecordingIdJustific property.
     * 
     */
    public void setOutSrvGrpLogOutGrmLogMntRecordingIdJustific(int value) {
        this.outSrvGrpLogOutGrmLogMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outSrvGrpLogOutGrmLogMntRecordingIdProduct property.
     * 
     */
    public int getOutSrvGrpLogOutGrmLogMntRecordingIdProduct() {
        return outSrvGrpLogOutGrmLogMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outSrvGrpLogOutGrmLogMntRecordingIdProduct property.
     * 
     */
    public void setOutSrvGrpLogOutGrmLogMntRecordingIdProduct(int value) {
        this.outSrvGrpLogOutGrmLogMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outSrvGrpLogOutGrmLogMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSrvGrpLogOutGrmLogMntRecordingTmstamp() {
        return outSrvGrpLogOutGrmLogMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outSrvGrpLogOutGrmLogMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSrvGrpLogOutGrmLogMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outSrvGrpLogOutGrmLogMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outSrvGrpLogOutGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutSrvGrpLogOutGrmLogMntRecordingTrxUsrSn() {
        return outSrvGrpLogOutGrmLogMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outSrvGrpLogOutGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutSrvGrpLogOutGrmLogMntRecordingTrxUsrSn(int value) {
        this.outSrvGrpLogOutGrmLogMntRecordingTrxUsrSn = value;
    }

}
