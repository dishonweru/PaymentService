
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prt099VCustomerAccountsListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prt099VCustomerAccountsListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCriteriaCustomerTypeCustomerSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProductProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedSystemProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prt099VCustomerAccountsListImport", propOrder = {
    "inCriteriaCustomerTypeCustomerSearch",
    "inCustomerCustomerCustId",
    "inSelectedProductProductIdProduct",
    "inSelectedSystemProfitsAccountPrftSystem"
})
public class Prt099VCustomerAccountsListImport
    extends BaseImport
{

    @XmlElement(name = "InCriteriaCustomerTypeCustomerSearch")
    protected String inCriteriaCustomerTypeCustomerSearch;
    @XmlElement(name = "InCustomerCustomerCustId")
    protected int inCustomerCustomerCustId;
    @XmlElement(name = "InSelectedProductProductIdProduct")
    protected int inSelectedProductProductIdProduct;
    @XmlElement(name = "InSelectedSystemProfitsAccountPrftSystem")
    protected short inSelectedSystemProfitsAccountPrftSystem;

    /**
     * Gets the value of the inCriteriaCustomerTypeCustomerSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaCustomerTypeCustomerSearch() {
        return inCriteriaCustomerTypeCustomerSearch;
    }

    /**
     * Sets the value of the inCriteriaCustomerTypeCustomerSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaCustomerTypeCustomerSearch(String value) {
        this.inCriteriaCustomerTypeCustomerSearch = value;
    }

    /**
     * Gets the value of the inCustomerCustomerCustId property.
     * 
     */
    public int getInCustomerCustomerCustId() {
        return inCustomerCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustomerCustId property.
     * 
     */
    public void setInCustomerCustomerCustId(int value) {
        this.inCustomerCustomerCustId = value;
    }

    /**
     * Gets the value of the inSelectedProductProductIdProduct property.
     * 
     */
    public int getInSelectedProductProductIdProduct() {
        return inSelectedProductProductIdProduct;
    }

    /**
     * Sets the value of the inSelectedProductProductIdProduct property.
     * 
     */
    public void setInSelectedProductProductIdProduct(int value) {
        this.inSelectedProductProductIdProduct = value;
    }

    /**
     * Gets the value of the inSelectedSystemProfitsAccountPrftSystem property.
     * 
     */
    public short getInSelectedSystemProfitsAccountPrftSystem() {
        return inSelectedSystemProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSelectedSystemProfitsAccountPrftSystem property.
     * 
     */
    public void setInSelectedSystemProfitsAccountPrftSystem(short value) {
        this.inSelectedSystemProfitsAccountPrftSystem = value;
    }

}
