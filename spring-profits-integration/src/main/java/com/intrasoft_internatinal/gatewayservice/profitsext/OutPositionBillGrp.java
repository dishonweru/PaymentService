
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutPositionBillGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutPositionBillGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutBillGrpOutGrmBillIssuerBissCdigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGrpOutGrmBillIssuerBissCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillGrpOutGrmBillIssuerBissEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGrpOutGrmBillIssuerBissFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGrpOutGrmBillIssuerBissTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGrpOutGrmBillIssuerBissType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGrpOutGrmBillSprdPerCustBillsprAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillGrpOutGrmBillSprdPerCustBillsprPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutPositionBillGrp", propOrder = {
    "outBillGrpOutGrmBillIssuerBissCdigit",
    "outBillGrpOutGrmBillIssuerBissCode",
    "outBillGrpOutGrmBillIssuerBissEntryStatus",
    "outBillGrpOutGrmBillIssuerBissFirstname",
    "outBillGrpOutGrmBillIssuerBissTitle",
    "outBillGrpOutGrmBillIssuerBissType",
    "outBillGrpOutGrmBillSprdPerCustBillsprAmount",
    "outBillGrpOutGrmBillSprdPerCustBillsprPercent"
})
public class OutPositionBillGrp {

    @XmlElement(name = "OutBillGrpOutGrmBillIssuerBissCdigit")
    protected short outBillGrpOutGrmBillIssuerBissCdigit;
    @XmlElement(name = "OutBillGrpOutGrmBillIssuerBissCode")
    protected int outBillGrpOutGrmBillIssuerBissCode;
    @XmlElement(name = "OutBillGrpOutGrmBillIssuerBissEntryStatus")
    protected String outBillGrpOutGrmBillIssuerBissEntryStatus;
    @XmlElement(name = "OutBillGrpOutGrmBillIssuerBissFirstname")
    protected String outBillGrpOutGrmBillIssuerBissFirstname;
    @XmlElement(name = "OutBillGrpOutGrmBillIssuerBissTitle")
    protected String outBillGrpOutGrmBillIssuerBissTitle;
    @XmlElement(name = "OutBillGrpOutGrmBillIssuerBissType")
    protected String outBillGrpOutGrmBillIssuerBissType;
    @XmlElement(name = "OutBillGrpOutGrmBillSprdPerCustBillsprAmount", required = true)
    protected BigDecimal outBillGrpOutGrmBillSprdPerCustBillsprAmount;
    @XmlElement(name = "OutBillGrpOutGrmBillSprdPerCustBillsprPercent", required = true)
    protected BigDecimal outBillGrpOutGrmBillSprdPerCustBillsprPercent;

    /**
     * Gets the value of the outBillGrpOutGrmBillIssuerBissCdigit property.
     * 
     */
    public short getOutBillGrpOutGrmBillIssuerBissCdigit() {
        return outBillGrpOutGrmBillIssuerBissCdigit;
    }

    /**
     * Sets the value of the outBillGrpOutGrmBillIssuerBissCdigit property.
     * 
     */
    public void setOutBillGrpOutGrmBillIssuerBissCdigit(short value) {
        this.outBillGrpOutGrmBillIssuerBissCdigit = value;
    }

    /**
     * Gets the value of the outBillGrpOutGrmBillIssuerBissCode property.
     * 
     */
    public int getOutBillGrpOutGrmBillIssuerBissCode() {
        return outBillGrpOutGrmBillIssuerBissCode;
    }

    /**
     * Sets the value of the outBillGrpOutGrmBillIssuerBissCode property.
     * 
     */
    public void setOutBillGrpOutGrmBillIssuerBissCode(int value) {
        this.outBillGrpOutGrmBillIssuerBissCode = value;
    }

    /**
     * Gets the value of the outBillGrpOutGrmBillIssuerBissEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGrpOutGrmBillIssuerBissEntryStatus() {
        return outBillGrpOutGrmBillIssuerBissEntryStatus;
    }

    /**
     * Sets the value of the outBillGrpOutGrmBillIssuerBissEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGrpOutGrmBillIssuerBissEntryStatus(String value) {
        this.outBillGrpOutGrmBillIssuerBissEntryStatus = value;
    }

    /**
     * Gets the value of the outBillGrpOutGrmBillIssuerBissFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGrpOutGrmBillIssuerBissFirstname() {
        return outBillGrpOutGrmBillIssuerBissFirstname;
    }

    /**
     * Sets the value of the outBillGrpOutGrmBillIssuerBissFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGrpOutGrmBillIssuerBissFirstname(String value) {
        this.outBillGrpOutGrmBillIssuerBissFirstname = value;
    }

    /**
     * Gets the value of the outBillGrpOutGrmBillIssuerBissTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGrpOutGrmBillIssuerBissTitle() {
        return outBillGrpOutGrmBillIssuerBissTitle;
    }

    /**
     * Sets the value of the outBillGrpOutGrmBillIssuerBissTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGrpOutGrmBillIssuerBissTitle(String value) {
        this.outBillGrpOutGrmBillIssuerBissTitle = value;
    }

    /**
     * Gets the value of the outBillGrpOutGrmBillIssuerBissType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGrpOutGrmBillIssuerBissType() {
        return outBillGrpOutGrmBillIssuerBissType;
    }

    /**
     * Sets the value of the outBillGrpOutGrmBillIssuerBissType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGrpOutGrmBillIssuerBissType(String value) {
        this.outBillGrpOutGrmBillIssuerBissType = value;
    }

    /**
     * Gets the value of the outBillGrpOutGrmBillSprdPerCustBillsprAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillGrpOutGrmBillSprdPerCustBillsprAmount() {
        return outBillGrpOutGrmBillSprdPerCustBillsprAmount;
    }

    /**
     * Sets the value of the outBillGrpOutGrmBillSprdPerCustBillsprAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillGrpOutGrmBillSprdPerCustBillsprAmount(BigDecimal value) {
        this.outBillGrpOutGrmBillSprdPerCustBillsprAmount = value;
    }

    /**
     * Gets the value of the outBillGrpOutGrmBillSprdPerCustBillsprPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillGrpOutGrmBillSprdPerCustBillsprPercent() {
        return outBillGrpOutGrmBillSprdPerCustBillsprPercent;
    }

    /**
     * Sets the value of the outBillGrpOutGrmBillSprdPerCustBillsprPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillGrpOutGrmBillSprdPerCustBillsprPercent(BigDecimal value) {
        this.outBillGrpOutGrmBillSprdPerCustBillsprPercent = value;
    }

}
