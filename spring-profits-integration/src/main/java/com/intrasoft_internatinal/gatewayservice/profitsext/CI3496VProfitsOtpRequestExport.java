
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI3496V_ProfitsOtpRequestExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_ProfitsOtpRequestExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutKeyOtpKeyOtpKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultOtpUserLogLogAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultOtpUserLogLogResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultOtpUserLogLogErrorAb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultOtpWorkTrxSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_ProfitsOtpRequestExport", propOrder = {
    "outKeyOtpKeyOtpKey",
    "outResultOtpUserLogLogAction",
    "outResultOtpUserLogLogResult",
    "outResultOtpUserLogLogErrorAb",
    "outResultOtpWorkTrxSuccess"
})
public class CI3496VProfitsOtpRequestExport
    extends BaseExport
{

    @XmlElement(name = "OutKeyOtpKeyOtpKey")
    protected String outKeyOtpKeyOtpKey;
    @XmlElement(name = "OutResultOtpUserLogLogAction")
    protected String outResultOtpUserLogLogAction;
    @XmlElement(name = "OutResultOtpUserLogLogResult")
    protected String outResultOtpUserLogLogResult;
    @XmlElement(name = "OutResultOtpUserLogLogErrorAb")
    protected String outResultOtpUserLogLogErrorAb;
    @XmlElement(name = "OutResultOtpWorkTrxSuccess")
    protected String outResultOtpWorkTrxSuccess;

    /**
     * Gets the value of the outKeyOtpKeyOtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutKeyOtpKeyOtpKey() {
        return outKeyOtpKeyOtpKey;
    }

    /**
     * Sets the value of the outKeyOtpKeyOtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutKeyOtpKeyOtpKey(String value) {
        this.outKeyOtpKeyOtpKey = value;
    }

    /**
     * Gets the value of the outResultOtpUserLogLogAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultOtpUserLogLogAction() {
        return outResultOtpUserLogLogAction;
    }

    /**
     * Sets the value of the outResultOtpUserLogLogAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultOtpUserLogLogAction(String value) {
        this.outResultOtpUserLogLogAction = value;
    }

    /**
     * Gets the value of the outResultOtpUserLogLogResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultOtpUserLogLogResult() {
        return outResultOtpUserLogLogResult;
    }

    /**
     * Sets the value of the outResultOtpUserLogLogResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultOtpUserLogLogResult(String value) {
        this.outResultOtpUserLogLogResult = value;
    }

    /**
     * Gets the value of the outResultOtpUserLogLogErrorAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultOtpUserLogLogErrorAb() {
        return outResultOtpUserLogLogErrorAb;
    }

    /**
     * Sets the value of the outResultOtpUserLogLogErrorAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultOtpUserLogLogErrorAb(String value) {
        this.outResultOtpUserLogLogErrorAb = value;
    }

    /**
     * Gets the value of the outResultOtpWorkTrxSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultOtpWorkTrxSuccess() {
        return outResultOtpWorkTrxSuccess;
    }

    /**
     * Sets the value of the outResultOtpWorkTrxSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultOtpWorkTrxSuccess(String value) {
        this.outResultOtpWorkTrxSuccess = value;
    }

}
