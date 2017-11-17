
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMS3601VOutCnctypGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601VOutCnctypGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutCnctypGrpOutCnctypGrmGenericGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601VOutCnctypGrpItem", propOrder = {
    "outCnctypGrpOutCnctypGrmGenericGenericDetailDescription",
    "outCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum",
    "outCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar"
})
public class CMS3601VOutCnctypGrpItem {

    @XmlElement(name = "OutCnctypGrpOutCnctypGrmGenericGenericDetailDescription")
    protected String outCnctypGrpOutCnctypGrmGenericGenericDetailDescription;
    @XmlElement(name = "OutCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum")
    protected int outCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum;
    @XmlElement(name = "OutCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar")
    protected String outCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar;

    /**
     * Gets the value of the outCnctypGrpOutCnctypGrmGenericGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCnctypGrpOutCnctypGrmGenericGenericDetailDescription() {
        return outCnctypGrpOutCnctypGrmGenericGenericDetailDescription;
    }

    /**
     * Sets the value of the outCnctypGrpOutCnctypGrmGenericGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCnctypGrpOutCnctypGrmGenericGenericDetailDescription(String value) {
        this.outCnctypGrpOutCnctypGrmGenericGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public int getOutCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum() {
        return outCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public void setOutCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum(int value) {
        this.outCnctypGrpOutCnctypGrmGenericGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar() {
        return outCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar(String value) {
        this.outCnctypGrpOutCnctypGrmSelectIefSuppliedSelectChar = value;
    }

}
