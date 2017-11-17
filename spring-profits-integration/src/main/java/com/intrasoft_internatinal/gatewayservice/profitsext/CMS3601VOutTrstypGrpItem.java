
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMS3601VOutTrstypGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601VOutTrstypGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutTrstypGrpOutTrstypGrmGenericGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601VOutTrstypGrpItem", propOrder = {
    "outTrstypGrpOutTrstypGrmGenericGenericDetailDescription",
    "outTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum",
    "outTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar"
})
public class CMS3601VOutTrstypGrpItem {

    @XmlElement(name = "OutTrstypGrpOutTrstypGrmGenericGenericDetailDescription")
    protected String outTrstypGrpOutTrstypGrmGenericGenericDetailDescription;
    @XmlElement(name = "OutTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum")
    protected int outTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum;
    @XmlElement(name = "OutTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar")
    protected String outTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar;

    /**
     * Gets the value of the outTrstypGrpOutTrstypGrmGenericGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrstypGrpOutTrstypGrmGenericGenericDetailDescription() {
        return outTrstypGrpOutTrstypGrmGenericGenericDetailDescription;
    }

    /**
     * Sets the value of the outTrstypGrpOutTrstypGrmGenericGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrstypGrpOutTrstypGrmGenericGenericDetailDescription(String value) {
        this.outTrstypGrpOutTrstypGrmGenericGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public int getOutTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum() {
        return outTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public void setOutTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum(int value) {
        this.outTrstypGrpOutTrstypGrmGenericGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar() {
        return outTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar(String value) {
        this.outTrstypGrpOutTrstypGrmSelectIefSuppliedSelectChar = value;
    }

}
