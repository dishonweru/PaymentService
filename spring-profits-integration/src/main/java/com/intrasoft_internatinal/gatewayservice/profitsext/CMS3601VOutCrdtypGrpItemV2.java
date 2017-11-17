
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMS3601VOutCrdtypGrpItem_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601VOutCrdtypGrpItem_V2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601VOutCrdtypGrpItem_V2", propOrder = {
    "outCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription",
    "outCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum",
    "outCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar"
})
public class CMS3601VOutCrdtypGrpItemV2 {

    @XmlElement(name = "OutCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription")
    protected String outCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription;
    @XmlElement(name = "OutCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum")
    protected int outCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum;
    @XmlElement(name = "OutCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar")
    protected String outCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar;

    /**
     * Gets the value of the outCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription() {
        return outCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription;
    }

    /**
     * Sets the value of the outCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription(String value) {
        this.outCrdtypGrpOutCrdtypGrmGenericGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public int getOutCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum() {
        return outCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public void setOutCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum(int value) {
        this.outCrdtypGrpOutCrdtypGrmGenericGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar() {
        return outCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar(String value) {
        this.outCrdtypGrpOutCrdtypGrmSelectIefSuppliedSelectChar = value;
    }

}
