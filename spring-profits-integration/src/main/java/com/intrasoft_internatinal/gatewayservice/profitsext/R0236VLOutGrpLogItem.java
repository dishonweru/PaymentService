
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for R0236VLOutGrpLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VLOutGrpLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLogOutGrmSrvLogMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLogOutGrmSrvLogMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmSrvLogMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmSrvLogMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLogOutGrmSrvLogMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VLOutGrpLogItem", propOrder = {
    "outGrpLogOutGrmSrvLogMntRecordingGrpSubscript",
    "outGrpLogOutGrmSrvLogMntRecordingIdJustific",
    "outGrpLogOutGrmSrvLogMntRecordingIdProduct",
    "outGrpLogOutGrmSrvLogMntRecordingTmstamp",
    "outGrpLogOutGrmSrvLogMntRecordingTrxUsrSn"
})
public class R0236VLOutGrpLogItem {

    @XmlElement(name = "OutGrpLogOutGrmSrvLogMntRecordingGrpSubscript")
    protected short outGrpLogOutGrmSrvLogMntRecordingGrpSubscript;
    @XmlElement(name = "OutGrpLogOutGrmSrvLogMntRecordingIdJustific")
    protected int outGrpLogOutGrmSrvLogMntRecordingIdJustific;
    @XmlElement(name = "OutGrpLogOutGrmSrvLogMntRecordingIdProduct")
    protected int outGrpLogOutGrmSrvLogMntRecordingIdProduct;
    @XmlElement(name = "OutGrpLogOutGrmSrvLogMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLogOutGrmSrvLogMntRecordingTmstamp;
    @XmlElement(name = "OutGrpLogOutGrmSrvLogMntRecordingTrxUsrSn")
    protected int outGrpLogOutGrmSrvLogMntRecordingTrxUsrSn;

    /**
     * Gets the value of the outGrpLogOutGrmSrvLogMntRecordingGrpSubscript property.
     * 
     */
    public short getOutGrpLogOutGrmSrvLogMntRecordingGrpSubscript() {
        return outGrpLogOutGrmSrvLogMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outGrpLogOutGrmSrvLogMntRecordingGrpSubscript property.
     * 
     */
    public void setOutGrpLogOutGrmSrvLogMntRecordingGrpSubscript(short value) {
        this.outGrpLogOutGrmSrvLogMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmSrvLogMntRecordingIdJustific property.
     * 
     */
    public int getOutGrpLogOutGrmSrvLogMntRecordingIdJustific() {
        return outGrpLogOutGrmSrvLogMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outGrpLogOutGrmSrvLogMntRecordingIdJustific property.
     * 
     */
    public void setOutGrpLogOutGrmSrvLogMntRecordingIdJustific(int value) {
        this.outGrpLogOutGrmSrvLogMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmSrvLogMntRecordingIdProduct property.
     * 
     */
    public int getOutGrpLogOutGrmSrvLogMntRecordingIdProduct() {
        return outGrpLogOutGrmSrvLogMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outGrpLogOutGrmSrvLogMntRecordingIdProduct property.
     * 
     */
    public void setOutGrpLogOutGrmSrvLogMntRecordingIdProduct(int value) {
        this.outGrpLogOutGrmSrvLogMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmSrvLogMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLogOutGrmSrvLogMntRecordingTmstamp() {
        return outGrpLogOutGrmSrvLogMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outGrpLogOutGrmSrvLogMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLogOutGrmSrvLogMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outGrpLogOutGrmSrvLogMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmSrvLogMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutGrpLogOutGrmSrvLogMntRecordingTrxUsrSn() {
        return outGrpLogOutGrmSrvLogMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outGrpLogOutGrmSrvLogMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutGrpLogOutGrmSrvLogMntRecordingTrxUsrSn(int value) {
        this.outGrpLogOutGrmSrvLogMntRecordingTrxUsrSn = value;
    }

}
