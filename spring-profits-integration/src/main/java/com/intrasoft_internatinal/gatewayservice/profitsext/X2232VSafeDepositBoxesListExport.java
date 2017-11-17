
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for X2232VSafeDepositBoxesListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X2232VSafeDepositBoxesListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutPreviousSafeDepositBoxSdbStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueSafeDepositBoxSdbStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueSafeDepositBoxSdbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfX2232VOutGrpSrvLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSdb" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfX2232VOutGrpSdbItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X2232VSafeDepositBoxesListExport", propOrder = {
    "outPreviousSafeDepositBoxSdbStatus",
    "outContinueSafeDepositBoxSdbStatus",
    "outContinueSafeDepositBoxSdbSn",
    "outGrpSrvLog",
    "outGrpSdb"
})
public class X2232VSafeDepositBoxesListExport
    extends BaseExport
{

    @XmlElement(name = "OutPreviousSafeDepositBoxSdbStatus")
    protected String outPreviousSafeDepositBoxSdbStatus;
    @XmlElement(name = "OutContinueSafeDepositBoxSdbStatus")
    protected String outContinueSafeDepositBoxSdbStatus;
    @XmlElement(name = "OutContinueSafeDepositBoxSdbSn")
    protected int outContinueSafeDepositBoxSdbSn;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfX2232VOutGrpSrvLogItem outGrpSrvLog;
    @XmlElement(name = "OutGrpSdb")
    protected ArrayOfX2232VOutGrpSdbItem outGrpSdb;

    /**
     * Gets the value of the outPreviousSafeDepositBoxSdbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPreviousSafeDepositBoxSdbStatus() {
        return outPreviousSafeDepositBoxSdbStatus;
    }

    /**
     * Sets the value of the outPreviousSafeDepositBoxSdbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPreviousSafeDepositBoxSdbStatus(String value) {
        this.outPreviousSafeDepositBoxSdbStatus = value;
    }

    /**
     * Gets the value of the outContinueSafeDepositBoxSdbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinueSafeDepositBoxSdbStatus() {
        return outContinueSafeDepositBoxSdbStatus;
    }

    /**
     * Sets the value of the outContinueSafeDepositBoxSdbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinueSafeDepositBoxSdbStatus(String value) {
        this.outContinueSafeDepositBoxSdbStatus = value;
    }

    /**
     * Gets the value of the outContinueSafeDepositBoxSdbSn property.
     * 
     */
    public int getOutContinueSafeDepositBoxSdbSn() {
        return outContinueSafeDepositBoxSdbSn;
    }

    /**
     * Sets the value of the outContinueSafeDepositBoxSdbSn property.
     * 
     */
    public void setOutContinueSafeDepositBoxSdbSn(int value) {
        this.outContinueSafeDepositBoxSdbSn = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfX2232VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfX2232VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfX2232VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfX2232VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

    /**
     * Gets the value of the outGrpSdb property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfX2232VOutGrpSdbItem }
     *     
     */
    public ArrayOfX2232VOutGrpSdbItem getOutGrpSdb() {
        return outGrpSdb;
    }

    /**
     * Sets the value of the outGrpSdb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfX2232VOutGrpSdbItem }
     *     
     */
    public void setOutGrpSdb(ArrayOfX2232VOutGrpSdbItem value) {
        this.outGrpSdb = value;
    }

}
