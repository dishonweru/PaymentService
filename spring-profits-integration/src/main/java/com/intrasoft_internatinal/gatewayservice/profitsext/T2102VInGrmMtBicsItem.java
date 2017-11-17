
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T2102VInGrmMtBicsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2102VInGrmMtBicsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrmMtBicsInGrmSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2102VInGrmMtBicsItem", propOrder = {
    "inGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag",
    "inGrmMtBicsInGrmSwiftAllnceBicsBic"
})
public class T2102VInGrmMtBicsItem {

    @XmlElement(name = "InGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag")
    protected String inGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag;
    @XmlElement(name = "InGrmMtBicsInGrmSwiftAllnceBicsBic")
    protected String inGrmMtBicsInGrmSwiftAllnceBicsBic;

    /**
     * Gets the value of the inGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag() {
        return inGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag;
    }

    /**
     * Sets the value of the inGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag(String value) {
        this.inGrmMtBicsInGrmRequireEncrConnIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrmMtBicsInGrmSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrmMtBicsInGrmSwiftAllnceBicsBic() {
        return inGrmMtBicsInGrmSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inGrmMtBicsInGrmSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrmMtBicsInGrmSwiftAllnceBicsBic(String value) {
        this.inGrmMtBicsInGrmSwiftAllnceBicsBic = value;
    }

}
