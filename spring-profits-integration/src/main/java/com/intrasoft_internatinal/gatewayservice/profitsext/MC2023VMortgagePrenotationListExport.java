
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2023VMortgagePrenotationListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2023VMortgagePrenotationListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRecords" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2023VOutGrpRecordsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2023VMortgagePrenotationListExport", propOrder = {
    "outContinueCollateralTableInternalSn",
    "outGrpRecords"
})
public class MC2023VMortgagePrenotationListExport
    extends BaseExport
{

    @XmlElement(name = "OutContinueCollateralTableInternalSn")
    protected double outContinueCollateralTableInternalSn;
    @XmlElement(name = "OutGrpRecords")
    protected ArrayOfMC2023VOutGrpRecordsItem outGrpRecords;

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
     * Gets the value of the outGrpRecords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2023VOutGrpRecordsItem }
     *     
     */
    public ArrayOfMC2023VOutGrpRecordsItem getOutGrpRecords() {
        return outGrpRecords;
    }

    /**
     * Sets the value of the outGrpRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2023VOutGrpRecordsItem }
     *     
     */
    public void setOutGrpRecords(ArrayOfMC2023VOutGrpRecordsItem value) {
        this.outGrpRecords = value;
    }

}
