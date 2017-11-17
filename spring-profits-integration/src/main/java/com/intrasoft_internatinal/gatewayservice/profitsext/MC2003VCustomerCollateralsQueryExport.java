
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2003VCustomerCollateralsQueryExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2003VCustomerCollateralsQueryExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutGenericHeaderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotalEstimatedLossCollateralWorkEstLossCustomerDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalEstimatedLossCollateralWorkEstLossAccountsDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsDcAccountCollateralEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsDcAccountCollateralEstInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsDcAccountCollateralYieldLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsDcCollateralWorkGeneralAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsDcCollateralWorkEstInsurAmnFrom" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsDcCollateralWorkEstInsurAmnTo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsDcCollateralWorkTotalAccountBalDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollaterals" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2003VOutGrpCollateralsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2003VOutGrpSrvLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2003VCustomerCollateralsQueryExport", propOrder = {
    "outGenericHeaderDescription",
    "outSelectedCustomerFirstName",
    "outSelectedCustomerSurname",
    "outSelectedListSetDescription",
    "outTotalEstimatedLossCollateralWorkEstLossCustomerDc",
    "outTotalEstimatedLossCollateralWorkEstLossAccountsDc",
    "outTotalsDcAccountCollateralEstValueAmn",
    "outTotalsDcAccountCollateralEstInsuranceAmn",
    "outTotalsDcAccountCollateralYieldLimitAmn",
    "outTotalsDcCollateralWorkGeneralAmount",
    "outTotalsDcCollateralWorkEstInsurAmnFrom",
    "outTotalsDcCollateralWorkEstInsurAmnTo",
    "outTotalsDcCollateralWorkTotalAccountBalDc",
    "outGrpCollaterals",
    "outGrpSrvLog"
})
public class MC2003VCustomerCollateralsQueryExport
    extends BaseExport
{

    @XmlElement(name = "OutGenericHeaderDescription")
    protected String outGenericHeaderDescription;
    @XmlElement(name = "OutSelectedCustomerFirstName")
    protected String outSelectedCustomerFirstName;
    @XmlElement(name = "OutSelectedCustomerSurname")
    protected String outSelectedCustomerSurname;
    @XmlElement(name = "OutSelectedListSetDescription")
    protected String outSelectedListSetDescription;
    @XmlElement(name = "OutTotalEstimatedLossCollateralWorkEstLossCustomerDc", required = true)
    protected BigDecimal outTotalEstimatedLossCollateralWorkEstLossCustomerDc;
    @XmlElement(name = "OutTotalEstimatedLossCollateralWorkEstLossAccountsDc", required = true)
    protected BigDecimal outTotalEstimatedLossCollateralWorkEstLossAccountsDc;
    @XmlElement(name = "OutTotalsDcAccountCollateralEstValueAmn", required = true)
    protected BigDecimal outTotalsDcAccountCollateralEstValueAmn;
    @XmlElement(name = "OutTotalsDcAccountCollateralEstInsuranceAmn", required = true)
    protected BigDecimal outTotalsDcAccountCollateralEstInsuranceAmn;
    @XmlElement(name = "OutTotalsDcAccountCollateralYieldLimitAmn", required = true)
    protected BigDecimal outTotalsDcAccountCollateralYieldLimitAmn;
    @XmlElement(name = "OutTotalsDcCollateralWorkGeneralAmount", required = true)
    protected BigDecimal outTotalsDcCollateralWorkGeneralAmount;
    @XmlElement(name = "OutTotalsDcCollateralWorkEstInsurAmnFrom", required = true)
    protected BigDecimal outTotalsDcCollateralWorkEstInsurAmnFrom;
    @XmlElement(name = "OutTotalsDcCollateralWorkEstInsurAmnTo", required = true)
    protected BigDecimal outTotalsDcCollateralWorkEstInsurAmnTo;
    @XmlElement(name = "OutTotalsDcCollateralWorkTotalAccountBalDc", required = true)
    protected BigDecimal outTotalsDcCollateralWorkTotalAccountBalDc;
    @XmlElement(name = "OutGrpCollaterals")
    protected ArrayOfMC2003VOutGrpCollateralsItem outGrpCollaterals;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfMC2003VOutGrpSrvLogItem outGrpSrvLog;

    /**
     * Gets the value of the outGenericHeaderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGenericHeaderDescription() {
        return outGenericHeaderDescription;
    }

    /**
     * Sets the value of the outGenericHeaderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGenericHeaderDescription(String value) {
        this.outGenericHeaderDescription = value;
    }

    /**
     * Gets the value of the outSelectedCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerFirstName() {
        return outSelectedCustomerFirstName;
    }

    /**
     * Sets the value of the outSelectedCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerFirstName(String value) {
        this.outSelectedCustomerFirstName = value;
    }

    /**
     * Gets the value of the outSelectedCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerSurname() {
        return outSelectedCustomerSurname;
    }

    /**
     * Sets the value of the outSelectedCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerSurname(String value) {
        this.outSelectedCustomerSurname = value;
    }

    /**
     * Gets the value of the outSelectedListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedListSetDescription() {
        return outSelectedListSetDescription;
    }

    /**
     * Sets the value of the outSelectedListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedListSetDescription(String value) {
        this.outSelectedListSetDescription = value;
    }

    /**
     * Gets the value of the outTotalEstimatedLossCollateralWorkEstLossCustomerDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalEstimatedLossCollateralWorkEstLossCustomerDc() {
        return outTotalEstimatedLossCollateralWorkEstLossCustomerDc;
    }

    /**
     * Sets the value of the outTotalEstimatedLossCollateralWorkEstLossCustomerDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalEstimatedLossCollateralWorkEstLossCustomerDc(BigDecimal value) {
        this.outTotalEstimatedLossCollateralWorkEstLossCustomerDc = value;
    }

    /**
     * Gets the value of the outTotalEstimatedLossCollateralWorkEstLossAccountsDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalEstimatedLossCollateralWorkEstLossAccountsDc() {
        return outTotalEstimatedLossCollateralWorkEstLossAccountsDc;
    }

    /**
     * Sets the value of the outTotalEstimatedLossCollateralWorkEstLossAccountsDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalEstimatedLossCollateralWorkEstLossAccountsDc(BigDecimal value) {
        this.outTotalEstimatedLossCollateralWorkEstLossAccountsDc = value;
    }

    /**
     * Gets the value of the outTotalsDcAccountCollateralEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsDcAccountCollateralEstValueAmn() {
        return outTotalsDcAccountCollateralEstValueAmn;
    }

    /**
     * Sets the value of the outTotalsDcAccountCollateralEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsDcAccountCollateralEstValueAmn(BigDecimal value) {
        this.outTotalsDcAccountCollateralEstValueAmn = value;
    }

    /**
     * Gets the value of the outTotalsDcAccountCollateralEstInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsDcAccountCollateralEstInsuranceAmn() {
        return outTotalsDcAccountCollateralEstInsuranceAmn;
    }

    /**
     * Sets the value of the outTotalsDcAccountCollateralEstInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsDcAccountCollateralEstInsuranceAmn(BigDecimal value) {
        this.outTotalsDcAccountCollateralEstInsuranceAmn = value;
    }

    /**
     * Gets the value of the outTotalsDcAccountCollateralYieldLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsDcAccountCollateralYieldLimitAmn() {
        return outTotalsDcAccountCollateralYieldLimitAmn;
    }

    /**
     * Sets the value of the outTotalsDcAccountCollateralYieldLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsDcAccountCollateralYieldLimitAmn(BigDecimal value) {
        this.outTotalsDcAccountCollateralYieldLimitAmn = value;
    }

    /**
     * Gets the value of the outTotalsDcCollateralWorkGeneralAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsDcCollateralWorkGeneralAmount() {
        return outTotalsDcCollateralWorkGeneralAmount;
    }

    /**
     * Sets the value of the outTotalsDcCollateralWorkGeneralAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsDcCollateralWorkGeneralAmount(BigDecimal value) {
        this.outTotalsDcCollateralWorkGeneralAmount = value;
    }

    /**
     * Gets the value of the outTotalsDcCollateralWorkEstInsurAmnFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsDcCollateralWorkEstInsurAmnFrom() {
        return outTotalsDcCollateralWorkEstInsurAmnFrom;
    }

    /**
     * Sets the value of the outTotalsDcCollateralWorkEstInsurAmnFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsDcCollateralWorkEstInsurAmnFrom(BigDecimal value) {
        this.outTotalsDcCollateralWorkEstInsurAmnFrom = value;
    }

    /**
     * Gets the value of the outTotalsDcCollateralWorkEstInsurAmnTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsDcCollateralWorkEstInsurAmnTo() {
        return outTotalsDcCollateralWorkEstInsurAmnTo;
    }

    /**
     * Sets the value of the outTotalsDcCollateralWorkEstInsurAmnTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsDcCollateralWorkEstInsurAmnTo(BigDecimal value) {
        this.outTotalsDcCollateralWorkEstInsurAmnTo = value;
    }

    /**
     * Gets the value of the outTotalsDcCollateralWorkTotalAccountBalDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsDcCollateralWorkTotalAccountBalDc() {
        return outTotalsDcCollateralWorkTotalAccountBalDc;
    }

    /**
     * Sets the value of the outTotalsDcCollateralWorkTotalAccountBalDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsDcCollateralWorkTotalAccountBalDc(BigDecimal value) {
        this.outTotalsDcCollateralWorkTotalAccountBalDc = value;
    }

    /**
     * Gets the value of the outGrpCollaterals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2003VOutGrpCollateralsItem }
     *     
     */
    public ArrayOfMC2003VOutGrpCollateralsItem getOutGrpCollaterals() {
        return outGrpCollaterals;
    }

    /**
     * Sets the value of the outGrpCollaterals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2003VOutGrpCollateralsItem }
     *     
     */
    public void setOutGrpCollaterals(ArrayOfMC2003VOutGrpCollateralsItem value) {
        this.outGrpCollaterals = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2003VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfMC2003VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2003VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfMC2003VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

}
