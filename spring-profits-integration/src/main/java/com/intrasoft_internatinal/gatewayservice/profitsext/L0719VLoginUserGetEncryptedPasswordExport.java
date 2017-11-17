
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0719V_LoginUserGetEncryptedPasswordExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0719V_LoginUserGetEncryptedPasswordExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutEncryptedUsrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPassParamsCasesen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPassParamsCharstr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPassParamsLowcaps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPassParamsMax" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPassParamsMin" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPassParamsNums" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPassParamsNumstr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPassParamsSymbs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPassParamsUpcaps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0719V_LoginUserGetEncryptedPasswordExport", propOrder = {
    "outEncryptedUsrPassword",
    "outPassParamsCasesen",
    "outPassParamsCharstr",
    "outPassParamsLowcaps",
    "outPassParamsMax",
    "outPassParamsMin",
    "outPassParamsNums",
    "outPassParamsNumstr",
    "outPassParamsSymbs",
    "outPassParamsUpcaps"
})
public class L0719VLoginUserGetEncryptedPasswordExport
    extends BaseExport
{

    @XmlElement(name = "OutEncryptedUsrPassword")
    protected String outEncryptedUsrPassword;
    @XmlElement(name = "OutPassParamsCasesen")
    protected String outPassParamsCasesen;
    @XmlElement(name = "OutPassParamsCharstr")
    protected String outPassParamsCharstr;
    @XmlElement(name = "OutPassParamsLowcaps")
    protected String outPassParamsLowcaps;
    @XmlElement(name = "OutPassParamsMax")
    protected short outPassParamsMax;
    @XmlElement(name = "OutPassParamsMin")
    protected short outPassParamsMin;
    @XmlElement(name = "OutPassParamsNums")
    protected String outPassParamsNums;
    @XmlElement(name = "OutPassParamsNumstr")
    protected String outPassParamsNumstr;
    @XmlElement(name = "OutPassParamsSymbs")
    protected String outPassParamsSymbs;
    @XmlElement(name = "OutPassParamsUpcaps")
    protected String outPassParamsUpcaps;

    /**
     * Gets the value of the outEncryptedUsrPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEncryptedUsrPassword() {
        return outEncryptedUsrPassword;
    }

    /**
     * Sets the value of the outEncryptedUsrPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEncryptedUsrPassword(String value) {
        this.outEncryptedUsrPassword = value;
    }

    /**
     * Gets the value of the outPassParamsCasesen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassParamsCasesen() {
        return outPassParamsCasesen;
    }

    /**
     * Sets the value of the outPassParamsCasesen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassParamsCasesen(String value) {
        this.outPassParamsCasesen = value;
    }

    /**
     * Gets the value of the outPassParamsCharstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassParamsCharstr() {
        return outPassParamsCharstr;
    }

    /**
     * Sets the value of the outPassParamsCharstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassParamsCharstr(String value) {
        this.outPassParamsCharstr = value;
    }

    /**
     * Gets the value of the outPassParamsLowcaps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassParamsLowcaps() {
        return outPassParamsLowcaps;
    }

    /**
     * Sets the value of the outPassParamsLowcaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassParamsLowcaps(String value) {
        this.outPassParamsLowcaps = value;
    }

    /**
     * Gets the value of the outPassParamsMax property.
     * 
     */
    public short getOutPassParamsMax() {
        return outPassParamsMax;
    }

    /**
     * Sets the value of the outPassParamsMax property.
     * 
     */
    public void setOutPassParamsMax(short value) {
        this.outPassParamsMax = value;
    }

    /**
     * Gets the value of the outPassParamsMin property.
     * 
     */
    public short getOutPassParamsMin() {
        return outPassParamsMin;
    }

    /**
     * Sets the value of the outPassParamsMin property.
     * 
     */
    public void setOutPassParamsMin(short value) {
        this.outPassParamsMin = value;
    }

    /**
     * Gets the value of the outPassParamsNums property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassParamsNums() {
        return outPassParamsNums;
    }

    /**
     * Sets the value of the outPassParamsNums property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassParamsNums(String value) {
        this.outPassParamsNums = value;
    }

    /**
     * Gets the value of the outPassParamsNumstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassParamsNumstr() {
        return outPassParamsNumstr;
    }

    /**
     * Sets the value of the outPassParamsNumstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassParamsNumstr(String value) {
        this.outPassParamsNumstr = value;
    }

    /**
     * Gets the value of the outPassParamsSymbs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassParamsSymbs() {
        return outPassParamsSymbs;
    }

    /**
     * Sets the value of the outPassParamsSymbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassParamsSymbs(String value) {
        this.outPassParamsSymbs = value;
    }

    /**
     * Gets the value of the outPassParamsUpcaps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassParamsUpcaps() {
        return outPassParamsUpcaps;
    }

    /**
     * Sets the value of the outPassParamsUpcaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassParamsUpcaps(String value) {
        this.outPassParamsUpcaps = value;
    }

}
