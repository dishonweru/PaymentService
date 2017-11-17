
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutPrnChqGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutPrnChqGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrnChqGrpOutPrintDepTrxRecordingTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutPrnChqGrp", propOrder = {
    "outPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount",
    "outPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn",
    "outPrnChqGrpOutPrintDepTrxRecordingTunInternalSn",
    "outPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn"
})
public class OutPrnChqGrp {

    @XmlElement(name = "OutPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount", required = true)
    protected BigDecimal outPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount;
    @XmlElement(name = "OutPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn")
    protected int outPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn;
    @XmlElement(name = "OutPrnChqGrpOutPrintDepTrxRecordingTunInternalSn")
    protected short outPrnChqGrpOutPrintDepTrxRecordingTunInternalSn;
    @XmlElement(name = "OutPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn", required = true)
    protected BigDecimal outPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn;

    /**
     * Gets the value of the outPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount() {
        return outPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount;
    }

    /**
     * Sets the value of the outPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount(BigDecimal value) {
        this.outPrnChqGrpOutPrintDepTrxRecordingOFinalAccAmount = value;
    }

    /**
     * Gets the value of the outPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn property.
     * 
     */
    public int getOutPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn() {
        return outPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn property.
     * 
     */
    public void setOutPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn(int value) {
        this.outPrnChqGrpOutPrintDepTrxRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outPrnChqGrpOutPrintDepTrxRecordingTunInternalSn property.
     * 
     */
    public short getOutPrnChqGrpOutPrintDepTrxRecordingTunInternalSn() {
        return outPrnChqGrpOutPrintDepTrxRecordingTunInternalSn;
    }

    /**
     * Sets the value of the outPrnChqGrpOutPrintDepTrxRecordingTunInternalSn property.
     * 
     */
    public void setOutPrnChqGrpOutPrintDepTrxRecordingTunInternalSn(short value) {
        this.outPrnChqGrpOutPrintDepTrxRecordingTunInternalSn = value;
    }

    /**
     * Gets the value of the outPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn() {
        return outPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn;
    }

    /**
     * Sets the value of the outPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn(BigDecimal value) {
        this.outPrnChqGrpOutPrintDepTrxRecordingUUserTotalsAmn = value;
    }

}
