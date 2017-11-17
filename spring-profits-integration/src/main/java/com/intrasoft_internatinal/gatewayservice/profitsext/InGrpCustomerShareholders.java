
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InGrpCustomerShareholders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpCustomerShareholders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpCustomerShareholdersInSelectionIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpCustomerShareholders", propOrder = {
    "inGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum",
    "inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber",
    "inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType",
    "inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName",
    "inGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc",
    "inGrpCustomerShareholdersInSelectionIefSuppliedSelectChar"
})
public class InGrpCustomerShareholders {

    @XmlElement(name = "InGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum")
    protected short inGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum;
    @XmlElement(name = "InGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber")
    protected String inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber;
    @XmlElement(name = "InGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType")
    protected String inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType;
    @XmlElement(name = "InGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName")
    protected String inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName;
    @XmlElement(name = "InGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc", required = true)
    protected BigDecimal inGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc;
    @XmlElement(name = "InGrpCustomerShareholdersInSelectionIefSuppliedSelectChar")
    protected String inGrpCustomerShareholdersInSelectionIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum property.
     * 
     */
    public short getInGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum() {
        return inGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum;
    }

    /**
     * Sets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum property.
     * 
     */
    public void setInGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum(short value) {
        this.inGrpCustomerShareholdersInGrmCustomerShareholdersSerialNum = value;
    }

    /**
     * Gets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber() {
        return inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber;
    }

    /**
     * Sets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber(String value) {
        this.inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdNumber = value;
    }

    /**
     * Gets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType() {
        return inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType;
    }

    /**
     * Sets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType(String value) {
        this.inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderIdType = value;
    }

    /**
     * Gets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName() {
        return inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName;
    }

    /**
     * Sets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName(String value) {
        this.inGrpCustomerShareholdersInGrmCustomerShareholdersShareholderName = value;
    }

    /**
     * Gets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc() {
        return inGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc;
    }

    /**
     * Sets the value of the inGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc(BigDecimal value) {
        this.inGrpCustomerShareholdersInGrmCustomerShareholdersSharesPerc = value;
    }

    /**
     * Gets the value of the inGrpCustomerShareholdersInSelectionIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustomerShareholdersInSelectionIefSuppliedSelectChar() {
        return inGrpCustomerShareholdersInSelectionIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpCustomerShareholdersInSelectionIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustomerShareholdersInSelectionIefSuppliedSelectChar(String value) {
        this.inGrpCustomerShareholdersInSelectionIefSuppliedSelectChar = value;
    }

}
