
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VOutGrpDocAttachedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VOutGrpDocAttachedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDocAttachedOutGrmAttachedCharSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocAttachedOutGrmCollateralTblDocDocDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocAttachedOutGrmCollateralTblDocInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDocAttachedOutGrmCollateralTblDocPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDocAttachedOutGrmCollateralTblDocRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocAttachedOutGrmCollateralTblDocReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocAttachedOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocAttachedOutGrmScannedCharSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VOutGrpDocAttachedItem", propOrder = {
    "outGrpDocAttachedOutGrmAttachedCharSuppliedChar1",
    "outGrpDocAttachedOutGrmCollateralTblDocDocDescr",
    "outGrpDocAttachedOutGrmCollateralTblDocInternalSn",
    "outGrpDocAttachedOutGrmCollateralTblDocPrftSys",
    "outGrpDocAttachedOutGrmCollateralTblDocRecordType",
    "outGrpDocAttachedOutGrmCollateralTblDocReferenceNumber",
    "outGrpDocAttachedOutGrmIefSuppliedSelectChar",
    "outGrpDocAttachedOutGrmScannedCharSuppliedChar1"
})
public class PFG004VOutGrpDocAttachedItem {

    @XmlElement(name = "OutGrpDocAttachedOutGrmAttachedCharSuppliedChar1")
    protected String outGrpDocAttachedOutGrmAttachedCharSuppliedChar1;
    @XmlElement(name = "OutGrpDocAttachedOutGrmCollateralTblDocDocDescr")
    protected String outGrpDocAttachedOutGrmCollateralTblDocDocDescr;
    @XmlElement(name = "OutGrpDocAttachedOutGrmCollateralTblDocInternalSn")
    protected double outGrpDocAttachedOutGrmCollateralTblDocInternalSn;
    @XmlElement(name = "OutGrpDocAttachedOutGrmCollateralTblDocPrftSys")
    protected short outGrpDocAttachedOutGrmCollateralTblDocPrftSys;
    @XmlElement(name = "OutGrpDocAttachedOutGrmCollateralTblDocRecordType")
    protected String outGrpDocAttachedOutGrmCollateralTblDocRecordType;
    @XmlElement(name = "OutGrpDocAttachedOutGrmCollateralTblDocReferenceNumber")
    protected String outGrpDocAttachedOutGrmCollateralTblDocReferenceNumber;
    @XmlElement(name = "OutGrpDocAttachedOutGrmIefSuppliedSelectChar")
    protected String outGrpDocAttachedOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpDocAttachedOutGrmScannedCharSuppliedChar1")
    protected String outGrpDocAttachedOutGrmScannedCharSuppliedChar1;

    /**
     * Gets the value of the outGrpDocAttachedOutGrmAttachedCharSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocAttachedOutGrmAttachedCharSuppliedChar1() {
        return outGrpDocAttachedOutGrmAttachedCharSuppliedChar1;
    }

    /**
     * Sets the value of the outGrpDocAttachedOutGrmAttachedCharSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocAttachedOutGrmAttachedCharSuppliedChar1(String value) {
        this.outGrpDocAttachedOutGrmAttachedCharSuppliedChar1 = value;
    }

    /**
     * Gets the value of the outGrpDocAttachedOutGrmCollateralTblDocDocDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocAttachedOutGrmCollateralTblDocDocDescr() {
        return outGrpDocAttachedOutGrmCollateralTblDocDocDescr;
    }

    /**
     * Sets the value of the outGrpDocAttachedOutGrmCollateralTblDocDocDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocAttachedOutGrmCollateralTblDocDocDescr(String value) {
        this.outGrpDocAttachedOutGrmCollateralTblDocDocDescr = value;
    }

    /**
     * Gets the value of the outGrpDocAttachedOutGrmCollateralTblDocInternalSn property.
     * 
     */
    public double getOutGrpDocAttachedOutGrmCollateralTblDocInternalSn() {
        return outGrpDocAttachedOutGrmCollateralTblDocInternalSn;
    }

    /**
     * Sets the value of the outGrpDocAttachedOutGrmCollateralTblDocInternalSn property.
     * 
     */
    public void setOutGrpDocAttachedOutGrmCollateralTblDocInternalSn(double value) {
        this.outGrpDocAttachedOutGrmCollateralTblDocInternalSn = value;
    }

    /**
     * Gets the value of the outGrpDocAttachedOutGrmCollateralTblDocPrftSys property.
     * 
     */
    public short getOutGrpDocAttachedOutGrmCollateralTblDocPrftSys() {
        return outGrpDocAttachedOutGrmCollateralTblDocPrftSys;
    }

    /**
     * Sets the value of the outGrpDocAttachedOutGrmCollateralTblDocPrftSys property.
     * 
     */
    public void setOutGrpDocAttachedOutGrmCollateralTblDocPrftSys(short value) {
        this.outGrpDocAttachedOutGrmCollateralTblDocPrftSys = value;
    }

    /**
     * Gets the value of the outGrpDocAttachedOutGrmCollateralTblDocRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocAttachedOutGrmCollateralTblDocRecordType() {
        return outGrpDocAttachedOutGrmCollateralTblDocRecordType;
    }

    /**
     * Sets the value of the outGrpDocAttachedOutGrmCollateralTblDocRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocAttachedOutGrmCollateralTblDocRecordType(String value) {
        this.outGrpDocAttachedOutGrmCollateralTblDocRecordType = value;
    }

    /**
     * Gets the value of the outGrpDocAttachedOutGrmCollateralTblDocReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocAttachedOutGrmCollateralTblDocReferenceNumber() {
        return outGrpDocAttachedOutGrmCollateralTblDocReferenceNumber;
    }

    /**
     * Sets the value of the outGrpDocAttachedOutGrmCollateralTblDocReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocAttachedOutGrmCollateralTblDocReferenceNumber(String value) {
        this.outGrpDocAttachedOutGrmCollateralTblDocReferenceNumber = value;
    }

    /**
     * Gets the value of the outGrpDocAttachedOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocAttachedOutGrmIefSuppliedSelectChar() {
        return outGrpDocAttachedOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpDocAttachedOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocAttachedOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpDocAttachedOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpDocAttachedOutGrmScannedCharSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocAttachedOutGrmScannedCharSuppliedChar1() {
        return outGrpDocAttachedOutGrmScannedCharSuppliedChar1;
    }

    /**
     * Sets the value of the outGrpDocAttachedOutGrmScannedCharSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocAttachedOutGrmScannedCharSuppliedChar1(String value) {
        this.outGrpDocAttachedOutGrmScannedCharSuppliedChar1 = value;
    }

}
