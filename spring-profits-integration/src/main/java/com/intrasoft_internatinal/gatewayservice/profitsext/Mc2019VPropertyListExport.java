
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2019VPropertyListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2019VPropertyListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2019VOutGrpSrvLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpRealEstate" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2019VOutGrpRealEstateItem" minOccurs="0"/>
 *         &lt;element name="OutGrpStock" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2019VOutGrpStockItem" minOccurs="0"/>
 *         &lt;element name="OutContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutContinueRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2019VPropertyListExport", propOrder = {
    "outGrpSrvLog",
    "outGrpRealEstate",
    "outGrpStock",
    "outContinueCollateralTableInternalSn",
    "outContinueRealEstateId"
})
public class Mc2019VPropertyListExport
    extends BaseExport
{

    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfMc2019VOutGrpSrvLogItem outGrpSrvLog;
    @XmlElement(name = "OutGrpRealEstate")
    protected ArrayOfMc2019VOutGrpRealEstateItem outGrpRealEstate;
    @XmlElement(name = "OutGrpStock")
    protected ArrayOfMc2019VOutGrpStockItem outGrpStock;
    @XmlElement(name = "OutContinueCollateralTableInternalSn")
    protected double outContinueCollateralTableInternalSn;
    @XmlElement(name = "OutContinueRealEstateId")
    protected double outContinueRealEstateId;

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2019VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfMc2019VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2019VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfMc2019VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

    /**
     * Gets the value of the outGrpRealEstate property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2019VOutGrpRealEstateItem }
     *     
     */
    public ArrayOfMc2019VOutGrpRealEstateItem getOutGrpRealEstate() {
        return outGrpRealEstate;
    }

    /**
     * Sets the value of the outGrpRealEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2019VOutGrpRealEstateItem }
     *     
     */
    public void setOutGrpRealEstate(ArrayOfMc2019VOutGrpRealEstateItem value) {
        this.outGrpRealEstate = value;
    }

    /**
     * Gets the value of the outGrpStock property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2019VOutGrpStockItem }
     *     
     */
    public ArrayOfMc2019VOutGrpStockItem getOutGrpStock() {
        return outGrpStock;
    }

    /**
     * Sets the value of the outGrpStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2019VOutGrpStockItem }
     *     
     */
    public void setOutGrpStock(ArrayOfMc2019VOutGrpStockItem value) {
        this.outGrpStock = value;
    }

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
     * Gets the value of the outContinueRealEstateId property.
     * 
     */
    public double getOutContinueRealEstateId() {
        return outContinueRealEstateId;
    }

    /**
     * Sets the value of the outContinueRealEstateId property.
     * 
     */
    public void setOutContinueRealEstateId(double value) {
        this.outContinueRealEstateId = value;
    }

}
