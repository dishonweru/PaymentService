
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpBillCustPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpBillCustPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpBillOutGrmBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpBillOutGrmBillBillCollAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpBillOutGrmBillBillCollAccNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpBillOutGrmBillBillCollPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpBillOutGrmBillBillCollYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpBillOutGrmBillOverdueFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpBillOutGrmCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpBillCustPosition", propOrder = {
    "outGrpBillOutGrmBillBillAmount",
    "outGrpBillOutGrmBillBillCollAccCd",
    "outGrpBillOutGrmBillBillCollAccNumb",
    "outGrpBillOutGrmBillBillCollPrfsys",
    "outGrpBillOutGrmBillBillCollYieldPerc",
    "outGrpBillOutGrmBillOverdueFlg",
    "outGrpBillOutGrmCharSuppliedChar20"
})
public class OutGrpBillCustPosition {

    @XmlElement(name = "OutGrpBillOutGrmBillBillAmount", required = true)
    protected BigDecimal outGrpBillOutGrmBillBillAmount;
    @XmlElement(name = "OutGrpBillOutGrmBillBillCollAccCd")
    protected short outGrpBillOutGrmBillBillCollAccCd;
    @XmlElement(name = "OutGrpBillOutGrmBillBillCollAccNumb")
    protected String outGrpBillOutGrmBillBillCollAccNumb;
    @XmlElement(name = "OutGrpBillOutGrmBillBillCollPrfsys")
    protected short outGrpBillOutGrmBillBillCollPrfsys;
    @XmlElement(name = "OutGrpBillOutGrmBillBillCollYieldPerc", required = true)
    protected BigDecimal outGrpBillOutGrmBillBillCollYieldPerc;
    @XmlElement(name = "OutGrpBillOutGrmBillOverdueFlg")
    protected String outGrpBillOutGrmBillOverdueFlg;
    @XmlElement(name = "OutGrpBillOutGrmCharSuppliedChar20")
    protected String outGrpBillOutGrmCharSuppliedChar20;

    /**
     * Gets the value of the outGrpBillOutGrmBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpBillOutGrmBillBillAmount() {
        return outGrpBillOutGrmBillBillAmount;
    }

    /**
     * Sets the value of the outGrpBillOutGrmBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpBillOutGrmBillBillAmount(BigDecimal value) {
        this.outGrpBillOutGrmBillBillAmount = value;
    }

    /**
     * Gets the value of the outGrpBillOutGrmBillBillCollAccCd property.
     * 
     */
    public short getOutGrpBillOutGrmBillBillCollAccCd() {
        return outGrpBillOutGrmBillBillCollAccCd;
    }

    /**
     * Sets the value of the outGrpBillOutGrmBillBillCollAccCd property.
     * 
     */
    public void setOutGrpBillOutGrmBillBillCollAccCd(short value) {
        this.outGrpBillOutGrmBillBillCollAccCd = value;
    }

    /**
     * Gets the value of the outGrpBillOutGrmBillBillCollAccNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBillOutGrmBillBillCollAccNumb() {
        return outGrpBillOutGrmBillBillCollAccNumb;
    }

    /**
     * Sets the value of the outGrpBillOutGrmBillBillCollAccNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBillOutGrmBillBillCollAccNumb(String value) {
        this.outGrpBillOutGrmBillBillCollAccNumb = value;
    }

    /**
     * Gets the value of the outGrpBillOutGrmBillBillCollPrfsys property.
     * 
     */
    public short getOutGrpBillOutGrmBillBillCollPrfsys() {
        return outGrpBillOutGrmBillBillCollPrfsys;
    }

    /**
     * Sets the value of the outGrpBillOutGrmBillBillCollPrfsys property.
     * 
     */
    public void setOutGrpBillOutGrmBillBillCollPrfsys(short value) {
        this.outGrpBillOutGrmBillBillCollPrfsys = value;
    }

    /**
     * Gets the value of the outGrpBillOutGrmBillBillCollYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpBillOutGrmBillBillCollYieldPerc() {
        return outGrpBillOutGrmBillBillCollYieldPerc;
    }

    /**
     * Sets the value of the outGrpBillOutGrmBillBillCollYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpBillOutGrmBillBillCollYieldPerc(BigDecimal value) {
        this.outGrpBillOutGrmBillBillCollYieldPerc = value;
    }

    /**
     * Gets the value of the outGrpBillOutGrmBillOverdueFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBillOutGrmBillOverdueFlg() {
        return outGrpBillOutGrmBillOverdueFlg;
    }

    /**
     * Sets the value of the outGrpBillOutGrmBillOverdueFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBillOutGrmBillOverdueFlg(String value) {
        this.outGrpBillOutGrmBillOverdueFlg = value;
    }

    /**
     * Gets the value of the outGrpBillOutGrmCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBillOutGrmCharSuppliedChar20() {
        return outGrpBillOutGrmCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpBillOutGrmCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBillOutGrmCharSuppliedChar20(String value) {
        this.outGrpBillOutGrmCharSuppliedChar20 = value;
    }

}
