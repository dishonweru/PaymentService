
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2021VOutGrpRealEstateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2021VOutGrpRealEstateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpRealEstateOutGrmCarrierGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCarrierGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCollateralDetailComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCollateralDetailLawyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCollateralDetailMainConnectInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCollateralDetailPrenotationAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCollateralDetailRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCollateralDetailRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCollateralDetailRemovalInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCollateralDetailSheet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmCollateralDetailVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmLandRegGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmLandRegGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRealEstateOutGrmMainIndIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRealEstateRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRecsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRecsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRealEstateOutGrmRemovIndIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstateOutGrmScharIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2021VOutGrpRealEstateItem", propOrder = {
    "outGrpRealEstateOutGrmCarrierGenericDetailDescription",
    "outGrpRealEstateOutGrmCarrierGenericDetailSerialNum",
    "outGrpRealEstateOutGrmCollateralDetailComments",
    "outGrpRealEstateOutGrmCollateralDetailLawyer",
    "outGrpRealEstateOutGrmCollateralDetailMainConnectInd",
    "outGrpRealEstateOutGrmCollateralDetailPrenotationAmn",
    "outGrpRealEstateOutGrmCollateralDetailRealEstateId",
    "outGrpRealEstateOutGrmCollateralDetailRemovalDate",
    "outGrpRealEstateOutGrmCollateralDetailRemovalInd",
    "outGrpRealEstateOutGrmCollateralDetailSheet",
    "outGrpRealEstateOutGrmCollateralDetailVolume",
    "outGrpRealEstateOutGrmLandRegGenericDetailDescription",
    "outGrpRealEstateOutGrmLandRegGenericDetailSerialNum",
    "outGrpRealEstateOutGrmMainIndIefSuppliedChar5",
    "outGrpRealEstateOutGrmRealEstateRealEstateId",
    "outGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc",
    "outGrpRealEstateOutGrmRecsGenericDetailDescription",
    "outGrpRealEstateOutGrmRecsGenericDetailSerialNum",
    "outGrpRealEstateOutGrmRemovIndIefSuppliedChar5",
    "outGrpRealEstateOutGrmScharIefSuppliedSelectChar"
})
public class MC2021VOutGrpRealEstateItem {

    @XmlElement(name = "OutGrpRealEstateOutGrmCarrierGenericDetailDescription")
    protected String outGrpRealEstateOutGrmCarrierGenericDetailDescription;
    @XmlElement(name = "OutGrpRealEstateOutGrmCarrierGenericDetailSerialNum")
    protected int outGrpRealEstateOutGrmCarrierGenericDetailSerialNum;
    @XmlElement(name = "OutGrpRealEstateOutGrmCollateralDetailComments")
    protected String outGrpRealEstateOutGrmCollateralDetailComments;
    @XmlElement(name = "OutGrpRealEstateOutGrmCollateralDetailLawyer")
    protected String outGrpRealEstateOutGrmCollateralDetailLawyer;
    @XmlElement(name = "OutGrpRealEstateOutGrmCollateralDetailMainConnectInd")
    protected String outGrpRealEstateOutGrmCollateralDetailMainConnectInd;
    @XmlElement(name = "OutGrpRealEstateOutGrmCollateralDetailPrenotationAmn", required = true)
    protected BigDecimal outGrpRealEstateOutGrmCollateralDetailPrenotationAmn;
    @XmlElement(name = "OutGrpRealEstateOutGrmCollateralDetailRealEstateId")
    protected double outGrpRealEstateOutGrmCollateralDetailRealEstateId;
    @XmlElement(name = "OutGrpRealEstateOutGrmCollateralDetailRemovalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpRealEstateOutGrmCollateralDetailRemovalDate;
    @XmlElement(name = "OutGrpRealEstateOutGrmCollateralDetailRemovalInd")
    protected String outGrpRealEstateOutGrmCollateralDetailRemovalInd;
    @XmlElement(name = "OutGrpRealEstateOutGrmCollateralDetailSheet")
    protected String outGrpRealEstateOutGrmCollateralDetailSheet;
    @XmlElement(name = "OutGrpRealEstateOutGrmCollateralDetailVolume")
    protected String outGrpRealEstateOutGrmCollateralDetailVolume;
    @XmlElement(name = "OutGrpRealEstateOutGrmLandRegGenericDetailDescription")
    protected String outGrpRealEstateOutGrmLandRegGenericDetailDescription;
    @XmlElement(name = "OutGrpRealEstateOutGrmLandRegGenericDetailSerialNum")
    protected int outGrpRealEstateOutGrmLandRegGenericDetailSerialNum;
    @XmlElement(name = "OutGrpRealEstateOutGrmMainIndIefSuppliedChar5")
    protected String outGrpRealEstateOutGrmMainIndIefSuppliedChar5;
    @XmlElement(name = "OutGrpRealEstateOutGrmRealEstateRealEstateId")
    protected double outGrpRealEstateOutGrmRealEstateRealEstateId;
    @XmlElement(name = "OutGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc")
    protected String outGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc;
    @XmlElement(name = "OutGrpRealEstateOutGrmRecsGenericDetailDescription")
    protected String outGrpRealEstateOutGrmRecsGenericDetailDescription;
    @XmlElement(name = "OutGrpRealEstateOutGrmRecsGenericDetailSerialNum")
    protected int outGrpRealEstateOutGrmRecsGenericDetailSerialNum;
    @XmlElement(name = "OutGrpRealEstateOutGrmRemovIndIefSuppliedChar5")
    protected String outGrpRealEstateOutGrmRemovIndIefSuppliedChar5;
    @XmlElement(name = "OutGrpRealEstateOutGrmScharIefSuppliedSelectChar")
    protected String outGrpRealEstateOutGrmScharIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpRealEstateOutGrmCarrierGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmCarrierGenericDetailDescription() {
        return outGrpRealEstateOutGrmCarrierGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCarrierGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmCarrierGenericDetailDescription(String value) {
        this.outGrpRealEstateOutGrmCarrierGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCarrierGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpRealEstateOutGrmCarrierGenericDetailSerialNum() {
        return outGrpRealEstateOutGrmCarrierGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCarrierGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpRealEstateOutGrmCarrierGenericDetailSerialNum(int value) {
        this.outGrpRealEstateOutGrmCarrierGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCollateralDetailComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmCollateralDetailComments() {
        return outGrpRealEstateOutGrmCollateralDetailComments;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCollateralDetailComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmCollateralDetailComments(String value) {
        this.outGrpRealEstateOutGrmCollateralDetailComments = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCollateralDetailLawyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmCollateralDetailLawyer() {
        return outGrpRealEstateOutGrmCollateralDetailLawyer;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCollateralDetailLawyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmCollateralDetailLawyer(String value) {
        this.outGrpRealEstateOutGrmCollateralDetailLawyer = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCollateralDetailMainConnectInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmCollateralDetailMainConnectInd() {
        return outGrpRealEstateOutGrmCollateralDetailMainConnectInd;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCollateralDetailMainConnectInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmCollateralDetailMainConnectInd(String value) {
        this.outGrpRealEstateOutGrmCollateralDetailMainConnectInd = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCollateralDetailPrenotationAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpRealEstateOutGrmCollateralDetailPrenotationAmn() {
        return outGrpRealEstateOutGrmCollateralDetailPrenotationAmn;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCollateralDetailPrenotationAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpRealEstateOutGrmCollateralDetailPrenotationAmn(BigDecimal value) {
        this.outGrpRealEstateOutGrmCollateralDetailPrenotationAmn = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCollateralDetailRealEstateId property.
     * 
     */
    public double getOutGrpRealEstateOutGrmCollateralDetailRealEstateId() {
        return outGrpRealEstateOutGrmCollateralDetailRealEstateId;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCollateralDetailRealEstateId property.
     * 
     */
    public void setOutGrpRealEstateOutGrmCollateralDetailRealEstateId(double value) {
        this.outGrpRealEstateOutGrmCollateralDetailRealEstateId = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCollateralDetailRemovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpRealEstateOutGrmCollateralDetailRemovalDate() {
        return outGrpRealEstateOutGrmCollateralDetailRemovalDate;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCollateralDetailRemovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpRealEstateOutGrmCollateralDetailRemovalDate(XMLGregorianCalendar value) {
        this.outGrpRealEstateOutGrmCollateralDetailRemovalDate = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCollateralDetailRemovalInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmCollateralDetailRemovalInd() {
        return outGrpRealEstateOutGrmCollateralDetailRemovalInd;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCollateralDetailRemovalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmCollateralDetailRemovalInd(String value) {
        this.outGrpRealEstateOutGrmCollateralDetailRemovalInd = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCollateralDetailSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmCollateralDetailSheet() {
        return outGrpRealEstateOutGrmCollateralDetailSheet;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCollateralDetailSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmCollateralDetailSheet(String value) {
        this.outGrpRealEstateOutGrmCollateralDetailSheet = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmCollateralDetailVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmCollateralDetailVolume() {
        return outGrpRealEstateOutGrmCollateralDetailVolume;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmCollateralDetailVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmCollateralDetailVolume(String value) {
        this.outGrpRealEstateOutGrmCollateralDetailVolume = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmLandRegGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmLandRegGenericDetailDescription() {
        return outGrpRealEstateOutGrmLandRegGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmLandRegGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmLandRegGenericDetailDescription(String value) {
        this.outGrpRealEstateOutGrmLandRegGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmLandRegGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpRealEstateOutGrmLandRegGenericDetailSerialNum() {
        return outGrpRealEstateOutGrmLandRegGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmLandRegGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpRealEstateOutGrmLandRegGenericDetailSerialNum(int value) {
        this.outGrpRealEstateOutGrmLandRegGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmMainIndIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmMainIndIefSuppliedChar5() {
        return outGrpRealEstateOutGrmMainIndIefSuppliedChar5;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmMainIndIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmMainIndIefSuppliedChar5(String value) {
        this.outGrpRealEstateOutGrmMainIndIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRealEstateRealEstateId property.
     * 
     */
    public double getOutGrpRealEstateOutGrmRealEstateRealEstateId() {
        return outGrpRealEstateOutGrmRealEstateRealEstateId;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRealEstateRealEstateId property.
     * 
     */
    public void setOutGrpRealEstateOutGrmRealEstateRealEstateId(double value) {
        this.outGrpRealEstateOutGrmRealEstateRealEstateId = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc() {
        return outGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc(String value) {
        this.outGrpRealEstateOutGrmRealEstateRealEstateRealEstateDesc = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRecsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmRecsGenericDetailDescription() {
        return outGrpRealEstateOutGrmRecsGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRecsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmRecsGenericDetailDescription(String value) {
        this.outGrpRealEstateOutGrmRecsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRecsGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpRealEstateOutGrmRecsGenericDetailSerialNum() {
        return outGrpRealEstateOutGrmRecsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRecsGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpRealEstateOutGrmRecsGenericDetailSerialNum(int value) {
        this.outGrpRealEstateOutGrmRecsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmRemovIndIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmRemovIndIefSuppliedChar5() {
        return outGrpRealEstateOutGrmRemovIndIefSuppliedChar5;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmRemovIndIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmRemovIndIefSuppliedChar5(String value) {
        this.outGrpRealEstateOutGrmRemovIndIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the outGrpRealEstateOutGrmScharIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRealEstateOutGrmScharIefSuppliedSelectChar() {
        return outGrpRealEstateOutGrmScharIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpRealEstateOutGrmScharIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRealEstateOutGrmScharIefSuppliedSelectChar(String value) {
        this.outGrpRealEstateOutGrmScharIefSuppliedSelectChar = value;
    }

}
