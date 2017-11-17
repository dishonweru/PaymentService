
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for X2231V_CustomerSafeDepositBoxRentalsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X2231V_CustomerSafeDepositBoxRentalsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCommissionBalIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExpenseBalIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGuaranteeBalIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRentalBalIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSafeDepositBoxRentalCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTotCommissionIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotExpenseIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotRentalIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfX2231VOutGrpItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfX2231VOutGrpSrvLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X2231V_CustomerSafeDepositBoxRentalsExport", propOrder = {
    "outCommissionBalIefSuppliedAmount",
    "outCustListSetDescription",
    "outExpenseBalIefSuppliedAmount",
    "outGuaranteeBalIefSuppliedAmount",
    "outRentalBalIefSuppliedAmount",
    "outSafeDepositBoxRentalCnt",
    "outTotCommissionIefSuppliedAmount",
    "outTotExpenseIefSuppliedAmount",
    "outTotRentalIefSuppliedAmount",
    "outGrp",
    "outGrpSrvLog"
})
public class X2231VCustomerSafeDepositBoxRentalsExport
    extends BaseExport
{

    @XmlElement(name = "OutCommissionBalIefSuppliedAmount", required = true)
    protected BigDecimal outCommissionBalIefSuppliedAmount;
    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutExpenseBalIefSuppliedAmount", required = true)
    protected BigDecimal outExpenseBalIefSuppliedAmount;
    @XmlElement(name = "OutGuaranteeBalIefSuppliedAmount", required = true)
    protected BigDecimal outGuaranteeBalIefSuppliedAmount;
    @XmlElement(name = "OutRentalBalIefSuppliedAmount", required = true)
    protected BigDecimal outRentalBalIefSuppliedAmount;
    @XmlElement(name = "OutSafeDepositBoxRentalCnt")
    protected int outSafeDepositBoxRentalCnt;
    @XmlElement(name = "OutTotCommissionIefSuppliedAmount", required = true)
    protected BigDecimal outTotCommissionIefSuppliedAmount;
    @XmlElement(name = "OutTotExpenseIefSuppliedAmount", required = true)
    protected BigDecimal outTotExpenseIefSuppliedAmount;
    @XmlElement(name = "OutTotRentalIefSuppliedAmount", required = true)
    protected BigDecimal outTotRentalIefSuppliedAmount;
    @XmlElement(name = "OutGrp")
    protected ArrayOfX2231VOutGrpItem outGrp;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfX2231VOutGrpSrvLogItem outGrpSrvLog;

    /**
     * Gets the value of the outCommissionBalIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCommissionBalIefSuppliedAmount() {
        return outCommissionBalIefSuppliedAmount;
    }

    /**
     * Sets the value of the outCommissionBalIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCommissionBalIefSuppliedAmount(BigDecimal value) {
        this.outCommissionBalIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustListSetDescription() {
        return outCustListSetDescription;
    }

    /**
     * Sets the value of the outCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustListSetDescription(String value) {
        this.outCustListSetDescription = value;
    }

    /**
     * Gets the value of the outExpenseBalIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExpenseBalIefSuppliedAmount() {
        return outExpenseBalIefSuppliedAmount;
    }

    /**
     * Sets the value of the outExpenseBalIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExpenseBalIefSuppliedAmount(BigDecimal value) {
        this.outExpenseBalIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGuaranteeBalIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGuaranteeBalIefSuppliedAmount() {
        return outGuaranteeBalIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGuaranteeBalIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGuaranteeBalIefSuppliedAmount(BigDecimal value) {
        this.outGuaranteeBalIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outRentalBalIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRentalBalIefSuppliedAmount() {
        return outRentalBalIefSuppliedAmount;
    }

    /**
     * Sets the value of the outRentalBalIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRentalBalIefSuppliedAmount(BigDecimal value) {
        this.outRentalBalIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outSafeDepositBoxRentalCnt property.
     * 
     */
    public int getOutSafeDepositBoxRentalCnt() {
        return outSafeDepositBoxRentalCnt;
    }

    /**
     * Sets the value of the outSafeDepositBoxRentalCnt property.
     * 
     */
    public void setOutSafeDepositBoxRentalCnt(int value) {
        this.outSafeDepositBoxRentalCnt = value;
    }

    /**
     * Gets the value of the outTotCommissionIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotCommissionIefSuppliedAmount() {
        return outTotCommissionIefSuppliedAmount;
    }

    /**
     * Sets the value of the outTotCommissionIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotCommissionIefSuppliedAmount(BigDecimal value) {
        this.outTotCommissionIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outTotExpenseIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotExpenseIefSuppliedAmount() {
        return outTotExpenseIefSuppliedAmount;
    }

    /**
     * Sets the value of the outTotExpenseIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotExpenseIefSuppliedAmount(BigDecimal value) {
        this.outTotExpenseIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outTotRentalIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotRentalIefSuppliedAmount() {
        return outTotRentalIefSuppliedAmount;
    }

    /**
     * Sets the value of the outTotRentalIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotRentalIefSuppliedAmount(BigDecimal value) {
        this.outTotRentalIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfX2231VOutGrpItem }
     *     
     */
    public ArrayOfX2231VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfX2231VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfX2231VOutGrpItem value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfX2231VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfX2231VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfX2231VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfX2231VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

}
