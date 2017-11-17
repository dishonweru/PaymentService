
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMS3601VOutDeltypGrpItem_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601VOutDeltypGrpItem_V2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutDeltypGrpOutDeltypGrmGenericGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601VOutDeltypGrpItem_V2", propOrder = {
    "outDeltypGrpOutDeltypGrmGenericGenericDetailDescription",
    "outDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum",
    "outDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar"
})
public class CMS3601VOutDeltypGrpItemV2 {

    @XmlElement(name = "OutDeltypGrpOutDeltypGrmGenericGenericDetailDescription")
    protected String outDeltypGrpOutDeltypGrmGenericGenericDetailDescription;
    @XmlElement(name = "OutDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum")
    protected int outDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum;
    @XmlElement(name = "OutDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar")
    protected String outDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar;

    /**
     * Gets the value of the outDeltypGrpOutDeltypGrmGenericGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDeltypGrpOutDeltypGrmGenericGenericDetailDescription() {
        return outDeltypGrpOutDeltypGrmGenericGenericDetailDescription;
    }

    /**
     * Sets the value of the outDeltypGrpOutDeltypGrmGenericGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDeltypGrpOutDeltypGrmGenericGenericDetailDescription(String value) {
        this.outDeltypGrpOutDeltypGrmGenericGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public int getOutDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum() {
        return outDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum property.
     * 
     */
    public void setOutDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum(int value) {
        this.outDeltypGrpOutDeltypGrmGenericGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar() {
        return outDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar(String value) {
        this.outDeltypGrpOutDeltypGrmSelectIefSuppliedSelectChar = value;
    }

}
