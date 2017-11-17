
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2004VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2004VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpSrvLogOutGrmSrvLogMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSrvLogOutGrmSrvLogMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSrvLogOutGrmSrvLogMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpSrvLogOutGrmSrvLogMntRecordingTmstamp_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2004VOutGrpSrvLogItem", propOrder = {
    "outGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript",
    "outGrpSrvLogOutGrmSrvLogMntRecordingIdJustific",
    "outGrpSrvLogOutGrmSrvLogMntRecordingIdProduct",
    "outGrpSrvLogOutGrmSrvLogMntRecordingTmstamp",
    "outGrpSrvLogOutGrmSrvLogMntRecordingTmstampStr",
    "outGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn"
})
public class MC2004VOutGrpSrvLogItem {

    @XmlElement(name = "OutGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript")
    protected short outGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript;
    @XmlElement(name = "OutGrpSrvLogOutGrmSrvLogMntRecordingIdJustific")
    protected int outGrpSrvLogOutGrmSrvLogMntRecordingIdJustific;
    @XmlElement(name = "OutGrpSrvLogOutGrmSrvLogMntRecordingIdProduct")
    protected int outGrpSrvLogOutGrmSrvLogMntRecordingIdProduct;
    @XmlElement(name = "OutGrpSrvLogOutGrmSrvLogMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpSrvLogOutGrmSrvLogMntRecordingTmstamp;
    @XmlElement(name = "OutGrpSrvLogOutGrmSrvLogMntRecordingTmstamp_Str")
    protected String outGrpSrvLogOutGrmSrvLogMntRecordingTmstampStr;
    @XmlElement(name = "OutGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn")
    protected int outGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn;

    /**
     * Gets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript property.
     * 
     */
    public short getOutGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript() {
        return outGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript property.
     * 
     */
    public void setOutGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript(short value) {
        this.outGrpSrvLogOutGrmSrvLogMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingIdJustific property.
     * 
     */
    public int getOutGrpSrvLogOutGrmSrvLogMntRecordingIdJustific() {
        return outGrpSrvLogOutGrmSrvLogMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingIdJustific property.
     * 
     */
    public void setOutGrpSrvLogOutGrmSrvLogMntRecordingIdJustific(int value) {
        this.outGrpSrvLogOutGrmSrvLogMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingIdProduct property.
     * 
     */
    public int getOutGrpSrvLogOutGrmSrvLogMntRecordingIdProduct() {
        return outGrpSrvLogOutGrmSrvLogMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingIdProduct property.
     * 
     */
    public void setOutGrpSrvLogOutGrmSrvLogMntRecordingIdProduct(int value) {
        this.outGrpSrvLogOutGrmSrvLogMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpSrvLogOutGrmSrvLogMntRecordingTmstamp() {
        return outGrpSrvLogOutGrmSrvLogMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpSrvLogOutGrmSrvLogMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outGrpSrvLogOutGrmSrvLogMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingTmstampStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSrvLogOutGrmSrvLogMntRecordingTmstampStr() {
        return outGrpSrvLogOutGrmSrvLogMntRecordingTmstampStr;
    }

    /**
     * Sets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingTmstampStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSrvLogOutGrmSrvLogMntRecordingTmstampStr(String value) {
        this.outGrpSrvLogOutGrmSrvLogMntRecordingTmstampStr = value;
    }

    /**
     * Gets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn() {
        return outGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn(int value) {
        this.outGrpSrvLogOutGrmSrvLogMntRecordingTrxUsrSn = value;
    }

}
