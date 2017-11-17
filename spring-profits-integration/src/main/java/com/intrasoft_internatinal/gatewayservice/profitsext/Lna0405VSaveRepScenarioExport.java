
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Lna0405VSaveRepScenarioExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lna0405VSaveRepScenarioExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutDaysbaseLnsInterestDaysbase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustData" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpCustDataItem" minOccurs="0"/>
 *         &lt;element name="OutInterestSupplyWorkCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanScenarioDataInstallSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCoinsuredGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfLna0405VOutCoinsuredGrpItem" minOccurs="0"/>
 *         &lt;element name="OutGrpDbSelectedInsProds" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfLna0405VOutGrpDbSelectedInsProdsItem" minOccurs="0"/>
 *         &lt;element name="OutLoopFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLnpar7FlagIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpMediators" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfLna0405VOutGrpMediatorsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lna0405VSaveRepScenarioExport", propOrder = {
    "outDaysbaseLnsInterestDaysbase",
    "outGrpCustData",
    "outInterestSupplyWorkCurFxIntScalDt",
    "outInterestSupplyWorkFixedInterestPrc",
    "outLoanScenarioDataInstallSn",
    "outCoinsuredGrp",
    "outGrpDbSelectedInsProds",
    "outLoopFlagIefSuppliedFlag",
    "outLnpar7FlagIefSuppliedChar1",
    "outGrpMediators"
})
public class Lna0405VSaveRepScenarioExport
    extends BaseExport
{

    @XmlElement(name = "OutDaysbaseLnsInterestDaysbase")
    protected short outDaysbaseLnsInterestDaysbase;
    @XmlElement(name = "OutGrpCustData")
    protected ArrayOfOutGrpCustDataItem outGrpCustData;
    @XmlElement(name = "OutInterestSupplyWorkCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInterestSupplyWorkCurFxIntScalDt;
    @XmlElement(name = "OutInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutLoanScenarioDataInstallSn")
    protected double outLoanScenarioDataInstallSn;
    @XmlElement(name = "OutCoinsuredGrp")
    protected ArrayOfLna0405VOutCoinsuredGrpItem outCoinsuredGrp;
    @XmlElement(name = "OutGrpDbSelectedInsProds")
    protected ArrayOfLna0405VOutGrpDbSelectedInsProdsItem outGrpDbSelectedInsProds;
    @XmlElement(name = "OutLoopFlagIefSuppliedFlag")
    protected String outLoopFlagIefSuppliedFlag;
    @XmlElement(name = "OutLnpar7FlagIefSuppliedChar1")
    protected String outLnpar7FlagIefSuppliedChar1;
    @XmlElement(name = "OutGrpMediators")
    protected ArrayOfLna0405VOutGrpMediatorsItem outGrpMediators;

    /**
     * Gets the value of the outDaysbaseLnsInterestDaysbase property.
     * 
     */
    public short getOutDaysbaseLnsInterestDaysbase() {
        return outDaysbaseLnsInterestDaysbase;
    }

    /**
     * Sets the value of the outDaysbaseLnsInterestDaysbase property.
     * 
     */
    public void setOutDaysbaseLnsInterestDaysbase(short value) {
        this.outDaysbaseLnsInterestDaysbase = value;
    }

    /**
     * Gets the value of the outGrpCustData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpCustDataItem }
     *     
     */
    public ArrayOfOutGrpCustDataItem getOutGrpCustData() {
        return outGrpCustData;
    }

    /**
     * Sets the value of the outGrpCustData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpCustDataItem }
     *     
     */
    public void setOutGrpCustData(ArrayOfOutGrpCustDataItem value) {
        this.outGrpCustData = value;
    }

    /**
     * Gets the value of the outInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInterestSupplyWorkCurFxIntScalDt() {
        return outInterestSupplyWorkCurFxIntScalDt;
    }

    /**
     * Sets the value of the outInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInterestSupplyWorkCurFxIntScalDt(XMLGregorianCalendar value) {
        this.outInterestSupplyWorkCurFxIntScalDt = value;
    }

    /**
     * Gets the value of the outInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInterestSupplyWorkFixedInterestPrc() {
        return outInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outLoanScenarioDataInstallSn property.
     * 
     */
    public double getOutLoanScenarioDataInstallSn() {
        return outLoanScenarioDataInstallSn;
    }

    /**
     * Sets the value of the outLoanScenarioDataInstallSn property.
     * 
     */
    public void setOutLoanScenarioDataInstallSn(double value) {
        this.outLoanScenarioDataInstallSn = value;
    }

    /**
     * Gets the value of the outCoinsuredGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLna0405VOutCoinsuredGrpItem }
     *     
     */
    public ArrayOfLna0405VOutCoinsuredGrpItem getOutCoinsuredGrp() {
        return outCoinsuredGrp;
    }

    /**
     * Sets the value of the outCoinsuredGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLna0405VOutCoinsuredGrpItem }
     *     
     */
    public void setOutCoinsuredGrp(ArrayOfLna0405VOutCoinsuredGrpItem value) {
        this.outCoinsuredGrp = value;
    }

    /**
     * Gets the value of the outGrpDbSelectedInsProds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLna0405VOutGrpDbSelectedInsProdsItem }
     *     
     */
    public ArrayOfLna0405VOutGrpDbSelectedInsProdsItem getOutGrpDbSelectedInsProds() {
        return outGrpDbSelectedInsProds;
    }

    /**
     * Sets the value of the outGrpDbSelectedInsProds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLna0405VOutGrpDbSelectedInsProdsItem }
     *     
     */
    public void setOutGrpDbSelectedInsProds(ArrayOfLna0405VOutGrpDbSelectedInsProdsItem value) {
        this.outGrpDbSelectedInsProds = value;
    }

    /**
     * Gets the value of the outLoopFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoopFlagIefSuppliedFlag() {
        return outLoopFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outLoopFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoopFlagIefSuppliedFlag(String value) {
        this.outLoopFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outLnpar7FlagIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLnpar7FlagIefSuppliedChar1() {
        return outLnpar7FlagIefSuppliedChar1;
    }

    /**
     * Sets the value of the outLnpar7FlagIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLnpar7FlagIefSuppliedChar1(String value) {
        this.outLnpar7FlagIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the outGrpMediators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLna0405VOutGrpMediatorsItem }
     *     
     */
    public ArrayOfLna0405VOutGrpMediatorsItem getOutGrpMediators() {
        return outGrpMediators;
    }

    /**
     * Sets the value of the outGrpMediators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLna0405VOutGrpMediatorsItem }
     *     
     */
    public void setOutGrpMediators(ArrayOfLna0405VOutGrpMediatorsItem value) {
        this.outGrpMediators = value;
    }

}
