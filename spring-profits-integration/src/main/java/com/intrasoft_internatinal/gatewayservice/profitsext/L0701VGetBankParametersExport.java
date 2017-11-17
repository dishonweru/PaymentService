
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0701VGetBankParametersExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0701VGetBankParametersExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBankParametersAlertEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersAlertExecutable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersAlertPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersAlertPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersAlertUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersByteLength" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersCardReader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankParametersEncryptFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersLoginUnitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersMemoryBlock" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersReleaseNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersStartByte" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0701VGetBankParametersExport", propOrder = {
    "outBankParametersAlertEnabled",
    "outBankParametersAlertExecutable",
    "outBankParametersAlertPath",
    "outBankParametersAlertPort",
    "outBankParametersAlertUrl",
    "outBankParametersBankName",
    "outBankParametersByteLength",
    "outBankParametersCardReader",
    "outBankParametersCurrTrxDate",
    "outBankParametersEncryptFlg",
    "outBankParametersLoginUnitFlg",
    "outBankParametersMemoryBlock",
    "outBankParametersReleaseNote",
    "outBankParametersStartByte"
})
public class L0701VGetBankParametersExport
    extends BaseExport
{

    @XmlElement(name = "OutBankParametersAlertEnabled")
    protected String outBankParametersAlertEnabled;
    @XmlElement(name = "OutBankParametersAlertExecutable")
    protected String outBankParametersAlertExecutable;
    @XmlElement(name = "OutBankParametersAlertPath")
    protected String outBankParametersAlertPath;
    @XmlElement(name = "OutBankParametersAlertPort")
    protected String outBankParametersAlertPort;
    @XmlElement(name = "OutBankParametersAlertUrl")
    protected String outBankParametersAlertUrl;
    @XmlElement(name = "OutBankParametersBankName")
    protected String outBankParametersBankName;
    @XmlElement(name = "OutBankParametersByteLength")
    protected short outBankParametersByteLength;
    @XmlElement(name = "OutBankParametersCardReader")
    protected String outBankParametersCardReader;
    @XmlElement(name = "OutBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankParametersCurrTrxDate;
    @XmlElement(name = "OutBankParametersEncryptFlg")
    protected String outBankParametersEncryptFlg;
    @XmlElement(name = "OutBankParametersLoginUnitFlg")
    protected String outBankParametersLoginUnitFlg;
    @XmlElement(name = "OutBankParametersMemoryBlock")
    protected short outBankParametersMemoryBlock;
    @XmlElement(name = "OutBankParametersReleaseNote")
    protected String outBankParametersReleaseNote;
    @XmlElement(name = "OutBankParametersStartByte")
    protected short outBankParametersStartByte;

    /**
     * Gets the value of the outBankParametersAlertEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersAlertEnabled() {
        return outBankParametersAlertEnabled;
    }

    /**
     * Sets the value of the outBankParametersAlertEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersAlertEnabled(String value) {
        this.outBankParametersAlertEnabled = value;
    }

    /**
     * Gets the value of the outBankParametersAlertExecutable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersAlertExecutable() {
        return outBankParametersAlertExecutable;
    }

    /**
     * Sets the value of the outBankParametersAlertExecutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersAlertExecutable(String value) {
        this.outBankParametersAlertExecutable = value;
    }

    /**
     * Gets the value of the outBankParametersAlertPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersAlertPath() {
        return outBankParametersAlertPath;
    }

    /**
     * Sets the value of the outBankParametersAlertPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersAlertPath(String value) {
        this.outBankParametersAlertPath = value;
    }

    /**
     * Gets the value of the outBankParametersAlertPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersAlertPort() {
        return outBankParametersAlertPort;
    }

    /**
     * Sets the value of the outBankParametersAlertPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersAlertPort(String value) {
        this.outBankParametersAlertPort = value;
    }

    /**
     * Gets the value of the outBankParametersAlertUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersAlertUrl() {
        return outBankParametersAlertUrl;
    }

    /**
     * Sets the value of the outBankParametersAlertUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersAlertUrl(String value) {
        this.outBankParametersAlertUrl = value;
    }

    /**
     * Gets the value of the outBankParametersBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersBankName() {
        return outBankParametersBankName;
    }

    /**
     * Sets the value of the outBankParametersBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersBankName(String value) {
        this.outBankParametersBankName = value;
    }

    /**
     * Gets the value of the outBankParametersByteLength property.
     * 
     */
    public short getOutBankParametersByteLength() {
        return outBankParametersByteLength;
    }

    /**
     * Sets the value of the outBankParametersByteLength property.
     * 
     */
    public void setOutBankParametersByteLength(short value) {
        this.outBankParametersByteLength = value;
    }

    /**
     * Gets the value of the outBankParametersCardReader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersCardReader() {
        return outBankParametersCardReader;
    }

    /**
     * Sets the value of the outBankParametersCardReader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersCardReader(String value) {
        this.outBankParametersCardReader = value;
    }

    /**
     * Gets the value of the outBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankParametersCurrTrxDate() {
        return outBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the outBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.outBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the outBankParametersEncryptFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersEncryptFlg() {
        return outBankParametersEncryptFlg;
    }

    /**
     * Sets the value of the outBankParametersEncryptFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersEncryptFlg(String value) {
        this.outBankParametersEncryptFlg = value;
    }

    /**
     * Gets the value of the outBankParametersLoginUnitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersLoginUnitFlg() {
        return outBankParametersLoginUnitFlg;
    }

    /**
     * Sets the value of the outBankParametersLoginUnitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersLoginUnitFlg(String value) {
        this.outBankParametersLoginUnitFlg = value;
    }

    /**
     * Gets the value of the outBankParametersMemoryBlock property.
     * 
     */
    public short getOutBankParametersMemoryBlock() {
        return outBankParametersMemoryBlock;
    }

    /**
     * Sets the value of the outBankParametersMemoryBlock property.
     * 
     */
    public void setOutBankParametersMemoryBlock(short value) {
        this.outBankParametersMemoryBlock = value;
    }

    /**
     * Gets the value of the outBankParametersReleaseNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersReleaseNote() {
        return outBankParametersReleaseNote;
    }

    /**
     * Sets the value of the outBankParametersReleaseNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersReleaseNote(String value) {
        this.outBankParametersReleaseNote = value;
    }

    /**
     * Gets the value of the outBankParametersStartByte property.
     * 
     */
    public short getOutBankParametersStartByte() {
        return outBankParametersStartByte;
    }

    /**
     * Sets the value of the outBankParametersStartByte property.
     * 
     */
    public void setOutBankParametersStartByte(short value) {
        this.outBankParametersStartByte = value;
    }

}
