
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2027VOutGrpShipsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2027VOutGrpShipsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpShipsOutGrmCarrierGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmCarrierGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpShipsOutGrmCollateralDetailComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmCollateralDetailLawyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmCollateralDetailMainConnectInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmCollateralDetailPrenotationAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpShipsOutGrmCollateralDetailRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpShipsOutGrmCollateralDetailRemovalInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmCollateralDetailSheet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmCollateralDetailVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmMainIndIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmRecsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmRecsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpShipsOutGrmRemovIndIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmScharIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpShipsOutGrmShipId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpShipsOutGrmShipShipDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2027VOutGrpShipsItem", propOrder = {
    "outGrpShipsOutGrmCarrierGenericDetailDescription",
    "outGrpShipsOutGrmCarrierGenericDetailSerialNum",
    "outGrpShipsOutGrmCollateralDetailComments",
    "outGrpShipsOutGrmCollateralDetailLawyer",
    "outGrpShipsOutGrmCollateralDetailMainConnectInd",
    "outGrpShipsOutGrmCollateralDetailPrenotationAmn",
    "outGrpShipsOutGrmCollateralDetailRemovalDate",
    "outGrpShipsOutGrmCollateralDetailRemovalInd",
    "outGrpShipsOutGrmCollateralDetailSheet",
    "outGrpShipsOutGrmCollateralDetailVolume",
    "outGrpShipsOutGrmMainIndIefSuppliedChar5",
    "outGrpShipsOutGrmRecsGenericDetailDescription",
    "outGrpShipsOutGrmRecsGenericDetailSerialNum",
    "outGrpShipsOutGrmRemovIndIefSuppliedChar5",
    "outGrpShipsOutGrmScharIefSuppliedSelectChar",
    "outGrpShipsOutGrmShipId",
    "outGrpShipsOutGrmShipShipDescription"
})
public class MC2027VOutGrpShipsItem {

    @XmlElement(name = "OutGrpShipsOutGrmCarrierGenericDetailDescription")
    protected String outGrpShipsOutGrmCarrierGenericDetailDescription;
    @XmlElement(name = "OutGrpShipsOutGrmCarrierGenericDetailSerialNum")
    protected int outGrpShipsOutGrmCarrierGenericDetailSerialNum;
    @XmlElement(name = "OutGrpShipsOutGrmCollateralDetailComments")
    protected String outGrpShipsOutGrmCollateralDetailComments;
    @XmlElement(name = "OutGrpShipsOutGrmCollateralDetailLawyer")
    protected String outGrpShipsOutGrmCollateralDetailLawyer;
    @XmlElement(name = "OutGrpShipsOutGrmCollateralDetailMainConnectInd")
    protected String outGrpShipsOutGrmCollateralDetailMainConnectInd;
    @XmlElement(name = "OutGrpShipsOutGrmCollateralDetailPrenotationAmn", required = true)
    protected BigDecimal outGrpShipsOutGrmCollateralDetailPrenotationAmn;
    @XmlElement(name = "OutGrpShipsOutGrmCollateralDetailRemovalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpShipsOutGrmCollateralDetailRemovalDate;
    @XmlElement(name = "OutGrpShipsOutGrmCollateralDetailRemovalInd")
    protected String outGrpShipsOutGrmCollateralDetailRemovalInd;
    @XmlElement(name = "OutGrpShipsOutGrmCollateralDetailSheet")
    protected String outGrpShipsOutGrmCollateralDetailSheet;
    @XmlElement(name = "OutGrpShipsOutGrmCollateralDetailVolume")
    protected String outGrpShipsOutGrmCollateralDetailVolume;
    @XmlElement(name = "OutGrpShipsOutGrmMainIndIefSuppliedChar5")
    protected String outGrpShipsOutGrmMainIndIefSuppliedChar5;
    @XmlElement(name = "OutGrpShipsOutGrmRecsGenericDetailDescription")
    protected String outGrpShipsOutGrmRecsGenericDetailDescription;
    @XmlElement(name = "OutGrpShipsOutGrmRecsGenericDetailSerialNum")
    protected int outGrpShipsOutGrmRecsGenericDetailSerialNum;
    @XmlElement(name = "OutGrpShipsOutGrmRemovIndIefSuppliedChar5")
    protected String outGrpShipsOutGrmRemovIndIefSuppliedChar5;
    @XmlElement(name = "OutGrpShipsOutGrmScharIefSuppliedSelectChar")
    protected String outGrpShipsOutGrmScharIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpShipsOutGrmShipId")
    protected double outGrpShipsOutGrmShipId;
    @XmlElement(name = "OutGrpShipsOutGrmShipShipDescription")
    protected String outGrpShipsOutGrmShipShipDescription;

    /**
     * Gets the value of the outGrpShipsOutGrmCarrierGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmCarrierGenericDetailDescription() {
        return outGrpShipsOutGrmCarrierGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCarrierGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmCarrierGenericDetailDescription(String value) {
        this.outGrpShipsOutGrmCarrierGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmCarrierGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpShipsOutGrmCarrierGenericDetailSerialNum() {
        return outGrpShipsOutGrmCarrierGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCarrierGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpShipsOutGrmCarrierGenericDetailSerialNum(int value) {
        this.outGrpShipsOutGrmCarrierGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmCollateralDetailComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmCollateralDetailComments() {
        return outGrpShipsOutGrmCollateralDetailComments;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCollateralDetailComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmCollateralDetailComments(String value) {
        this.outGrpShipsOutGrmCollateralDetailComments = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmCollateralDetailLawyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmCollateralDetailLawyer() {
        return outGrpShipsOutGrmCollateralDetailLawyer;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCollateralDetailLawyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmCollateralDetailLawyer(String value) {
        this.outGrpShipsOutGrmCollateralDetailLawyer = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmCollateralDetailMainConnectInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmCollateralDetailMainConnectInd() {
        return outGrpShipsOutGrmCollateralDetailMainConnectInd;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCollateralDetailMainConnectInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmCollateralDetailMainConnectInd(String value) {
        this.outGrpShipsOutGrmCollateralDetailMainConnectInd = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmCollateralDetailPrenotationAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpShipsOutGrmCollateralDetailPrenotationAmn() {
        return outGrpShipsOutGrmCollateralDetailPrenotationAmn;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCollateralDetailPrenotationAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpShipsOutGrmCollateralDetailPrenotationAmn(BigDecimal value) {
        this.outGrpShipsOutGrmCollateralDetailPrenotationAmn = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmCollateralDetailRemovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpShipsOutGrmCollateralDetailRemovalDate() {
        return outGrpShipsOutGrmCollateralDetailRemovalDate;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCollateralDetailRemovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpShipsOutGrmCollateralDetailRemovalDate(XMLGregorianCalendar value) {
        this.outGrpShipsOutGrmCollateralDetailRemovalDate = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmCollateralDetailRemovalInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmCollateralDetailRemovalInd() {
        return outGrpShipsOutGrmCollateralDetailRemovalInd;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCollateralDetailRemovalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmCollateralDetailRemovalInd(String value) {
        this.outGrpShipsOutGrmCollateralDetailRemovalInd = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmCollateralDetailSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmCollateralDetailSheet() {
        return outGrpShipsOutGrmCollateralDetailSheet;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCollateralDetailSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmCollateralDetailSheet(String value) {
        this.outGrpShipsOutGrmCollateralDetailSheet = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmCollateralDetailVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmCollateralDetailVolume() {
        return outGrpShipsOutGrmCollateralDetailVolume;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmCollateralDetailVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmCollateralDetailVolume(String value) {
        this.outGrpShipsOutGrmCollateralDetailVolume = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmMainIndIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmMainIndIefSuppliedChar5() {
        return outGrpShipsOutGrmMainIndIefSuppliedChar5;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmMainIndIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmMainIndIefSuppliedChar5(String value) {
        this.outGrpShipsOutGrmMainIndIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmRecsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmRecsGenericDetailDescription() {
        return outGrpShipsOutGrmRecsGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmRecsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmRecsGenericDetailDescription(String value) {
        this.outGrpShipsOutGrmRecsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmRecsGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpShipsOutGrmRecsGenericDetailSerialNum() {
        return outGrpShipsOutGrmRecsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmRecsGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpShipsOutGrmRecsGenericDetailSerialNum(int value) {
        this.outGrpShipsOutGrmRecsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmRemovIndIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmRemovIndIefSuppliedChar5() {
        return outGrpShipsOutGrmRemovIndIefSuppliedChar5;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmRemovIndIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmRemovIndIefSuppliedChar5(String value) {
        this.outGrpShipsOutGrmRemovIndIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmScharIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmScharIefSuppliedSelectChar() {
        return outGrpShipsOutGrmScharIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmScharIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmScharIefSuppliedSelectChar(String value) {
        this.outGrpShipsOutGrmScharIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmShipId property.
     * 
     */
    public double getOutGrpShipsOutGrmShipId() {
        return outGrpShipsOutGrmShipId;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmShipId property.
     * 
     */
    public void setOutGrpShipsOutGrmShipId(double value) {
        this.outGrpShipsOutGrmShipId = value;
    }

    /**
     * Gets the value of the outGrpShipsOutGrmShipShipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpShipsOutGrmShipShipDescription() {
        return outGrpShipsOutGrmShipShipDescription;
    }

    /**
     * Sets the value of the outGrpShipsOutGrmShipShipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpShipsOutGrmShipShipDescription(String value) {
        this.outGrpShipsOutGrmShipShipDescription = value;
    }

}
