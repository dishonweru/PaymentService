
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMS3604VInCrdtypGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3604VInCrdtypGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InCrdtypGrpInCrdtypGrmGenericGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3604VInCrdtypGrpItem", propOrder = {
    "inCrdtypGrpInCrdtypGrmGenericGenericDetailDescription",
    "inCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum",
    "inCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar"
})
public class CMS3604VInCrdtypGrpItem {

    @XmlElement(name = "InCrdtypGrpInCrdtypGrmGenericGenericDetailDescription")
    protected String inCrdtypGrpInCrdtypGrmGenericGenericDetailDescription;
    @XmlElement(name = "InCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum")
    protected int inCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum;
    @XmlElement(name = "InCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar")
    protected String inCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar;

    /**
     * Gets the value of the inCrdtypGrpInCrdtypGrmGenericGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCrdtypGrpInCrdtypGrmGenericGenericDetailDescription() {
        return inCrdtypGrpInCrdtypGrmGenericGenericDetailDescription;
    }

    /**
     * Sets the value of the inCrdtypGrpInCrdtypGrmGenericGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCrdtypGrpInCrdtypGrmGenericGenericDetailDescription(String value) {
        this.inCrdtypGrpInCrdtypGrmGenericGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public int getInCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum() {
        return inCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public void setInCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum(int value) {
        this.inCrdtypGrpInCrdtypGrmGenericGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar() {
        return inCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar(String value) {
        this.inCrdtypGrpInCrdtypGrmSelectIefSuppliedSelectChar = value;
    }

}
