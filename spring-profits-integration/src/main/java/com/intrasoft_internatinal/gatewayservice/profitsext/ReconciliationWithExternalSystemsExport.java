
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReconciliationWithExternalSystemsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconciliationWithExternalSystemsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutTrxRecoveryGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrxRecoveryIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxRecoveryPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrxRecoveryReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrxRecoveryTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrxRecoveryTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxRecoveryTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrxRecoveryTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxRecoveryTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationWithExternalSystemsExport", propOrder = {
    "outTrxRecoveryGrpSubscript",
    "outTrxRecoveryIdChannel",
    "outTrxRecoveryPrftSystem",
    "outTrxRecoveryReferenceNumber",
    "outTrxRecoveryTrxDate",
    "outTrxRecoveryTrxUnit",
    "outTrxRecoveryTrxUsr",
    "outTrxRecoveryTrxUsrSn",
    "outTrxRecoveryTunInternalSn"
})
public class ReconciliationWithExternalSystemsExport
    extends BaseExport
{

    @XmlElement(name = "OutTrxRecoveryGrpSubscript")
    protected short outTrxRecoveryGrpSubscript;
    @XmlElement(name = "OutTrxRecoveryIdChannel")
    protected int outTrxRecoveryIdChannel;
    @XmlElement(name = "OutTrxRecoveryPrftSystem")
    protected short outTrxRecoveryPrftSystem;
    @XmlElement(name = "OutTrxRecoveryReferenceNumber")
    protected String outTrxRecoveryReferenceNumber;
    @XmlElement(name = "OutTrxRecoveryTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTrxRecoveryTrxDate;
    @XmlElement(name = "OutTrxRecoveryTrxUnit")
    protected int outTrxRecoveryTrxUnit;
    @XmlElement(name = "OutTrxRecoveryTrxUsr")
    protected String outTrxRecoveryTrxUsr;
    @XmlElement(name = "OutTrxRecoveryTrxUsrSn")
    protected int outTrxRecoveryTrxUsrSn;
    @XmlElement(name = "OutTrxRecoveryTunInternalSn")
    protected short outTrxRecoveryTunInternalSn;

    /**
     * Gets the value of the outTrxRecoveryGrpSubscript property.
     * 
     */
    public short getOutTrxRecoveryGrpSubscript() {
        return outTrxRecoveryGrpSubscript;
    }

    /**
     * Sets the value of the outTrxRecoveryGrpSubscript property.
     * 
     */
    public void setOutTrxRecoveryGrpSubscript(short value) {
        this.outTrxRecoveryGrpSubscript = value;
    }

    /**
     * Gets the value of the outTrxRecoveryIdChannel property.
     * 
     */
    public int getOutTrxRecoveryIdChannel() {
        return outTrxRecoveryIdChannel;
    }

    /**
     * Sets the value of the outTrxRecoveryIdChannel property.
     * 
     */
    public void setOutTrxRecoveryIdChannel(int value) {
        this.outTrxRecoveryIdChannel = value;
    }

    /**
     * Gets the value of the outTrxRecoveryPrftSystem property.
     * 
     */
    public short getOutTrxRecoveryPrftSystem() {
        return outTrxRecoveryPrftSystem;
    }

    /**
     * Sets the value of the outTrxRecoveryPrftSystem property.
     * 
     */
    public void setOutTrxRecoveryPrftSystem(short value) {
        this.outTrxRecoveryPrftSystem = value;
    }

    /**
     * Gets the value of the outTrxRecoveryReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrxRecoveryReferenceNumber() {
        return outTrxRecoveryReferenceNumber;
    }

    /**
     * Sets the value of the outTrxRecoveryReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrxRecoveryReferenceNumber(String value) {
        this.outTrxRecoveryReferenceNumber = value;
    }

    /**
     * Gets the value of the outTrxRecoveryTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTrxRecoveryTrxDate() {
        return outTrxRecoveryTrxDate;
    }

    /**
     * Sets the value of the outTrxRecoveryTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTrxRecoveryTrxDate(XMLGregorianCalendar value) {
        this.outTrxRecoveryTrxDate = value;
    }

    /**
     * Gets the value of the outTrxRecoveryTrxUnit property.
     * 
     */
    public int getOutTrxRecoveryTrxUnit() {
        return outTrxRecoveryTrxUnit;
    }

    /**
     * Sets the value of the outTrxRecoveryTrxUnit property.
     * 
     */
    public void setOutTrxRecoveryTrxUnit(int value) {
        this.outTrxRecoveryTrxUnit = value;
    }

    /**
     * Gets the value of the outTrxRecoveryTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrxRecoveryTrxUsr() {
        return outTrxRecoveryTrxUsr;
    }

    /**
     * Sets the value of the outTrxRecoveryTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrxRecoveryTrxUsr(String value) {
        this.outTrxRecoveryTrxUsr = value;
    }

    /**
     * Gets the value of the outTrxRecoveryTrxUsrSn property.
     * 
     */
    public int getOutTrxRecoveryTrxUsrSn() {
        return outTrxRecoveryTrxUsrSn;
    }

    /**
     * Sets the value of the outTrxRecoveryTrxUsrSn property.
     * 
     */
    public void setOutTrxRecoveryTrxUsrSn(int value) {
        this.outTrxRecoveryTrxUsrSn = value;
    }

    /**
     * Gets the value of the outTrxRecoveryTunInternalSn property.
     * 
     */
    public short getOutTrxRecoveryTunInternalSn() {
        return outTrxRecoveryTunInternalSn;
    }

    /**
     * Sets the value of the outTrxRecoveryTunInternalSn property.
     * 
     */
    public void setOutTrxRecoveryTunInternalSn(short value) {
        this.outTrxRecoveryTunInternalSn = value;
    }

}
