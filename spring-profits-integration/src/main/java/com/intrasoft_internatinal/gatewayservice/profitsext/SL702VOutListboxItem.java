
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SL702VOutListboxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SL702VOutListboxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutListboxOutListboxBankEmployeeBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxBankEmployeeBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxBankEmployeeBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxBankEmployeeBankemployeeStaffNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxWorkIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SL702VOutListboxItem", propOrder = {
    "outListboxOutListboxBankEmployeeBankemployeeFirstName",
    "outListboxOutListboxBankEmployeeBankemployeeId",
    "outListboxOutListboxBankEmployeeBankemployeeLastName",
    "outListboxOutListboxBankEmployeeBankemployeeStaffNo",
    "outListboxOutListboxWorkIefSuppliedSelectChar"
})
public class SL702VOutListboxItem {

    @XmlElement(name = "OutListboxOutListboxBankEmployeeBankemployeeFirstName")
    protected String outListboxOutListboxBankEmployeeBankemployeeFirstName;
    @XmlElement(name = "OutListboxOutListboxBankEmployeeBankemployeeId")
    protected String outListboxOutListboxBankEmployeeBankemployeeId;
    @XmlElement(name = "OutListboxOutListboxBankEmployeeBankemployeeLastName")
    protected String outListboxOutListboxBankEmployeeBankemployeeLastName;
    @XmlElement(name = "OutListboxOutListboxBankEmployeeBankemployeeStaffNo")
    protected String outListboxOutListboxBankEmployeeBankemployeeStaffNo;
    @XmlElement(name = "OutListboxOutListboxWorkIefSuppliedSelectChar")
    protected String outListboxOutListboxWorkIefSuppliedSelectChar;

    /**
     * Gets the value of the outListboxOutListboxBankEmployeeBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxBankEmployeeBankemployeeFirstName() {
        return outListboxOutListboxBankEmployeeBankemployeeFirstName;
    }

    /**
     * Sets the value of the outListboxOutListboxBankEmployeeBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxBankEmployeeBankemployeeFirstName(String value) {
        this.outListboxOutListboxBankEmployeeBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outListboxOutListboxBankEmployeeBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxBankEmployeeBankemployeeId() {
        return outListboxOutListboxBankEmployeeBankemployeeId;
    }

    /**
     * Sets the value of the outListboxOutListboxBankEmployeeBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxBankEmployeeBankemployeeId(String value) {
        this.outListboxOutListboxBankEmployeeBankemployeeId = value;
    }

    /**
     * Gets the value of the outListboxOutListboxBankEmployeeBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxBankEmployeeBankemployeeLastName() {
        return outListboxOutListboxBankEmployeeBankemployeeLastName;
    }

    /**
     * Sets the value of the outListboxOutListboxBankEmployeeBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxBankEmployeeBankemployeeLastName(String value) {
        this.outListboxOutListboxBankEmployeeBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outListboxOutListboxBankEmployeeBankemployeeStaffNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxBankEmployeeBankemployeeStaffNo() {
        return outListboxOutListboxBankEmployeeBankemployeeStaffNo;
    }

    /**
     * Sets the value of the outListboxOutListboxBankEmployeeBankemployeeStaffNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxBankEmployeeBankemployeeStaffNo(String value) {
        this.outListboxOutListboxBankEmployeeBankemployeeStaffNo = value;
    }

    /**
     * Gets the value of the outListboxOutListboxWorkIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxWorkIefSuppliedSelectChar() {
        return outListboxOutListboxWorkIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outListboxOutListboxWorkIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxWorkIefSuppliedSelectChar(String value) {
        this.outListboxOutListboxWorkIefSuppliedSelectChar = value;
    }

}
