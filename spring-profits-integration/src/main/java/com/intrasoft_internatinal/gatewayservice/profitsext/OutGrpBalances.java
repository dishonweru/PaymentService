
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpBalances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpBalances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpBalancesOutGrpBalDepAccountTotalTotalCredit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpBalancesOutGrpBalDepAccountTotalTotalDebit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpBalancesOutGrpBalDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpBalancesOutGrpMonthIefSuppliedYesno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpBalances", propOrder = {
    "outGrpBalancesOutGrpBalDepAccountTotalTotalCredit01",
    "outGrpBalancesOutGrpBalDepAccountTotalTotalDebit01",
    "outGrpBalancesOutGrpBalDepAccountTotalTotalProducts01",
    "outGrpBalancesOutGrpMonthIefSuppliedYesno"
})
public class OutGrpBalances {

    @XmlElement(name = "OutGrpBalancesOutGrpBalDepAccountTotalTotalCredit01", required = true)
    protected BigDecimal outGrpBalancesOutGrpBalDepAccountTotalTotalCredit01;
    @XmlElement(name = "OutGrpBalancesOutGrpBalDepAccountTotalTotalDebit01", required = true)
    protected BigDecimal outGrpBalancesOutGrpBalDepAccountTotalTotalDebit01;
    @XmlElement(name = "OutGrpBalancesOutGrpBalDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outGrpBalancesOutGrpBalDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutGrpBalancesOutGrpMonthIefSuppliedYesno")
    protected String outGrpBalancesOutGrpMonthIefSuppliedYesno;

    /**
     * Gets the value of the outGrpBalancesOutGrpBalDepAccountTotalTotalCredit01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpBalancesOutGrpBalDepAccountTotalTotalCredit01() {
        return outGrpBalancesOutGrpBalDepAccountTotalTotalCredit01;
    }

    /**
     * Sets the value of the outGrpBalancesOutGrpBalDepAccountTotalTotalCredit01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpBalancesOutGrpBalDepAccountTotalTotalCredit01(BigDecimal value) {
        this.outGrpBalancesOutGrpBalDepAccountTotalTotalCredit01 = value;
    }

    /**
     * Gets the value of the outGrpBalancesOutGrpBalDepAccountTotalTotalDebit01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpBalancesOutGrpBalDepAccountTotalTotalDebit01() {
        return outGrpBalancesOutGrpBalDepAccountTotalTotalDebit01;
    }

    /**
     * Sets the value of the outGrpBalancesOutGrpBalDepAccountTotalTotalDebit01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpBalancesOutGrpBalDepAccountTotalTotalDebit01(BigDecimal value) {
        this.outGrpBalancesOutGrpBalDepAccountTotalTotalDebit01 = value;
    }

    /**
     * Gets the value of the outGrpBalancesOutGrpBalDepAccountTotalTotalProducts01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpBalancesOutGrpBalDepAccountTotalTotalProducts01() {
        return outGrpBalancesOutGrpBalDepAccountTotalTotalProducts01;
    }

    /**
     * Sets the value of the outGrpBalancesOutGrpBalDepAccountTotalTotalProducts01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpBalancesOutGrpBalDepAccountTotalTotalProducts01(BigDecimal value) {
        this.outGrpBalancesOutGrpBalDepAccountTotalTotalProducts01 = value;
    }

    /**
     * Gets the value of the outGrpBalancesOutGrpMonthIefSuppliedYesno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBalancesOutGrpMonthIefSuppliedYesno() {
        return outGrpBalancesOutGrpMonthIefSuppliedYesno;
    }

    /**
     * Sets the value of the outGrpBalancesOutGrpMonthIefSuppliedYesno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBalancesOutGrpMonthIefSuppliedYesno(String value) {
        this.outGrpBalancesOutGrpMonthIefSuppliedYesno = value;
    }

}
