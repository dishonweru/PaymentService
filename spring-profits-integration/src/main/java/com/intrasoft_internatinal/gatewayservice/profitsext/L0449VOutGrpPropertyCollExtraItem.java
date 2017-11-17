
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0449VOutGrpPropertyCollExtraItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0449VOutGrpPropertyCollExtraItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageCollateralType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageMortgageCur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageMortgageValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageReserveCur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageReserveValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageSecurity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageValuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageValuerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageCollateralId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0449VOutGrpPropertyCollExtraItem", propOrder = {
    "outGrpPropertyCollOutGrmPropertyDebtManageCollateralType",
    "outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur",
    "outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue",
    "outGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur",
    "outGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue",
    "outGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur",
    "outGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue",
    "outGrpPropertyCollOutGrmPropertyDebtManageMortgageCur",
    "outGrpPropertyCollOutGrmPropertyDebtManageMortgageValue",
    "outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur",
    "outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue",
    "outGrpPropertyCollOutGrmPropertyDebtManageReserveCur",
    "outGrpPropertyCollOutGrmPropertyDebtManageReserveValue",
    "outGrpPropertyCollOutGrmPropertyDebtManageSecurity",
    "outGrpPropertyCollOutGrmPropertyDebtManageValuerName",
    "outGrpPropertyCollOutGrmPropertyDebtManageValuerType",
    "outGrpPropertyCollOutGrmPropertyDebtManageCollateralId",
    "outGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId",
    "outGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate"
})
public class L0449VOutGrpPropertyCollExtraItem {

    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageCollateralType")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageCollateralType;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue", required = true)
    protected BigDecimal outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue", required = true)
    protected BigDecimal outGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue", required = true)
    protected BigDecimal outGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageMortgageCur")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageMortgageCur;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageMortgageValue", required = true)
    protected BigDecimal outGrpPropertyCollOutGrmPropertyDebtManageMortgageValue;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue", required = true)
    protected BigDecimal outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageReserveCur")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageReserveCur;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageReserveValue", required = true)
    protected BigDecimal outGrpPropertyCollOutGrmPropertyDebtManageReserveValue;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageSecurity")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageSecurity;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageValuerName")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageValuerName;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageValuerType")
    protected String outGrpPropertyCollOutGrmPropertyDebtManageValuerType;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageCollateralId")
    protected double outGrpPropertyCollOutGrmPropertyDebtManageCollateralId;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId")
    protected int outGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId;
    @XmlElement(name = "OutGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate;

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageCollateralType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageCollateralType() {
        return outGrpPropertyCollOutGrmPropertyDebtManageCollateralType;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageCollateralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageCollateralType(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageCollateralType = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur() {
        return outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleCur = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue() {
        return outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue(BigDecimal value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageForcedSaleValue = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur() {
        return outGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageInsuranceCur = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue() {
        return outGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue(BigDecimal value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageInsuranceValue = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur() {
        return outGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageInvestmentCur = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue() {
        return outGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue(BigDecimal value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageInvestmentValue = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageMortgageCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageMortgageCur() {
        return outGrpPropertyCollOutGrmPropertyDebtManageMortgageCur;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageMortgageCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageMortgageCur(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageMortgageCur = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageMortgageValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPropertyCollOutGrmPropertyDebtManageMortgageValue() {
        return outGrpPropertyCollOutGrmPropertyDebtManageMortgageValue;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageMortgageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageMortgageValue(BigDecimal value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageMortgageValue = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur() {
        return outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketCur = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue() {
        return outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue(BigDecimal value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageOpenMarketValue = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageReserveCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageReserveCur() {
        return outGrpPropertyCollOutGrmPropertyDebtManageReserveCur;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageReserveCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageReserveCur(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageReserveCur = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageReserveValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpPropertyCollOutGrmPropertyDebtManageReserveValue() {
        return outGrpPropertyCollOutGrmPropertyDebtManageReserveValue;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageReserveValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageReserveValue(BigDecimal value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageReserveValue = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageSecurity() {
        return outGrpPropertyCollOutGrmPropertyDebtManageSecurity;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageSecurity(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageSecurity = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageValuerName() {
        return outGrpPropertyCollOutGrmPropertyDebtManageValuerName;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageValuerName(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageValuerName = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageValuerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPropertyCollOutGrmPropertyDebtManageValuerType() {
        return outGrpPropertyCollOutGrmPropertyDebtManageValuerType;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageValuerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageValuerType(String value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageValuerType = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageCollateralId property.
     * 
     */
    public double getOutGrpPropertyCollOutGrmPropertyDebtManageCollateralId() {
        return outGrpPropertyCollOutGrmPropertyDebtManageCollateralId;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageCollateralId property.
     * 
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageCollateralId(double value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageCollateralId = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId property.
     * 
     */
    public int getOutGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId() {
        return outGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId property.
     * 
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId(int value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageCollateralTypeId = value;
    }

    /**
     * Gets the value of the outGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate() {
        return outGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate;
    }

    /**
     * Sets the value of the outGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate(XMLGregorianCalendar value) {
        this.outGrpPropertyCollOutGrmPropertyDebtManageAppraisalDate = value;
    }

}
