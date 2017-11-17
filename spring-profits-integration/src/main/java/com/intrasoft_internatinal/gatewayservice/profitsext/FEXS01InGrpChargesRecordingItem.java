
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEXS01InGrpChargesRecordingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01InGrpChargesRecordingItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpChargesRecordingInGrmChargesRecordingChargeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpChargesRecordingInGrmChargesRecordingChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpChargesRecordingInGrmChargesRecordingChargedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpChargesRecordingInGrmChargesRecordingChargesCurrId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpChargesRecordingInGrmChargesRecordingDbCrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpChargesRecordingInGrmChargesRecordingDiscountedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01InGrpChargesRecordingItem", propOrder = {
    "inGrpChargesRecordingInGrmChargesRecordingChargeCode",
    "inGrpChargesRecordingInGrmChargesRecordingChargeType",
    "inGrpChargesRecordingInGrmChargesRecordingChargedAmn",
    "inGrpChargesRecordingInGrmChargesRecordingChargesCurrId",
    "inGrpChargesRecordingInGrmChargesRecordingDbCrFlg",
    "inGrpChargesRecordingInGrmChargesRecordingDiscountedAmn"
})
public class FEXS01InGrpChargesRecordingItem {

    @XmlElement(name = "InGrpChargesRecordingInGrmChargesRecordingChargeCode")
    protected int inGrpChargesRecordingInGrmChargesRecordingChargeCode;
    @XmlElement(name = "InGrpChargesRecordingInGrmChargesRecordingChargeType")
    protected String inGrpChargesRecordingInGrmChargesRecordingChargeType;
    @XmlElement(name = "InGrpChargesRecordingInGrmChargesRecordingChargedAmn", required = true)
    protected BigDecimal inGrpChargesRecordingInGrmChargesRecordingChargedAmn;
    @XmlElement(name = "InGrpChargesRecordingInGrmChargesRecordingChargesCurrId")
    protected int inGrpChargesRecordingInGrmChargesRecordingChargesCurrId;
    @XmlElement(name = "InGrpChargesRecordingInGrmChargesRecordingDbCrFlg")
    protected String inGrpChargesRecordingInGrmChargesRecordingDbCrFlg;
    @XmlElement(name = "InGrpChargesRecordingInGrmChargesRecordingDiscountedAmn", required = true)
    protected BigDecimal inGrpChargesRecordingInGrmChargesRecordingDiscountedAmn;

    /**
     * Gets the value of the inGrpChargesRecordingInGrmChargesRecordingChargeCode property.
     * 
     */
    public int getInGrpChargesRecordingInGrmChargesRecordingChargeCode() {
        return inGrpChargesRecordingInGrmChargesRecordingChargeCode;
    }

    /**
     * Sets the value of the inGrpChargesRecordingInGrmChargesRecordingChargeCode property.
     * 
     */
    public void setInGrpChargesRecordingInGrmChargesRecordingChargeCode(int value) {
        this.inGrpChargesRecordingInGrmChargesRecordingChargeCode = value;
    }

    /**
     * Gets the value of the inGrpChargesRecordingInGrmChargesRecordingChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpChargesRecordingInGrmChargesRecordingChargeType() {
        return inGrpChargesRecordingInGrmChargesRecordingChargeType;
    }

    /**
     * Sets the value of the inGrpChargesRecordingInGrmChargesRecordingChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpChargesRecordingInGrmChargesRecordingChargeType(String value) {
        this.inGrpChargesRecordingInGrmChargesRecordingChargeType = value;
    }

    /**
     * Gets the value of the inGrpChargesRecordingInGrmChargesRecordingChargedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpChargesRecordingInGrmChargesRecordingChargedAmn() {
        return inGrpChargesRecordingInGrmChargesRecordingChargedAmn;
    }

    /**
     * Sets the value of the inGrpChargesRecordingInGrmChargesRecordingChargedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpChargesRecordingInGrmChargesRecordingChargedAmn(BigDecimal value) {
        this.inGrpChargesRecordingInGrmChargesRecordingChargedAmn = value;
    }

    /**
     * Gets the value of the inGrpChargesRecordingInGrmChargesRecordingChargesCurrId property.
     * 
     */
    public int getInGrpChargesRecordingInGrmChargesRecordingChargesCurrId() {
        return inGrpChargesRecordingInGrmChargesRecordingChargesCurrId;
    }

    /**
     * Sets the value of the inGrpChargesRecordingInGrmChargesRecordingChargesCurrId property.
     * 
     */
    public void setInGrpChargesRecordingInGrmChargesRecordingChargesCurrId(int value) {
        this.inGrpChargesRecordingInGrmChargesRecordingChargesCurrId = value;
    }

    /**
     * Gets the value of the inGrpChargesRecordingInGrmChargesRecordingDbCrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpChargesRecordingInGrmChargesRecordingDbCrFlg() {
        return inGrpChargesRecordingInGrmChargesRecordingDbCrFlg;
    }

    /**
     * Sets the value of the inGrpChargesRecordingInGrmChargesRecordingDbCrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpChargesRecordingInGrmChargesRecordingDbCrFlg(String value) {
        this.inGrpChargesRecordingInGrmChargesRecordingDbCrFlg = value;
    }

    /**
     * Gets the value of the inGrpChargesRecordingInGrmChargesRecordingDiscountedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpChargesRecordingInGrmChargesRecordingDiscountedAmn() {
        return inGrpChargesRecordingInGrmChargesRecordingDiscountedAmn;
    }

    /**
     * Sets the value of the inGrpChargesRecordingInGrmChargesRecordingDiscountedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpChargesRecordingInGrmChargesRecordingDiscountedAmn(BigDecimal value) {
        this.inGrpChargesRecordingInGrmChargesRecordingDiscountedAmn = value;
    }

}
