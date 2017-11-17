
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2024VCollateralListPerCollateralTypeExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2024VCollateralListPerCollateralTypeExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExitState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExitStateMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TrustClients" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OutGrpRecords" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2024VOutGrpRecordsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2024VOutGrpSrvLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2024VCollateralListPerCollateralTypeExport", propOrder = {
    "command",
    "exitState",
    "exitStateMessage",
    "outContinueCollateralTableInternalSn",
    "trustClients",
    "outGrpRecords",
    "outGrpSrvLog"
})
public class MC2024VCollateralListPerCollateralTypeExport
    extends BaseExport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ExitState")
    protected int exitState;
    @XmlElement(name = "ExitStateMessage")
    protected String exitStateMessage;
    @XmlElement(name = "OutContinueCollateralTableInternalSn")
    protected double outContinueCollateralTableInternalSn;
    @XmlElement(name = "TrustClients")
    protected boolean trustClients;
    @XmlElement(name = "OutGrpRecords")
    protected ArrayOfMC2024VOutGrpRecordsItem outGrpRecords;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfMC2024VOutGrpSrvLogItem outGrpSrvLog;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the exitState property.
     * 
     */
    public int getExitState() {
        return exitState;
    }

    /**
     * Sets the value of the exitState property.
     * 
     */
    public void setExitState(int value) {
        this.exitState = value;
    }

    /**
     * Gets the value of the exitStateMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitStateMessage() {
        return exitStateMessage;
    }

    /**
     * Sets the value of the exitStateMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitStateMessage(String value) {
        this.exitStateMessage = value;
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
     * Gets the value of the trustClients property.
     * 
     */
    public boolean isTrustClients() {
        return trustClients;
    }

    /**
     * Sets the value of the trustClients property.
     * 
     */
    public void setTrustClients(boolean value) {
        this.trustClients = value;
    }

    /**
     * Gets the value of the outGrpRecords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2024VOutGrpRecordsItem }
     *     
     */
    public ArrayOfMC2024VOutGrpRecordsItem getOutGrpRecords() {
        return outGrpRecords;
    }

    /**
     * Sets the value of the outGrpRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2024VOutGrpRecordsItem }
     *     
     */
    public void setOutGrpRecords(ArrayOfMC2024VOutGrpRecordsItem value) {
        this.outGrpRecords = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2024VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfMC2024VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2024VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfMC2024VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

}
