
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpCustomerShareholders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpCustomerShareholders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpCustomerShareholders", propOrder = {
    "outGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum",
    "outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber",
    "outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType",
    "outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName",
    "outGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc",
    "outGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar"
})
public class OutGrpCustomerShareholders {

    @XmlElement(name = "OutGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum")
    protected short outGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum;
    @XmlElement(name = "OutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber")
    protected String outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber;
    @XmlElement(name = "OutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType")
    protected String outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType;
    @XmlElement(name = "OutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName")
    protected String outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName;
    @XmlElement(name = "OutGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc", required = true)
    protected BigDecimal outGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc;
    @XmlElement(name = "OutGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar")
    protected String outGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum property.
     * 
     */
    public short getOutGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum() {
        return outGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum;
    }

    /**
     * Sets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum property.
     * 
     */
    public void setOutGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum(short value) {
        this.outGrpCustomerShareholdersOutGrmCustomerShareholdersSerialNum = value;
    }

    /**
     * Gets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber() {
        return outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber;
    }

    /**
     * Sets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber(String value) {
        this.outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdNumber = value;
    }

    /**
     * Gets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType() {
        return outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType;
    }

    /**
     * Sets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType(String value) {
        this.outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderIdType = value;
    }

    /**
     * Gets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName() {
        return outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName;
    }

    /**
     * Sets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName(String value) {
        this.outGrpCustomerShareholdersOutGrmCustomerShareholdersShareholderName = value;
    }

    /**
     * Gets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc() {
        return outGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc;
    }

    /**
     * Sets the value of the outGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc(BigDecimal value) {
        this.outGrpCustomerShareholdersOutGrmCustomerShareholdersSharesPerc = value;
    }

    /**
     * Gets the value of the outGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar() {
        return outGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar(String value) {
        this.outGrpCustomerShareholdersOutSelectionIefSuppliedSelectChar = value;
    }

}
