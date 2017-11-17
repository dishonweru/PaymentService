
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2007VCollateralListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2007VCollateralListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutContinueCollateralDetailCtblInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutContinueCollateralDetailInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutContinueCollateralDetailRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutContinueCollateralDetailRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutShipId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutShipShipDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2007VOutGrpSrvLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpStock" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2007VOutGrpStockItem" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutValuerInternalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerCountyGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutValuerCountyGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerCountyGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerBankemplBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuers" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2007VOutGrpValuersItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2007VCollateralListExport", propOrder = {
    "outContinueCollateralDetailCtblInternalSn",
    "outContinueCollateralDetailInternalSn",
    "outContinueCollateralDetailRealEstateId",
    "outContinueCollateralDetailRecordType",
    "outContinueCollateralTableInternalSn",
    "outShipId",
    "outShipShipDescription",
    "outGrpSrvLog",
    "outGrpStock",
    "outValuerValuerId",
    "outValuerInternalFlg",
    "outValuerValuerName",
    "outValuerValuerPhone",
    "outValuerValuerMobile",
    "outValuerValuerAddress",
    "outValuerValuerEmail",
    "outValuerEntryStatus",
    "outValuerCountyGenericDetailSerialNum",
    "outValuerCountyGenericDetailParameterType",
    "outValuerCountyGenericDetailDescription",
    "outValuerBankemplBankemployeeId",
    "outGrpValuers"
})
public class MC2007VCollateralListExport
    extends BaseExport
{

    @XmlElement(name = "OutContinueCollateralDetailCtblInternalSn")
    protected double outContinueCollateralDetailCtblInternalSn;
    @XmlElement(name = "OutContinueCollateralDetailInternalSn")
    protected double outContinueCollateralDetailInternalSn;
    @XmlElement(name = "OutContinueCollateralDetailRealEstateId")
    protected double outContinueCollateralDetailRealEstateId;
    @XmlElement(name = "OutContinueCollateralDetailRecordType")
    protected String outContinueCollateralDetailRecordType;
    @XmlElement(name = "OutContinueCollateralTableInternalSn")
    protected double outContinueCollateralTableInternalSn;
    @XmlElement(name = "OutShipId")
    protected double outShipId;
    @XmlElement(name = "OutShipShipDescription")
    protected String outShipShipDescription;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfMC2007VOutGrpSrvLogItem outGrpSrvLog;
    @XmlElement(name = "OutGrpStock")
    protected ArrayOfMC2007VOutGrpStockItem outGrpStock;
    @XmlElement(name = "OutValuerValuerId")
    protected int outValuerValuerId;
    @XmlElement(name = "OutValuerInternalFlg")
    protected String outValuerInternalFlg;
    @XmlElement(name = "OutValuerValuerName")
    protected String outValuerValuerName;
    @XmlElement(name = "OutValuerValuerPhone")
    protected String outValuerValuerPhone;
    @XmlElement(name = "OutValuerValuerMobile")
    protected String outValuerValuerMobile;
    @XmlElement(name = "OutValuerValuerAddress")
    protected String outValuerValuerAddress;
    @XmlElement(name = "OutValuerValuerEmail")
    protected String outValuerValuerEmail;
    @XmlElement(name = "OutValuerEntryStatus")
    protected String outValuerEntryStatus;
    @XmlElement(name = "OutValuerCountyGenericDetailSerialNum")
    protected int outValuerCountyGenericDetailSerialNum;
    @XmlElement(name = "OutValuerCountyGenericDetailParameterType")
    protected String outValuerCountyGenericDetailParameterType;
    @XmlElement(name = "OutValuerCountyGenericDetailDescription")
    protected String outValuerCountyGenericDetailDescription;
    @XmlElement(name = "OutValuerBankemplBankemployeeId")
    protected String outValuerBankemplBankemployeeId;
    @XmlElement(name = "OutGrpValuers")
    protected ArrayOfMC2007VOutGrpValuersItem outGrpValuers;

    /**
     * Gets the value of the outContinueCollateralDetailCtblInternalSn property.
     * 
     */
    public double getOutContinueCollateralDetailCtblInternalSn() {
        return outContinueCollateralDetailCtblInternalSn;
    }

    /**
     * Sets the value of the outContinueCollateralDetailCtblInternalSn property.
     * 
     */
    public void setOutContinueCollateralDetailCtblInternalSn(double value) {
        this.outContinueCollateralDetailCtblInternalSn = value;
    }

    /**
     * Gets the value of the outContinueCollateralDetailInternalSn property.
     * 
     */
    public double getOutContinueCollateralDetailInternalSn() {
        return outContinueCollateralDetailInternalSn;
    }

    /**
     * Sets the value of the outContinueCollateralDetailInternalSn property.
     * 
     */
    public void setOutContinueCollateralDetailInternalSn(double value) {
        this.outContinueCollateralDetailInternalSn = value;
    }

    /**
     * Gets the value of the outContinueCollateralDetailRealEstateId property.
     * 
     */
    public double getOutContinueCollateralDetailRealEstateId() {
        return outContinueCollateralDetailRealEstateId;
    }

    /**
     * Sets the value of the outContinueCollateralDetailRealEstateId property.
     * 
     */
    public void setOutContinueCollateralDetailRealEstateId(double value) {
        this.outContinueCollateralDetailRealEstateId = value;
    }

    /**
     * Gets the value of the outContinueCollateralDetailRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinueCollateralDetailRecordType() {
        return outContinueCollateralDetailRecordType;
    }

    /**
     * Sets the value of the outContinueCollateralDetailRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinueCollateralDetailRecordType(String value) {
        this.outContinueCollateralDetailRecordType = value;
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
     * Gets the value of the outShipId property.
     * 
     */
    public double getOutShipId() {
        return outShipId;
    }

    /**
     * Sets the value of the outShipId property.
     * 
     */
    public void setOutShipId(double value) {
        this.outShipId = value;
    }

    /**
     * Gets the value of the outShipShipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutShipShipDescription() {
        return outShipShipDescription;
    }

    /**
     * Sets the value of the outShipShipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutShipShipDescription(String value) {
        this.outShipShipDescription = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2007VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfMC2007VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2007VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfMC2007VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

    /**
     * Gets the value of the outGrpStock property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2007VOutGrpStockItem }
     *     
     */
    public ArrayOfMC2007VOutGrpStockItem getOutGrpStock() {
        return outGrpStock;
    }

    /**
     * Sets the value of the outGrpStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2007VOutGrpStockItem }
     *     
     */
    public void setOutGrpStock(ArrayOfMC2007VOutGrpStockItem value) {
        this.outGrpStock = value;
    }

    /**
     * Gets the value of the outValuerValuerId property.
     * 
     */
    public int getOutValuerValuerId() {
        return outValuerValuerId;
    }

    /**
     * Sets the value of the outValuerValuerId property.
     * 
     */
    public void setOutValuerValuerId(int value) {
        this.outValuerValuerId = value;
    }

    /**
     * Gets the value of the outValuerInternalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerInternalFlg() {
        return outValuerInternalFlg;
    }

    /**
     * Sets the value of the outValuerInternalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerInternalFlg(String value) {
        this.outValuerInternalFlg = value;
    }

    /**
     * Gets the value of the outValuerValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerName() {
        return outValuerValuerName;
    }

    /**
     * Sets the value of the outValuerValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerName(String value) {
        this.outValuerValuerName = value;
    }

    /**
     * Gets the value of the outValuerValuerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerPhone() {
        return outValuerValuerPhone;
    }

    /**
     * Sets the value of the outValuerValuerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerPhone(String value) {
        this.outValuerValuerPhone = value;
    }

    /**
     * Gets the value of the outValuerValuerMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerMobile() {
        return outValuerValuerMobile;
    }

    /**
     * Sets the value of the outValuerValuerMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerMobile(String value) {
        this.outValuerValuerMobile = value;
    }

    /**
     * Gets the value of the outValuerValuerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerAddress() {
        return outValuerValuerAddress;
    }

    /**
     * Sets the value of the outValuerValuerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerAddress(String value) {
        this.outValuerValuerAddress = value;
    }

    /**
     * Gets the value of the outValuerValuerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerEmail() {
        return outValuerValuerEmail;
    }

    /**
     * Sets the value of the outValuerValuerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerEmail(String value) {
        this.outValuerValuerEmail = value;
    }

    /**
     * Gets the value of the outValuerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerEntryStatus() {
        return outValuerEntryStatus;
    }

    /**
     * Sets the value of the outValuerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerEntryStatus(String value) {
        this.outValuerEntryStatus = value;
    }

    /**
     * Gets the value of the outValuerCountyGenericDetailSerialNum property.
     * 
     */
    public int getOutValuerCountyGenericDetailSerialNum() {
        return outValuerCountyGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outValuerCountyGenericDetailSerialNum property.
     * 
     */
    public void setOutValuerCountyGenericDetailSerialNum(int value) {
        this.outValuerCountyGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outValuerCountyGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerCountyGenericDetailParameterType() {
        return outValuerCountyGenericDetailParameterType;
    }

    /**
     * Sets the value of the outValuerCountyGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerCountyGenericDetailParameterType(String value) {
        this.outValuerCountyGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outValuerCountyGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerCountyGenericDetailDescription() {
        return outValuerCountyGenericDetailDescription;
    }

    /**
     * Sets the value of the outValuerCountyGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerCountyGenericDetailDescription(String value) {
        this.outValuerCountyGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outValuerBankemplBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerBankemplBankemployeeId() {
        return outValuerBankemplBankemployeeId;
    }

    /**
     * Sets the value of the outValuerBankemplBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerBankemplBankemployeeId(String value) {
        this.outValuerBankemplBankemployeeId = value;
    }

    /**
     * Gets the value of the outGrpValuers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2007VOutGrpValuersItem }
     *     
     */
    public ArrayOfMC2007VOutGrpValuersItem getOutGrpValuers() {
        return outGrpValuers;
    }

    /**
     * Sets the value of the outGrpValuers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2007VOutGrpValuersItem }
     *     
     */
    public void setOutGrpValuers(ArrayOfMC2007VOutGrpValuersItem value) {
        this.outGrpValuers = value;
    }

}
