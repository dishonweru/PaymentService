
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2029VCollateralPfgListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2029VCollateralPfgListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2029VOutGrpItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2029VOutGrpSrvLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2029VCollateralPfgListExport", propOrder = {
    "outContinueCollateralTableInternalSn",
    "outGrp",
    "outGrpSrvLog"
})
public class MC2029VCollateralPfgListExport
    extends BaseExport
{

    @XmlElement(name = "OutContinueCollateralTableInternalSn")
    protected double outContinueCollateralTableInternalSn;
    @XmlElement(name = "OutGrp")
    protected ArrayOfMC2029VOutGrpItem outGrp;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfMC2029VOutGrpSrvLogItem outGrpSrvLog;

    /**
     * Gets the value of the outContinueCollateralTableInternalSn property.
     * 
     */
    public double getOutContinueCollateralTableInternalSn() {
        return outContinueCollateralTableInternalSn;
    }

    /**
     * Sets the value of the outContinueCollateralTableInternalSn property.
     * 
     */
    public void setOutContinueCollateralTableInternalSn(double value) {
        this.outContinueCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2029VOutGrpItem }
     *     
     */
    public ArrayOfMC2029VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2029VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfMC2029VOutGrpItem value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2029VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfMC2029VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2029VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfMC2029VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

}
