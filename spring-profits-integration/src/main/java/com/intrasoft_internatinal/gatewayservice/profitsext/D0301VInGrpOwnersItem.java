
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for D0301VInGrpOwnersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0301VInGrpOwnersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpOwnersInGrmCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpOwnersInGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpOwnersInGrmDepAccountOwnersAccOwnerSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpOwnersInGrmWorkIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpOwnersInGrmWorkIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0301VInGrpOwnersItem", propOrder = {
    "inGrpOwnersInGrmCustNameListSetDescription",
    "inGrpOwnersInGrmCustomerCustId",
    "inGrpOwnersInGrmDepAccountOwnersAccOwnerSn",
    "inGrpOwnersInGrmWorkIefSuppliedFlag",
    "inGrpOwnersInGrmWorkIefSuppliedSelectChar"
})
public class D0301VInGrpOwnersItem {

    @XmlElement(name = "InGrpOwnersInGrmCustNameListSetDescription")
    protected String inGrpOwnersInGrmCustNameListSetDescription;
    @XmlElement(name = "InGrpOwnersInGrmCustomerCustId")
    protected int inGrpOwnersInGrmCustomerCustId;
    @XmlElement(name = "InGrpOwnersInGrmDepAccountOwnersAccOwnerSn")
    protected short inGrpOwnersInGrmDepAccountOwnersAccOwnerSn;
    @XmlElement(name = "InGrpOwnersInGrmWorkIefSuppliedFlag")
    protected String inGrpOwnersInGrmWorkIefSuppliedFlag;
    @XmlElement(name = "InGrpOwnersInGrmWorkIefSuppliedSelectChar")
    protected String inGrpOwnersInGrmWorkIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpOwnersInGrmCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpOwnersInGrmCustNameListSetDescription() {
        return inGrpOwnersInGrmCustNameListSetDescription;
    }

    /**
     * Sets the value of the inGrpOwnersInGrmCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpOwnersInGrmCustNameListSetDescription(String value) {
        this.inGrpOwnersInGrmCustNameListSetDescription = value;
    }

    /**
     * Gets the value of the inGrpOwnersInGrmCustomerCustId property.
     * 
     */
    public int getInGrpOwnersInGrmCustomerCustId() {
        return inGrpOwnersInGrmCustomerCustId;
    }

    /**
     * Sets the value of the inGrpOwnersInGrmCustomerCustId property.
     * 
     */
    public void setInGrpOwnersInGrmCustomerCustId(int value) {
        this.inGrpOwnersInGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the inGrpOwnersInGrmDepAccountOwnersAccOwnerSn property.
     * 
     */
    public short getInGrpOwnersInGrmDepAccountOwnersAccOwnerSn() {
        return inGrpOwnersInGrmDepAccountOwnersAccOwnerSn;
    }

    /**
     * Sets the value of the inGrpOwnersInGrmDepAccountOwnersAccOwnerSn property.
     * 
     */
    public void setInGrpOwnersInGrmDepAccountOwnersAccOwnerSn(short value) {
        this.inGrpOwnersInGrmDepAccountOwnersAccOwnerSn = value;
    }

    /**
     * Gets the value of the inGrpOwnersInGrmWorkIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpOwnersInGrmWorkIefSuppliedFlag() {
        return inGrpOwnersInGrmWorkIefSuppliedFlag;
    }

    /**
     * Sets the value of the inGrpOwnersInGrmWorkIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpOwnersInGrmWorkIefSuppliedFlag(String value) {
        this.inGrpOwnersInGrmWorkIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpOwnersInGrmWorkIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpOwnersInGrmWorkIefSuppliedSelectChar() {
        return inGrpOwnersInGrmWorkIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpOwnersInGrmWorkIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpOwnersInGrmWorkIefSuppliedSelectChar(String value) {
        this.inGrpOwnersInGrmWorkIefSuppliedSelectChar = value;
    }

}
