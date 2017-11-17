
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2027VInGrpShipsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2027VInGrpShipsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpShipsInGrmCarrierGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmCarrierGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpShipsInGrmCollateralDetailComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmCollateralDetailLawyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmCollateralDetailMainConnectInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmCollateralDetailPrenotationAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpShipsInGrmCollateralDetailRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpShipsInGrmCollateralDetailRemovalInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmCollateralDetailSheet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmCollateralDetailVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmMainIndIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmRecrsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmRecrsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpShipsInGrmRemovIndIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmScharIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpShipsInGrmShipId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGrpShipsInGrmShipShipDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2027VInGrpShipsItem", propOrder = {
    "inGrpShipsInGrmCarrierGenericDetailDescription",
    "inGrpShipsInGrmCarrierGenericDetailSerialNum",
    "inGrpShipsInGrmCollateralDetailComments",
    "inGrpShipsInGrmCollateralDetailLawyer",
    "inGrpShipsInGrmCollateralDetailMainConnectInd",
    "inGrpShipsInGrmCollateralDetailPrenotationAmn",
    "inGrpShipsInGrmCollateralDetailRemovalDate",
    "inGrpShipsInGrmCollateralDetailRemovalInd",
    "inGrpShipsInGrmCollateralDetailSheet",
    "inGrpShipsInGrmCollateralDetailVolume",
    "inGrpShipsInGrmMainIndIefSuppliedChar5",
    "inGrpShipsInGrmRecrsGenericDetailDescription",
    "inGrpShipsInGrmRecrsGenericDetailSerialNum",
    "inGrpShipsInGrmRemovIndIefSuppliedChar5",
    "inGrpShipsInGrmScharIefSuppliedSelectChar",
    "inGrpShipsInGrmShipId",
    "inGrpShipsInGrmShipShipDescription"
})
public class MC2027VInGrpShipsItem {

    @XmlElement(name = "InGrpShipsInGrmCarrierGenericDetailDescription")
    protected String inGrpShipsInGrmCarrierGenericDetailDescription;
    @XmlElement(name = "InGrpShipsInGrmCarrierGenericDetailSerialNum")
    protected int inGrpShipsInGrmCarrierGenericDetailSerialNum;
    @XmlElement(name = "InGrpShipsInGrmCollateralDetailComments")
    protected String inGrpShipsInGrmCollateralDetailComments;
    @XmlElement(name = "InGrpShipsInGrmCollateralDetailLawyer")
    protected String inGrpShipsInGrmCollateralDetailLawyer;
    @XmlElement(name = "InGrpShipsInGrmCollateralDetailMainConnectInd")
    protected String inGrpShipsInGrmCollateralDetailMainConnectInd;
    @XmlElement(name = "InGrpShipsInGrmCollateralDetailPrenotationAmn", required = true)
    protected BigDecimal inGrpShipsInGrmCollateralDetailPrenotationAmn;
    @XmlElement(name = "InGrpShipsInGrmCollateralDetailRemovalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpShipsInGrmCollateralDetailRemovalDate;
    @XmlElement(name = "InGrpShipsInGrmCollateralDetailRemovalInd")
    protected String inGrpShipsInGrmCollateralDetailRemovalInd;
    @XmlElement(name = "InGrpShipsInGrmCollateralDetailSheet")
    protected String inGrpShipsInGrmCollateralDetailSheet;
    @XmlElement(name = "InGrpShipsInGrmCollateralDetailVolume")
    protected String inGrpShipsInGrmCollateralDetailVolume;
    @XmlElement(name = "InGrpShipsInGrmMainIndIefSuppliedChar5")
    protected String inGrpShipsInGrmMainIndIefSuppliedChar5;
    @XmlElement(name = "InGrpShipsInGrmRecrsGenericDetailDescription")
    protected String inGrpShipsInGrmRecrsGenericDetailDescription;
    @XmlElement(name = "InGrpShipsInGrmRecrsGenericDetailSerialNum")
    protected int inGrpShipsInGrmRecrsGenericDetailSerialNum;
    @XmlElement(name = "InGrpShipsInGrmRemovIndIefSuppliedChar5")
    protected String inGrpShipsInGrmRemovIndIefSuppliedChar5;
    @XmlElement(name = "InGrpShipsInGrmScharIefSuppliedSelectChar")
    protected String inGrpShipsInGrmScharIefSuppliedSelectChar;
    @XmlElement(name = "InGrpShipsInGrmShipId")
    protected double inGrpShipsInGrmShipId;
    @XmlElement(name = "InGrpShipsInGrmShipShipDescription")
    protected String inGrpShipsInGrmShipShipDescription;

    /**
     * Gets the value of the inGrpShipsInGrmCarrierGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmCarrierGenericDetailDescription() {
        return inGrpShipsInGrmCarrierGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCarrierGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmCarrierGenericDetailDescription(String value) {
        this.inGrpShipsInGrmCarrierGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmCarrierGenericDetailSerialNum property.
     * 
     */
    public int getInGrpShipsInGrmCarrierGenericDetailSerialNum() {
        return inGrpShipsInGrmCarrierGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCarrierGenericDetailSerialNum property.
     * 
     */
    public void setInGrpShipsInGrmCarrierGenericDetailSerialNum(int value) {
        this.inGrpShipsInGrmCarrierGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmCollateralDetailComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmCollateralDetailComments() {
        return inGrpShipsInGrmCollateralDetailComments;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCollateralDetailComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmCollateralDetailComments(String value) {
        this.inGrpShipsInGrmCollateralDetailComments = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmCollateralDetailLawyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmCollateralDetailLawyer() {
        return inGrpShipsInGrmCollateralDetailLawyer;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCollateralDetailLawyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmCollateralDetailLawyer(String value) {
        this.inGrpShipsInGrmCollateralDetailLawyer = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmCollateralDetailMainConnectInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmCollateralDetailMainConnectInd() {
        return inGrpShipsInGrmCollateralDetailMainConnectInd;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCollateralDetailMainConnectInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmCollateralDetailMainConnectInd(String value) {
        this.inGrpShipsInGrmCollateralDetailMainConnectInd = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmCollateralDetailPrenotationAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpShipsInGrmCollateralDetailPrenotationAmn() {
        return inGrpShipsInGrmCollateralDetailPrenotationAmn;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCollateralDetailPrenotationAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpShipsInGrmCollateralDetailPrenotationAmn(BigDecimal value) {
        this.inGrpShipsInGrmCollateralDetailPrenotationAmn = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmCollateralDetailRemovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpShipsInGrmCollateralDetailRemovalDate() {
        return inGrpShipsInGrmCollateralDetailRemovalDate;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCollateralDetailRemovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpShipsInGrmCollateralDetailRemovalDate(XMLGregorianCalendar value) {
        this.inGrpShipsInGrmCollateralDetailRemovalDate = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmCollateralDetailRemovalInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmCollateralDetailRemovalInd() {
        return inGrpShipsInGrmCollateralDetailRemovalInd;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCollateralDetailRemovalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmCollateralDetailRemovalInd(String value) {
        this.inGrpShipsInGrmCollateralDetailRemovalInd = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmCollateralDetailSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmCollateralDetailSheet() {
        return inGrpShipsInGrmCollateralDetailSheet;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCollateralDetailSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmCollateralDetailSheet(String value) {
        this.inGrpShipsInGrmCollateralDetailSheet = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmCollateralDetailVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmCollateralDetailVolume() {
        return inGrpShipsInGrmCollateralDetailVolume;
    }

    /**
     * Sets the value of the inGrpShipsInGrmCollateralDetailVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmCollateralDetailVolume(String value) {
        this.inGrpShipsInGrmCollateralDetailVolume = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmMainIndIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmMainIndIefSuppliedChar5() {
        return inGrpShipsInGrmMainIndIefSuppliedChar5;
    }

    /**
     * Sets the value of the inGrpShipsInGrmMainIndIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmMainIndIefSuppliedChar5(String value) {
        this.inGrpShipsInGrmMainIndIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmRecrsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmRecrsGenericDetailDescription() {
        return inGrpShipsInGrmRecrsGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpShipsInGrmRecrsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmRecrsGenericDetailDescription(String value) {
        this.inGrpShipsInGrmRecrsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmRecrsGenericDetailSerialNum property.
     * 
     */
    public int getInGrpShipsInGrmRecrsGenericDetailSerialNum() {
        return inGrpShipsInGrmRecrsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpShipsInGrmRecrsGenericDetailSerialNum property.
     * 
     */
    public void setInGrpShipsInGrmRecrsGenericDetailSerialNum(int value) {
        this.inGrpShipsInGrmRecrsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmRemovIndIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmRemovIndIefSuppliedChar5() {
        return inGrpShipsInGrmRemovIndIefSuppliedChar5;
    }

    /**
     * Sets the value of the inGrpShipsInGrmRemovIndIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmRemovIndIefSuppliedChar5(String value) {
        this.inGrpShipsInGrmRemovIndIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmScharIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmScharIefSuppliedSelectChar() {
        return inGrpShipsInGrmScharIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpShipsInGrmScharIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmScharIefSuppliedSelectChar(String value) {
        this.inGrpShipsInGrmScharIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmShipId property.
     * 
     */
    public double getInGrpShipsInGrmShipId() {
        return inGrpShipsInGrmShipId;
    }

    /**
     * Sets the value of the inGrpShipsInGrmShipId property.
     * 
     */
    public void setInGrpShipsInGrmShipId(double value) {
        this.inGrpShipsInGrmShipId = value;
    }

    /**
     * Gets the value of the inGrpShipsInGrmShipShipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpShipsInGrmShipShipDescription() {
        return inGrpShipsInGrmShipShipDescription;
    }

    /**
     * Sets the value of the inGrpShipsInGrmShipShipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpShipsInGrmShipShipDescription(String value) {
        this.inGrpShipsInGrmShipShipDescription = value;
    }

}
