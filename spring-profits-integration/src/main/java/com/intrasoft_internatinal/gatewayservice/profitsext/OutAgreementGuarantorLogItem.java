
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutAgreementGuarantorLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutAgreementGuarantorLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutAgreementGuarantorLogItem", propOrder = {
    "outGrpLogOutGrmLogMntRecordingTrxUsrSn",
    "outGrpLogOutGrmLogMntRecordingGrpSubscript",
    "outGrpLogOutGrmLogMntRecordingIdProduct",
    "outGrpLogOutGrmLogMntRecordingIdJustific",
    "outGrpLogOutGrmLogMntRecordingTmstamp"
})
public class OutAgreementGuarantorLogItem {

    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTrxUsrSn")
    protected int outGrpLogOutGrmLogMntRecordingTrxUsrSn;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingGrpSubscript")
    protected short outGrpLogOutGrmLogMntRecordingGrpSubscript;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingIdProduct")
    protected int outGrpLogOutGrmLogMntRecordingIdProduct;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingIdJustific")
    protected int outGrpLogOutGrmLogMntRecordingIdJustific;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLogOutGrmLogMntRecordingTmstamp;

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutGrpLogOutGrmLogMntRecordingTrxUsrSn() {
        return outGrpLogOutGrmLogMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingTrxUsrSn(int value) {
        this.outGrpLogOutGrmLogMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public short getOutGrpLogOutGrmLogMntRecordingGrpSubscript() {
        return outGrpLogOutGrmLogMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingGrpSubscript(short value) {
        this.outGrpLogOutGrmLogMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingIdProduct property.
     * 
     */
    public int getOutGrpLogOutGrmLogMntRecordingIdProduct() {
        return outGrpLogOutGrmLogMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingIdProduct property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingIdProduct(int value) {
        this.outGrpLogOutGrmLogMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingIdJustific property.
     * 
     */
    public int getOutGrpLogOutGrmLogMntRecordingIdJustific() {
        return outGrpLogOutGrmLogMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingIdJustific property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingIdJustific(int value) {
        this.outGrpLogOutGrmLogMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLogOutGrmLogMntRecordingTmstamp() {
        return outGrpLogOutGrmLogMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLogOutGrmLogMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outGrpLogOutGrmLogMntRecordingTmstamp = value;
    }

}
