
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpIssComAppItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpIssComAppItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppIssProdDocDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppIssProdDocId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppIssProdDocProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpIssComAppItem", propOrder = {
    "outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate",
    "outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser",
    "outGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId",
    "outGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus",
    "outGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr",
    "outGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier",
    "outGrpIssComAppOutGrmIssComAppIssProdDocDescr",
    "outGrpIssComAppOutGrmIssComAppIssProdDocId",
    "outGrpIssComAppOutGrmIssComAppIssProdDocProduct",
    "outGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8"
})
public class OutGrpIssComAppItem {

    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate;
    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser")
    protected String outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser;
    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId")
    protected int outGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId;
    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus")
    protected String outGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus;
    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr")
    protected int outGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr;
    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier")
    protected double outGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier;
    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppIssProdDocDescr")
    protected String outGrpIssComAppOutGrmIssComAppIssProdDocDescr;
    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppIssProdDocId")
    protected int outGrpIssComAppOutGrmIssComAppIssProdDocId;
    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppIssProdDocProduct")
    protected int outGrpIssComAppOutGrmIssComAppIssProdDocProduct;
    @XmlElement(name = "OutGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8")
    protected String outGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8;

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate() {
        return outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate(XMLGregorianCalendar value) {
        this.outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprDate = value;
    }

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser() {
        return outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser(String value) {
        this.outGrpIssComAppOutGrmIssComAppIssCommitmentAppApprUser = value;
    }

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId property.
     * 
     */
    public int getOutGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId() {
        return outGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId property.
     * 
     */
    public void setOutGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId(int value) {
        this.outGrpIssComAppOutGrmIssComAppIssCommitmentAppDocId = value;
    }

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus() {
        return outGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus(String value) {
        this.outGrpIssComAppOutGrmIssComAppIssCommitmentAppEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr property.
     * 
     */
    public int getOutGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr() {
        return outGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr property.
     * 
     */
    public void setOutGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr(int value) {
        this.outGrpIssComAppOutGrmIssComAppIssCommitmentAppIdAppr = value;
    }

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier property.
     * 
     */
    public double getOutGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier() {
        return outGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier property.
     * 
     */
    public void setOutGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier(double value) {
        this.outGrpIssComAppOutGrmIssComAppIssCommitmentAppTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppIssProdDocDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIssComAppOutGrmIssComAppIssProdDocDescr() {
        return outGrpIssComAppOutGrmIssComAppIssProdDocDescr;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppIssProdDocDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIssComAppOutGrmIssComAppIssProdDocDescr(String value) {
        this.outGrpIssComAppOutGrmIssComAppIssProdDocDescr = value;
    }

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppIssProdDocId property.
     * 
     */
    public int getOutGrpIssComAppOutGrmIssComAppIssProdDocId() {
        return outGrpIssComAppOutGrmIssComAppIssProdDocId;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppIssProdDocId property.
     * 
     */
    public void setOutGrpIssComAppOutGrmIssComAppIssProdDocId(int value) {
        this.outGrpIssComAppOutGrmIssComAppIssProdDocId = value;
    }

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppIssProdDocProduct property.
     * 
     */
    public int getOutGrpIssComAppOutGrmIssComAppIssProdDocProduct() {
        return outGrpIssComAppOutGrmIssComAppIssProdDocProduct;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppIssProdDocProduct property.
     * 
     */
    public void setOutGrpIssComAppOutGrmIssComAppIssProdDocProduct(int value) {
        this.outGrpIssComAppOutGrmIssComAppIssProdDocProduct = value;
    }

    /**
     * Gets the value of the outGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8() {
        return outGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8;
    }

    /**
     * Sets the value of the outGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8(String value) {
        this.outGrpIssComAppOutGrmIssComAppStatusDescrCharSuppliedChar8 = value;
    }

}
