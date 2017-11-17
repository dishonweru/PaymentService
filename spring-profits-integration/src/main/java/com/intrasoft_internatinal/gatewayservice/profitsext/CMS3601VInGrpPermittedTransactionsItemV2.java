
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMS3601VInGrpPermittedTransactionsItem_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601VInGrpPermittedTransactionsItem_V2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601VInGrpPermittedTransactionsItem_V2", propOrder = {
    "inGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar",
    "inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription",
    "inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType",
    "inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum"
})
public class CMS3601VInGrpPermittedTransactionsItemV2 {

    @XmlElement(name = "InGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar")
    protected String inGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar;
    @XmlElement(name = "InGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription")
    protected String inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription;
    @XmlElement(name = "InGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType")
    protected String inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType;
    @XmlElement(name = "InGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum")
    protected int inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum;

    /**
     * Gets the value of the inGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar() {
        return inGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar(String value) {
        this.inGrpPermittedTransactionsInGrmPermSelectionIndIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription() {
        return inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription(String value) {
        this.inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType() {
        return inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType;
    }

    /**
     * Sets the value of the inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType(String value) {
        this.inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum property.
     * 
     */
    public int getInGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum() {
        return inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum property.
     * 
     */
    public void setInGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum(int value) {
        this.inGrpPermittedTransactionsInGrmPermServiceCodesGenericDetailSerialNum = value;
    }

}
