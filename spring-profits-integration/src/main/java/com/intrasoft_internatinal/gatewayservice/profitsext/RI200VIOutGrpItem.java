
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RI200VIOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RI200VIOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmDepositDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmLoanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmProductProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RI200VIOutGrpItem", propOrder = {
    "outGrpOutGrmDepositDepositType",
    "outGrpOutGrmLoanLoanType",
    "outGrpOutGrmProductDescription",
    "outGrpOutGrmProductIdProduct",
    "outGrpOutGrmProductProductType"
})
public class RI200VIOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmDepositDepositType")
    protected String outGrpOutGrmDepositDepositType;
    @XmlElement(name = "OutGrpOutGrmLoanLoanType")
    protected String outGrpOutGrmLoanLoanType;
    @XmlElement(name = "OutGrpOutGrmProductDescription")
    protected String outGrpOutGrmProductDescription;
    @XmlElement(name = "OutGrpOutGrmProductIdProduct")
    protected int outGrpOutGrmProductIdProduct;
    @XmlElement(name = "OutGrpOutGrmProductProductType")
    protected String outGrpOutGrmProductProductType;

    /**
     * Gets the value of the outGrpOutGrmDepositDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmDepositDepositType() {
        return outGrpOutGrmDepositDepositType;
    }

    /**
     * Sets the value of the outGrpOutGrmDepositDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmDepositDepositType(String value) {
        this.outGrpOutGrmDepositDepositType = value;
    }

    /**
     * Gets the value of the outGrpOutGrmLoanLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmLoanLoanType() {
        return outGrpOutGrmLoanLoanType;
    }

    /**
     * Sets the value of the outGrpOutGrmLoanLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmLoanLoanType(String value) {
        this.outGrpOutGrmLoanLoanType = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmProductDescription() {
        return outGrpOutGrmProductDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmProductDescription(String value) {
        this.outGrpOutGrmProductDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProductIdProduct property.
     * 
     */
    public int getOutGrpOutGrmProductIdProduct() {
        return outGrpOutGrmProductIdProduct;
    }

    /**
     * Sets the value of the outGrpOutGrmProductIdProduct property.
     * 
     */
    public void setOutGrpOutGrmProductIdProduct(int value) {
        this.outGrpOutGrmProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProductProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmProductProductType() {
        return outGrpOutGrmProductProductType;
    }

    /**
     * Sets the value of the outGrpOutGrmProductProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmProductProductType(String value) {
        this.outGrpOutGrmProductProductType = value;
    }

}
