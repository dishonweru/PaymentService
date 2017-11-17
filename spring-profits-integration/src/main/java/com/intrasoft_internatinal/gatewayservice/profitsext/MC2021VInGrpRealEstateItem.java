
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2021VInGrpRealEstateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2021VInGrpRealEstateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpRealEstateInGrmCarrierGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmCarrierGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpRealEstateInGrmCollateralDetailComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmCollateralDetailLawyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmCollateralDetailMainConnectInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmCollateralDetailPrenotationAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpRealEstateInGrmCollateralDetailRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGrpRealEstateInGrmCollateralDetailRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpRealEstateInGrmCollateralDetailRemovalInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmCollateralDetailSheet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmCollateralDetailVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmLandRegGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmLandRegGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpRealEstateInGrmMainIndIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmRealEstateRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmRecsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmRecsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpRealEstateInGrmRemovIndIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRealEstateInGrmScharIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2021VInGrpRealEstateItem", propOrder = {
    "inGrpRealEstateInGrmCarrierGenericDetailDescription",
    "inGrpRealEstateInGrmCarrierGenericDetailSerialNum",
    "inGrpRealEstateInGrmCollateralDetailComments",
    "inGrpRealEstateInGrmCollateralDetailLawyer",
    "inGrpRealEstateInGrmCollateralDetailMainConnectInd",
    "inGrpRealEstateInGrmCollateralDetailPrenotationAmn",
    "inGrpRealEstateInGrmCollateralDetailRealEstateId",
    "inGrpRealEstateInGrmCollateralDetailRemovalDate",
    "inGrpRealEstateInGrmCollateralDetailRemovalInd",
    "inGrpRealEstateInGrmCollateralDetailSheet",
    "inGrpRealEstateInGrmCollateralDetailVolume",
    "inGrpRealEstateInGrmLandRegGenericDetailDescription",
    "inGrpRealEstateInGrmLandRegGenericDetailSerialNum",
    "inGrpRealEstateInGrmMainIndIefSuppliedChar5",
    "inGrpRealEstateInGrmRealEstateRealEstateId",
    "inGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc",
    "inGrpRealEstateInGrmRecsGenericDetailDescription",
    "inGrpRealEstateInGrmRecsGenericDetailSerialNum",
    "inGrpRealEstateInGrmRemovIndIefSuppliedChar5",
    "inGrpRealEstateInGrmScharIefSuppliedSelectChar"
})
public class MC2021VInGrpRealEstateItem {

    @XmlElement(name = "InGrpRealEstateInGrmCarrierGenericDetailDescription")
    protected String inGrpRealEstateInGrmCarrierGenericDetailDescription;
    @XmlElement(name = "InGrpRealEstateInGrmCarrierGenericDetailSerialNum")
    protected int inGrpRealEstateInGrmCarrierGenericDetailSerialNum;
    @XmlElement(name = "InGrpRealEstateInGrmCollateralDetailComments")
    protected String inGrpRealEstateInGrmCollateralDetailComments;
    @XmlElement(name = "InGrpRealEstateInGrmCollateralDetailLawyer")
    protected String inGrpRealEstateInGrmCollateralDetailLawyer;
    @XmlElement(name = "InGrpRealEstateInGrmCollateralDetailMainConnectInd")
    protected String inGrpRealEstateInGrmCollateralDetailMainConnectInd;
    @XmlElement(name = "InGrpRealEstateInGrmCollateralDetailPrenotationAmn", required = true)
    protected BigDecimal inGrpRealEstateInGrmCollateralDetailPrenotationAmn;
    @XmlElement(name = "InGrpRealEstateInGrmCollateralDetailRealEstateId")
    protected double inGrpRealEstateInGrmCollateralDetailRealEstateId;
    @XmlElement(name = "InGrpRealEstateInGrmCollateralDetailRemovalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpRealEstateInGrmCollateralDetailRemovalDate;
    @XmlElement(name = "InGrpRealEstateInGrmCollateralDetailRemovalInd")
    protected String inGrpRealEstateInGrmCollateralDetailRemovalInd;
    @XmlElement(name = "InGrpRealEstateInGrmCollateralDetailSheet")
    protected String inGrpRealEstateInGrmCollateralDetailSheet;
    @XmlElement(name = "InGrpRealEstateInGrmCollateralDetailVolume")
    protected String inGrpRealEstateInGrmCollateralDetailVolume;
    @XmlElement(name = "InGrpRealEstateInGrmLandRegGenericDetailDescription")
    protected String inGrpRealEstateInGrmLandRegGenericDetailDescription;
    @XmlElement(name = "InGrpRealEstateInGrmLandRegGenericDetailSerialNum")
    protected int inGrpRealEstateInGrmLandRegGenericDetailSerialNum;
    @XmlElement(name = "InGrpRealEstateInGrmMainIndIefSuppliedChar5")
    protected String inGrpRealEstateInGrmMainIndIefSuppliedChar5;
    @XmlElement(name = "InGrpRealEstateInGrmRealEstateRealEstateId")
    protected double inGrpRealEstateInGrmRealEstateRealEstateId;
    @XmlElement(name = "InGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc")
    protected String inGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc;
    @XmlElement(name = "InGrpRealEstateInGrmRecsGenericDetailDescription")
    protected String inGrpRealEstateInGrmRecsGenericDetailDescription;
    @XmlElement(name = "InGrpRealEstateInGrmRecsGenericDetailSerialNum")
    protected int inGrpRealEstateInGrmRecsGenericDetailSerialNum;
    @XmlElement(name = "InGrpRealEstateInGrmRemovIndIefSuppliedChar5")
    protected String inGrpRealEstateInGrmRemovIndIefSuppliedChar5;
    @XmlElement(name = "InGrpRealEstateInGrmScharIefSuppliedSelectChar")
    protected String inGrpRealEstateInGrmScharIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpRealEstateInGrmCarrierGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmCarrierGenericDetailDescription() {
        return inGrpRealEstateInGrmCarrierGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCarrierGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmCarrierGenericDetailDescription(String value) {
        this.inGrpRealEstateInGrmCarrierGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCarrierGenericDetailSerialNum property.
     * 
     */
    public int getInGrpRealEstateInGrmCarrierGenericDetailSerialNum() {
        return inGrpRealEstateInGrmCarrierGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCarrierGenericDetailSerialNum property.
     * 
     */
    public void setInGrpRealEstateInGrmCarrierGenericDetailSerialNum(int value) {
        this.inGrpRealEstateInGrmCarrierGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCollateralDetailComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmCollateralDetailComments() {
        return inGrpRealEstateInGrmCollateralDetailComments;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCollateralDetailComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmCollateralDetailComments(String value) {
        this.inGrpRealEstateInGrmCollateralDetailComments = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCollateralDetailLawyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmCollateralDetailLawyer() {
        return inGrpRealEstateInGrmCollateralDetailLawyer;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCollateralDetailLawyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmCollateralDetailLawyer(String value) {
        this.inGrpRealEstateInGrmCollateralDetailLawyer = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCollateralDetailMainConnectInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmCollateralDetailMainConnectInd() {
        return inGrpRealEstateInGrmCollateralDetailMainConnectInd;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCollateralDetailMainConnectInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmCollateralDetailMainConnectInd(String value) {
        this.inGrpRealEstateInGrmCollateralDetailMainConnectInd = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCollateralDetailPrenotationAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpRealEstateInGrmCollateralDetailPrenotationAmn() {
        return inGrpRealEstateInGrmCollateralDetailPrenotationAmn;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCollateralDetailPrenotationAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpRealEstateInGrmCollateralDetailPrenotationAmn(BigDecimal value) {
        this.inGrpRealEstateInGrmCollateralDetailPrenotationAmn = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCollateralDetailRealEstateId property.
     * 
     */
    public double getInGrpRealEstateInGrmCollateralDetailRealEstateId() {
        return inGrpRealEstateInGrmCollateralDetailRealEstateId;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCollateralDetailRealEstateId property.
     * 
     */
    public void setInGrpRealEstateInGrmCollateralDetailRealEstateId(double value) {
        this.inGrpRealEstateInGrmCollateralDetailRealEstateId = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCollateralDetailRemovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpRealEstateInGrmCollateralDetailRemovalDate() {
        return inGrpRealEstateInGrmCollateralDetailRemovalDate;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCollateralDetailRemovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpRealEstateInGrmCollateralDetailRemovalDate(XMLGregorianCalendar value) {
        this.inGrpRealEstateInGrmCollateralDetailRemovalDate = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCollateralDetailRemovalInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmCollateralDetailRemovalInd() {
        return inGrpRealEstateInGrmCollateralDetailRemovalInd;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCollateralDetailRemovalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmCollateralDetailRemovalInd(String value) {
        this.inGrpRealEstateInGrmCollateralDetailRemovalInd = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCollateralDetailSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmCollateralDetailSheet() {
        return inGrpRealEstateInGrmCollateralDetailSheet;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCollateralDetailSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmCollateralDetailSheet(String value) {
        this.inGrpRealEstateInGrmCollateralDetailSheet = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmCollateralDetailVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmCollateralDetailVolume() {
        return inGrpRealEstateInGrmCollateralDetailVolume;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmCollateralDetailVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmCollateralDetailVolume(String value) {
        this.inGrpRealEstateInGrmCollateralDetailVolume = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmLandRegGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmLandRegGenericDetailDescription() {
        return inGrpRealEstateInGrmLandRegGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmLandRegGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmLandRegGenericDetailDescription(String value) {
        this.inGrpRealEstateInGrmLandRegGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmLandRegGenericDetailSerialNum property.
     * 
     */
    public int getInGrpRealEstateInGrmLandRegGenericDetailSerialNum() {
        return inGrpRealEstateInGrmLandRegGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmLandRegGenericDetailSerialNum property.
     * 
     */
    public void setInGrpRealEstateInGrmLandRegGenericDetailSerialNum(int value) {
        this.inGrpRealEstateInGrmLandRegGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmMainIndIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmMainIndIefSuppliedChar5() {
        return inGrpRealEstateInGrmMainIndIefSuppliedChar5;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmMainIndIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmMainIndIefSuppliedChar5(String value) {
        this.inGrpRealEstateInGrmMainIndIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmRealEstateRealEstateId property.
     * 
     */
    public double getInGrpRealEstateInGrmRealEstateRealEstateId() {
        return inGrpRealEstateInGrmRealEstateRealEstateId;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmRealEstateRealEstateId property.
     * 
     */
    public void setInGrpRealEstateInGrmRealEstateRealEstateId(double value) {
        this.inGrpRealEstateInGrmRealEstateRealEstateId = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc() {
        return inGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc(String value) {
        this.inGrpRealEstateInGrmRealEstateRealEstateRealEstateDesc = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmRecsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmRecsGenericDetailDescription() {
        return inGrpRealEstateInGrmRecsGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmRecsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmRecsGenericDetailDescription(String value) {
        this.inGrpRealEstateInGrmRecsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmRecsGenericDetailSerialNum property.
     * 
     */
    public int getInGrpRealEstateInGrmRecsGenericDetailSerialNum() {
        return inGrpRealEstateInGrmRecsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmRecsGenericDetailSerialNum property.
     * 
     */
    public void setInGrpRealEstateInGrmRecsGenericDetailSerialNum(int value) {
        this.inGrpRealEstateInGrmRecsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmRemovIndIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmRemovIndIefSuppliedChar5() {
        return inGrpRealEstateInGrmRemovIndIefSuppliedChar5;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmRemovIndIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmRemovIndIefSuppliedChar5(String value) {
        this.inGrpRealEstateInGrmRemovIndIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the inGrpRealEstateInGrmScharIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRealEstateInGrmScharIefSuppliedSelectChar() {
        return inGrpRealEstateInGrmScharIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpRealEstateInGrmScharIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRealEstateInGrmScharIefSuppliedSelectChar(String value) {
        this.inGrpRealEstateInGrmScharIefSuppliedSelectChar = value;
    }

}
