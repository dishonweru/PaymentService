
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1954VOutGrpLimitInformationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1954VOutGrpLimitInformationItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmSelectedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1954VOutGrpLimitInformationItem", propOrder = {
    "outGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount",
    "outGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn",
    "outGrpLimitInformationOutGrmSelectedIefSuppliedFlag",
    "outGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount",
    "outGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency"
})
public class A1954VOutGrpLimitInformationItem {

    @XmlElement(name = "OutGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount", required = true)
    protected BigDecimal outGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount;
    @XmlElement(name = "OutGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber")
    protected String outGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt")
    protected double outGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn", required = true)
    protected BigDecimal outGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey")
    protected String outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc")
    protected String outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn", required = true)
    protected BigDecimal outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId")
    protected double outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType")
    protected String outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo")
    protected double outGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn", required = true)
    protected BigDecimal outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn", required = true)
    protected BigDecimal outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn;
    @XmlElement(name = "OutGrpLimitInformationOutGrmSelectedIefSuppliedFlag")
    protected String outGrpLimitInformationOutGrmSelectedIefSuppliedFlag;
    @XmlElement(name = "OutGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount", required = true)
    protected BigDecimal outGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount;
    @XmlElement(name = "OutGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency")
    protected int outGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency;

    /**
     * Gets the value of the outGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount() {
        return outGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount(BigDecimal value) {
        this.outGrpLimitInformationOutGrmDepAccAvailToWithdrIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber() {
        return outGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber(String value) {
        this.outGrpLimitInformationOutGrmDepAccProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt property.
     * 
     */
    public double getOutGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt property.
     * 
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt(double value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitActiveAccCnt = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn(BigDecimal value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitCoveredAmn = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey(String value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKey = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc(String value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitEntityKeyDesc = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate(XMLGregorianCalendar value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitExpireDate = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn(BigDecimal value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitAmn = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId property.
     * 
     */
    public double getOutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId property.
     * 
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId(double value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitId = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType(String value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitLimitType = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo property.
     * 
     */
    public double getOutGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo property.
     * 
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo(double value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitMaxAccNo = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn(BigDecimal value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedCoveredAmn = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn(BigDecimal value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitUsedLimitAmn = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmSelectedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLimitInformationOutGrmSelectedIefSuppliedFlag() {
        return outGrpLimitInformationOutGrmSelectedIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmSelectedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLimitInformationOutGrmSelectedIefSuppliedFlag(String value) {
        this.outGrpLimitInformationOutGrmSelectedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount() {
        return outGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount(BigDecimal value) {
        this.outGrpLimitInformationOutGrmTotAvailAmnIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency property.
     * 
     */
    public int getOutGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency() {
        return outGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency;
    }

    /**
     * Sets the value of the outGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency property.
     * 
     */
    public void setOutGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency(int value) {
        this.outGrpLimitInformationOutGrmLimitInformationGenericLimitIdCurrency = value;
    }

}
