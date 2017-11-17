
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpBalancesFdTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpBalancesFdTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpBalancesFdTd", propOrder = {
    "outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01",
    "outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01",
    "outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01",
    "outGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4"
})
public class OutGrpBalancesFdTd {

    @XmlElement(name = "OutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01", required = true)
    protected BigDecimal outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01;
    @XmlElement(name = "OutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01", required = true)
    protected BigDecimal outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01;
    @XmlElement(name = "OutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4")
    protected String outGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4;

    /**
     * Gets the value of the outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01() {
        return outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01;
    }

    /**
     * Sets the value of the outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01(BigDecimal value) {
        this.outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalCredit01 = value;
    }

    /**
     * Gets the value of the outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01() {
        return outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01;
    }

    /**
     * Sets the value of the outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01(BigDecimal value) {
        this.outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalDebit01 = value;
    }

    /**
     * Gets the value of the outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01() {
        return outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01;
    }

    /**
     * Sets the value of the outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01(BigDecimal value) {
        this.outGrpBalancesFdTdOutGrpBalFdTdDepAccountTotalTotalProducts01 = value;
    }

    /**
     * Gets the value of the outGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4() {
        return outGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4;
    }

    /**
     * Sets the value of the outGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4(String value) {
        this.outGrpBalancesFdTdOutGrpMonthFdTdIefSuppliedChar4 = value;
    }

}
