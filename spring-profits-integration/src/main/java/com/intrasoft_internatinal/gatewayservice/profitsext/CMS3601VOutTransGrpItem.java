
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3601VOutTransGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601VOutTransGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutTransGrpOutTransGrmAaIefSuppliedNum2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransGrpOutTransGrmCardTransCmsCardTransDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTransGrpOutTransGrmCardTransCmsCardTransEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTransGrpOutTransGrmCardTransCmsCardTransTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTransGrpOutTransGrmCardTransCmsCardTransTransSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTransGrpOutTransGrmSelectionIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTransGrpOutTransGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTransGrpOutTransGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601VOutTransGrpItem", propOrder = {
    "outTransGrpOutTransGrmAaIefSuppliedNum2",
    "outTransGrpOutTransGrmCardTransCmsCardTransDescription",
    "outTransGrpOutTransGrmCardTransCmsCardTransEntryStatus",
    "outTransGrpOutTransGrmCardTransCmsCardTransTmstamp",
    "outTransGrpOutTransGrmCardTransCmsCardTransTransSn",
    "outTransGrpOutTransGrmSelectionIefSuppliedSelectChar",
    "outTransGrpOutTransGrmGenericDetailSerialNum",
    "outTransGrpOutTransGrmGenericDetailDescription"
})
public class CMS3601VOutTransGrpItem {

    @XmlElement(name = "OutTransGrpOutTransGrmAaIefSuppliedNum2")
    protected short outTransGrpOutTransGrmAaIefSuppliedNum2;
    @XmlElement(name = "OutTransGrpOutTransGrmCardTransCmsCardTransDescription")
    protected String outTransGrpOutTransGrmCardTransCmsCardTransDescription;
    @XmlElement(name = "OutTransGrpOutTransGrmCardTransCmsCardTransEntryStatus")
    protected String outTransGrpOutTransGrmCardTransCmsCardTransEntryStatus;
    @XmlElement(name = "OutTransGrpOutTransGrmCardTransCmsCardTransTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTransGrpOutTransGrmCardTransCmsCardTransTmstamp;
    @XmlElement(name = "OutTransGrpOutTransGrmCardTransCmsCardTransTransSn")
    protected double outTransGrpOutTransGrmCardTransCmsCardTransTransSn;
    @XmlElement(name = "OutTransGrpOutTransGrmSelectionIefSuppliedSelectChar")
    protected String outTransGrpOutTransGrmSelectionIefSuppliedSelectChar;
    @XmlElement(name = "OutTransGrpOutTransGrmGenericDetailSerialNum")
    protected int outTransGrpOutTransGrmGenericDetailSerialNum;
    @XmlElement(name = "OutTransGrpOutTransGrmGenericDetailDescription")
    protected String outTransGrpOutTransGrmGenericDetailDescription;

    /**
     * Gets the value of the outTransGrpOutTransGrmAaIefSuppliedNum2 property.
     * 
     */
    public short getOutTransGrpOutTransGrmAaIefSuppliedNum2() {
        return outTransGrpOutTransGrmAaIefSuppliedNum2;
    }

    /**
     * Sets the value of the outTransGrpOutTransGrmAaIefSuppliedNum2 property.
     * 
     */
    public void setOutTransGrpOutTransGrmAaIefSuppliedNum2(short value) {
        this.outTransGrpOutTransGrmAaIefSuppliedNum2 = value;
    }

    /**
     * Gets the value of the outTransGrpOutTransGrmCardTransCmsCardTransDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTransGrpOutTransGrmCardTransCmsCardTransDescription() {
        return outTransGrpOutTransGrmCardTransCmsCardTransDescription;
    }

    /**
     * Sets the value of the outTransGrpOutTransGrmCardTransCmsCardTransDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTransGrpOutTransGrmCardTransCmsCardTransDescription(String value) {
        this.outTransGrpOutTransGrmCardTransCmsCardTransDescription = value;
    }

    /**
     * Gets the value of the outTransGrpOutTransGrmCardTransCmsCardTransEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTransGrpOutTransGrmCardTransCmsCardTransEntryStatus() {
        return outTransGrpOutTransGrmCardTransCmsCardTransEntryStatus;
    }

    /**
     * Sets the value of the outTransGrpOutTransGrmCardTransCmsCardTransEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTransGrpOutTransGrmCardTransCmsCardTransEntryStatus(String value) {
        this.outTransGrpOutTransGrmCardTransCmsCardTransEntryStatus = value;
    }

    /**
     * Gets the value of the outTransGrpOutTransGrmCardTransCmsCardTransTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTransGrpOutTransGrmCardTransCmsCardTransTmstamp() {
        return outTransGrpOutTransGrmCardTransCmsCardTransTmstamp;
    }

    /**
     * Sets the value of the outTransGrpOutTransGrmCardTransCmsCardTransTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTransGrpOutTransGrmCardTransCmsCardTransTmstamp(XMLGregorianCalendar value) {
        this.outTransGrpOutTransGrmCardTransCmsCardTransTmstamp = value;
    }

    /**
     * Gets the value of the outTransGrpOutTransGrmCardTransCmsCardTransTransSn property.
     * 
     */
    public double getOutTransGrpOutTransGrmCardTransCmsCardTransTransSn() {
        return outTransGrpOutTransGrmCardTransCmsCardTransTransSn;
    }

    /**
     * Sets the value of the outTransGrpOutTransGrmCardTransCmsCardTransTransSn property.
     * 
     */
    public void setOutTransGrpOutTransGrmCardTransCmsCardTransTransSn(double value) {
        this.outTransGrpOutTransGrmCardTransCmsCardTransTransSn = value;
    }

    /**
     * Gets the value of the outTransGrpOutTransGrmSelectionIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTransGrpOutTransGrmSelectionIefSuppliedSelectChar() {
        return outTransGrpOutTransGrmSelectionIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outTransGrpOutTransGrmSelectionIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTransGrpOutTransGrmSelectionIefSuppliedSelectChar(String value) {
        this.outTransGrpOutTransGrmSelectionIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outTransGrpOutTransGrmGenericDetailSerialNum property.
     * 
     */
    public int getOutTransGrpOutTransGrmGenericDetailSerialNum() {
        return outTransGrpOutTransGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTransGrpOutTransGrmGenericDetailSerialNum property.
     * 
     */
    public void setOutTransGrpOutTransGrmGenericDetailSerialNum(int value) {
        this.outTransGrpOutTransGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outTransGrpOutTransGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTransGrpOutTransGrmGenericDetailDescription() {
        return outTransGrpOutTransGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the outTransGrpOutTransGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTransGrpOutTransGrmGenericDetailDescription(String value) {
        this.outTransGrpOutTransGrmGenericDetailDescription = value;
    }

}
