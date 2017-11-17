
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpDamageItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpDamageItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDamageOutGrmDamageDescrGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDamageOutGrmDamageIssDamageDtlDamageAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDamageOutGrmDamageIssDamageDtlReplaced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDamageOutGrmDamageIssDamageDtlTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDamageOutGrmDamageIssDamageDtlYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDamageOutGrmReplacedIefSuppliedChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDamageOutGrmSelectchIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpDamageItem", propOrder = {
    "outGrpDamageOutGrmDamageDescrGenericDetailDescription",
    "outGrpDamageOutGrmDamageIssDamageDtlDamageAmnt",
    "outGrpDamageOutGrmDamageIssDamageDtlReplaced",
    "outGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier",
    "outGrpDamageOutGrmDamageIssDamageDtlTypeCode",
    "outGrpDamageOutGrmDamageIssDamageDtlYear",
    "outGrpDamageOutGrmReplacedIefSuppliedChar3",
    "outGrpDamageOutGrmSelectchIefSuppliedSelectChar"
})
public class OutGrpDamageItem {

    @XmlElement(name = "OutGrpDamageOutGrmDamageDescrGenericDetailDescription")
    protected String outGrpDamageOutGrmDamageDescrGenericDetailDescription;
    @XmlElement(name = "OutGrpDamageOutGrmDamageIssDamageDtlDamageAmnt", required = true)
    protected BigDecimal outGrpDamageOutGrmDamageIssDamageDtlDamageAmnt;
    @XmlElement(name = "OutGrpDamageOutGrmDamageIssDamageDtlReplaced")
    protected String outGrpDamageOutGrmDamageIssDamageDtlReplaced;
    @XmlElement(name = "OutGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier")
    protected double outGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier;
    @XmlElement(name = "OutGrpDamageOutGrmDamageIssDamageDtlTypeCode")
    protected int outGrpDamageOutGrmDamageIssDamageDtlTypeCode;
    @XmlElement(name = "OutGrpDamageOutGrmDamageIssDamageDtlYear")
    protected short outGrpDamageOutGrmDamageIssDamageDtlYear;
    @XmlElement(name = "OutGrpDamageOutGrmReplacedIefSuppliedChar3")
    protected String outGrpDamageOutGrmReplacedIefSuppliedChar3;
    @XmlElement(name = "OutGrpDamageOutGrmSelectchIefSuppliedSelectChar")
    protected String outGrpDamageOutGrmSelectchIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpDamageOutGrmDamageDescrGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDamageOutGrmDamageDescrGenericDetailDescription() {
        return outGrpDamageOutGrmDamageDescrGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpDamageOutGrmDamageDescrGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDamageOutGrmDamageDescrGenericDetailDescription(String value) {
        this.outGrpDamageOutGrmDamageDescrGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpDamageOutGrmDamageIssDamageDtlDamageAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDamageOutGrmDamageIssDamageDtlDamageAmnt() {
        return outGrpDamageOutGrmDamageIssDamageDtlDamageAmnt;
    }

    /**
     * Sets the value of the outGrpDamageOutGrmDamageIssDamageDtlDamageAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDamageOutGrmDamageIssDamageDtlDamageAmnt(BigDecimal value) {
        this.outGrpDamageOutGrmDamageIssDamageDtlDamageAmnt = value;
    }

    /**
     * Gets the value of the outGrpDamageOutGrmDamageIssDamageDtlReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDamageOutGrmDamageIssDamageDtlReplaced() {
        return outGrpDamageOutGrmDamageIssDamageDtlReplaced;
    }

    /**
     * Sets the value of the outGrpDamageOutGrmDamageIssDamageDtlReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDamageOutGrmDamageIssDamageDtlReplaced(String value) {
        this.outGrpDamageOutGrmDamageIssDamageDtlReplaced = value;
    }

    /**
     * Gets the value of the outGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier property.
     * 
     */
    public double getOutGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier() {
        return outGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier;
    }

    /**
     * Sets the value of the outGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier property.
     * 
     */
    public void setOutGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier(double value) {
        this.outGrpDamageOutGrmDamageIssDamageDtlTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outGrpDamageOutGrmDamageIssDamageDtlTypeCode property.
     * 
     */
    public int getOutGrpDamageOutGrmDamageIssDamageDtlTypeCode() {
        return outGrpDamageOutGrmDamageIssDamageDtlTypeCode;
    }

    /**
     * Sets the value of the outGrpDamageOutGrmDamageIssDamageDtlTypeCode property.
     * 
     */
    public void setOutGrpDamageOutGrmDamageIssDamageDtlTypeCode(int value) {
        this.outGrpDamageOutGrmDamageIssDamageDtlTypeCode = value;
    }

    /**
     * Gets the value of the outGrpDamageOutGrmDamageIssDamageDtlYear property.
     * 
     */
    public short getOutGrpDamageOutGrmDamageIssDamageDtlYear() {
        return outGrpDamageOutGrmDamageIssDamageDtlYear;
    }

    /**
     * Sets the value of the outGrpDamageOutGrmDamageIssDamageDtlYear property.
     * 
     */
    public void setOutGrpDamageOutGrmDamageIssDamageDtlYear(short value) {
        this.outGrpDamageOutGrmDamageIssDamageDtlYear = value;
    }

    /**
     * Gets the value of the outGrpDamageOutGrmReplacedIefSuppliedChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDamageOutGrmReplacedIefSuppliedChar3() {
        return outGrpDamageOutGrmReplacedIefSuppliedChar3;
    }

    /**
     * Sets the value of the outGrpDamageOutGrmReplacedIefSuppliedChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDamageOutGrmReplacedIefSuppliedChar3(String value) {
        this.outGrpDamageOutGrmReplacedIefSuppliedChar3 = value;
    }

    /**
     * Gets the value of the outGrpDamageOutGrmSelectchIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDamageOutGrmSelectchIefSuppliedSelectChar() {
        return outGrpDamageOutGrmSelectchIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpDamageOutGrmSelectchIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDamageOutGrmSelectchIefSuppliedSelectChar(String value) {
        this.outGrpDamageOutGrmSelectchIefSuppliedSelectChar = value;
    }

}
