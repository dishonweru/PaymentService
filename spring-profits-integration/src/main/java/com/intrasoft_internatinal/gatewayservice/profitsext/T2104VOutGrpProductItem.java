
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T2104VOutGrpProductItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2104VOutGrpProductItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpProductGrpProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpProductGrpProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpProductOutGrpPrdIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2104VOutGrpProductItem", propOrder = {
    "outGrpProductGrpProductDescription",
    "outGrpProductGrpProductIdProduct",
    "outGrpProductOutGrpPrdIefSuppliedSelectChar"
})
public class T2104VOutGrpProductItem {

    @XmlElement(name = "OutGrpProductGrpProductDescription")
    protected String outGrpProductGrpProductDescription;
    @XmlElement(name = "OutGrpProductGrpProductIdProduct")
    protected int outGrpProductGrpProductIdProduct;
    @XmlElement(name = "OutGrpProductOutGrpPrdIefSuppliedSelectChar")
    protected String outGrpProductOutGrpPrdIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpProductGrpProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpProductGrpProductDescription() {
        return outGrpProductGrpProductDescription;
    }

    /**
     * Sets the value of the outGrpProductGrpProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpProductGrpProductDescription(String value) {
        this.outGrpProductGrpProductDescription = value;
    }

    /**
     * Gets the value of the outGrpProductGrpProductIdProduct property.
     * 
     */
    public int getOutGrpProductGrpProductIdProduct() {
        return outGrpProductGrpProductIdProduct;
    }

    /**
     * Sets the value of the outGrpProductGrpProductIdProduct property.
     * 
     */
    public void setOutGrpProductGrpProductIdProduct(int value) {
        this.outGrpProductGrpProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpProductOutGrpPrdIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpProductOutGrpPrdIefSuppliedSelectChar() {
        return outGrpProductOutGrpPrdIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpProductOutGrpPrdIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpProductOutGrpPrdIefSuppliedSelectChar(String value) {
        this.outGrpProductOutGrpPrdIefSuppliedSelectChar = value;
    }

}
