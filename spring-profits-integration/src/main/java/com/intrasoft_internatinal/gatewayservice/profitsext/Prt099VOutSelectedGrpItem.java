
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prt099VOutSelectedGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prt099VOutSelectedGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutSelectedGrpOutGrmCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedGrpOutGrmProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedGrpOutGrmProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedGrpOutGrmProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedGrpOutGrmProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedGrpOutGrmProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedGrpOutGrmProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedGrpOutGrmProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedGrpOutGrmProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedGrpOutGrmUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prt099VOutSelectedGrpItem", propOrder = {
    "outSelectedGrpOutGrmCurrencyShortDescr",
    "outSelectedGrpOutGrmProductDescription",
    "outSelectedGrpOutGrmProfitsAccountAccStatus",
    "outSelectedGrpOutGrmProfitsAccountAccountCd",
    "outSelectedGrpOutGrmProfitsAccountAccountNumber",
    "outSelectedGrpOutGrmProfitsAccountMonotoringUnit",
    "outSelectedGrpOutGrmProfitsAccountMovementCurrency",
    "outSelectedGrpOutGrmProfitsAccountPrftSystem",
    "outSelectedGrpOutGrmProfitsAccountProductId",
    "outSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch",
    "outSelectedGrpOutGrmUnitUnitName"
})
public class Prt099VOutSelectedGrpItem {

    @XmlElement(name = "OutSelectedGrpOutGrmCurrencyShortDescr")
    protected String outSelectedGrpOutGrmCurrencyShortDescr;
    @XmlElement(name = "OutSelectedGrpOutGrmProductDescription")
    protected String outSelectedGrpOutGrmProductDescription;
    @XmlElement(name = "OutSelectedGrpOutGrmProfitsAccountAccStatus")
    protected String outSelectedGrpOutGrmProfitsAccountAccStatus;
    @XmlElement(name = "OutSelectedGrpOutGrmProfitsAccountAccountCd")
    protected short outSelectedGrpOutGrmProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedGrpOutGrmProfitsAccountAccountNumber")
    protected String outSelectedGrpOutGrmProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedGrpOutGrmProfitsAccountMonotoringUnit")
    protected int outSelectedGrpOutGrmProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutSelectedGrpOutGrmProfitsAccountMovementCurrency")
    protected int outSelectedGrpOutGrmProfitsAccountMovementCurrency;
    @XmlElement(name = "OutSelectedGrpOutGrmProfitsAccountPrftSystem")
    protected short outSelectedGrpOutGrmProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedGrpOutGrmProfitsAccountProductId")
    protected int outSelectedGrpOutGrmProfitsAccountProductId;
    @XmlElement(name = "OutSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch")
    protected String outSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch;
    @XmlElement(name = "OutSelectedGrpOutGrmUnitUnitName")
    protected String outSelectedGrpOutGrmUnitUnitName;

    /**
     * Gets the value of the outSelectedGrpOutGrmCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedGrpOutGrmCurrencyShortDescr() {
        return outSelectedGrpOutGrmCurrencyShortDescr;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedGrpOutGrmCurrencyShortDescr(String value) {
        this.outSelectedGrpOutGrmCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedGrpOutGrmProductDescription() {
        return outSelectedGrpOutGrmProductDescription;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedGrpOutGrmProductDescription(String value) {
        this.outSelectedGrpOutGrmProductDescription = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedGrpOutGrmProfitsAccountAccStatus() {
        return outSelectedGrpOutGrmProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedGrpOutGrmProfitsAccountAccStatus(String value) {
        this.outSelectedGrpOutGrmProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedGrpOutGrmProfitsAccountAccountCd() {
        return outSelectedGrpOutGrmProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedGrpOutGrmProfitsAccountAccountCd(short value) {
        this.outSelectedGrpOutGrmProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedGrpOutGrmProfitsAccountAccountNumber() {
        return outSelectedGrpOutGrmProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedGrpOutGrmProfitsAccountAccountNumber(String value) {
        this.outSelectedGrpOutGrmProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutSelectedGrpOutGrmProfitsAccountMonotoringUnit() {
        return outSelectedGrpOutGrmProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutSelectedGrpOutGrmProfitsAccountMonotoringUnit(int value) {
        this.outSelectedGrpOutGrmProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutSelectedGrpOutGrmProfitsAccountMovementCurrency() {
        return outSelectedGrpOutGrmProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutSelectedGrpOutGrmProfitsAccountMovementCurrency(int value) {
        this.outSelectedGrpOutGrmProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedGrpOutGrmProfitsAccountPrftSystem() {
        return outSelectedGrpOutGrmProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedGrpOutGrmProfitsAccountPrftSystem(short value) {
        this.outSelectedGrpOutGrmProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmProfitsAccountProductId property.
     * 
     */
    public int getOutSelectedGrpOutGrmProfitsAccountProductId() {
        return outSelectedGrpOutGrmProfitsAccountProductId;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmProfitsAccountProductId property.
     * 
     */
    public void setOutSelectedGrpOutGrmProfitsAccountProductId(int value) {
        this.outSelectedGrpOutGrmProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch() {
        return outSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch(String value) {
        this.outSelectedGrpOutGrmRelationshipSearchAccountCustomerSearch = value;
    }

    /**
     * Gets the value of the outSelectedGrpOutGrmUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedGrpOutGrmUnitUnitName() {
        return outSelectedGrpOutGrmUnitUnitName;
    }

    /**
     * Sets the value of the outSelectedGrpOutGrmUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedGrpOutGrmUnitUnitName(String value) {
        this.outSelectedGrpOutGrmUnitUnitName = value;
    }

}
