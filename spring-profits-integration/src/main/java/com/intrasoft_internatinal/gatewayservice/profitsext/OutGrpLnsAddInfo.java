
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpLnsAddInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpLnsAddInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpLnsAddInfo", propOrder = {
    "outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral",
    "outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue",
    "outGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag"
})
public class OutGrpLnsAddInfo {

    @XmlElement(name = "OutGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral")
    protected String outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral;
    @XmlElement(name = "OutGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue")
    protected String outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue;
    @XmlElement(name = "OutGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag")
    protected String outGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag;

    /**
     * Gets the value of the outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral() {
        return outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral;
    }

    /**
     * Sets the value of the outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral(String value) {
        this.outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoLiteral = value;
    }

    /**
     * Gets the value of the outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue() {
        return outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue;
    }

    /**
     * Sets the value of the outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue(String value) {
        this.outGrpLnsAddInfoOutGrmLnsAddInfoLnsAddInfoValue = value;
    }

    /**
     * Gets the value of the outGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag() {
        return outGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag(String value) {
        this.outGrpLnsAddInfoOutGrmSelectionIefSuppliedFlag = value;
    }

}
