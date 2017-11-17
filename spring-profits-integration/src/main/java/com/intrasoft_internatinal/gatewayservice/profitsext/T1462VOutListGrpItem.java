
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T1462VOutListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1462VOutListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutListGrpOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiarySurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryProfession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmLgBeneficiaryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1462VOutListGrpItem", propOrder = {
    "outListGrpOutGrmIefSuppliedSelectChar",
    "outListGrpOutGrmLgBeneficiaryCode",
    "outListGrpOutGrmLgBeneficiaryName",
    "outListGrpOutGrmLgBeneficiarySurname",
    "outListGrpOutGrmLgBeneficiaryAddress",
    "outListGrpOutGrmLgBeneficiaryIdNo",
    "outListGrpOutGrmLgBeneficiaryAfmNo",
    "outListGrpOutGrmLgBeneficiaryAddress2",
    "outListGrpOutGrmLgBeneficiaryRegion",
    "outListGrpOutGrmLgBeneficiaryZipCode",
    "outListGrpOutGrmLgBeneficiaryCity",
    "outListGrpOutGrmLgBeneficiaryTelephone",
    "outListGrpOutGrmLgBeneficiaryProfession",
    "outListGrpOutGrmLgBeneficiaryComments"
})
public class T1462VOutListGrpItem {

    @XmlElement(name = "OutListGrpOutGrmIefSuppliedSelectChar")
    protected String outListGrpOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryCode")
    protected int outListGrpOutGrmLgBeneficiaryCode;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryName")
    protected String outListGrpOutGrmLgBeneficiaryName;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiarySurname")
    protected String outListGrpOutGrmLgBeneficiarySurname;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryAddress")
    protected String outListGrpOutGrmLgBeneficiaryAddress;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryIdNo")
    protected String outListGrpOutGrmLgBeneficiaryIdNo;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryAfmNo")
    protected String outListGrpOutGrmLgBeneficiaryAfmNo;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryAddress2")
    protected String outListGrpOutGrmLgBeneficiaryAddress2;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryRegion")
    protected String outListGrpOutGrmLgBeneficiaryRegion;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryZipCode")
    protected String outListGrpOutGrmLgBeneficiaryZipCode;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryCity")
    protected String outListGrpOutGrmLgBeneficiaryCity;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryTelephone")
    protected String outListGrpOutGrmLgBeneficiaryTelephone;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryProfession")
    protected String outListGrpOutGrmLgBeneficiaryProfession;
    @XmlElement(name = "OutListGrpOutGrmLgBeneficiaryComments")
    protected String outListGrpOutGrmLgBeneficiaryComments;

    /**
     * Gets the value of the outListGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmIefSuppliedSelectChar() {
        return outListGrpOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outListGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmIefSuppliedSelectChar(String value) {
        this.outListGrpOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryCode property.
     * 
     */
    public int getOutListGrpOutGrmLgBeneficiaryCode() {
        return outListGrpOutGrmLgBeneficiaryCode;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryCode property.
     * 
     */
    public void setOutListGrpOutGrmLgBeneficiaryCode(int value) {
        this.outListGrpOutGrmLgBeneficiaryCode = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryName() {
        return outListGrpOutGrmLgBeneficiaryName;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryName(String value) {
        this.outListGrpOutGrmLgBeneficiaryName = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiarySurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiarySurname() {
        return outListGrpOutGrmLgBeneficiarySurname;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiarySurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiarySurname(String value) {
        this.outListGrpOutGrmLgBeneficiarySurname = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryAddress() {
        return outListGrpOutGrmLgBeneficiaryAddress;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryAddress(String value) {
        this.outListGrpOutGrmLgBeneficiaryAddress = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryIdNo() {
        return outListGrpOutGrmLgBeneficiaryIdNo;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryIdNo(String value) {
        this.outListGrpOutGrmLgBeneficiaryIdNo = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryAfmNo() {
        return outListGrpOutGrmLgBeneficiaryAfmNo;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryAfmNo(String value) {
        this.outListGrpOutGrmLgBeneficiaryAfmNo = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryAddress2() {
        return outListGrpOutGrmLgBeneficiaryAddress2;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryAddress2(String value) {
        this.outListGrpOutGrmLgBeneficiaryAddress2 = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryRegion() {
        return outListGrpOutGrmLgBeneficiaryRegion;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryRegion(String value) {
        this.outListGrpOutGrmLgBeneficiaryRegion = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryZipCode() {
        return outListGrpOutGrmLgBeneficiaryZipCode;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryZipCode(String value) {
        this.outListGrpOutGrmLgBeneficiaryZipCode = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryCity() {
        return outListGrpOutGrmLgBeneficiaryCity;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryCity(String value) {
        this.outListGrpOutGrmLgBeneficiaryCity = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryTelephone() {
        return outListGrpOutGrmLgBeneficiaryTelephone;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryTelephone(String value) {
        this.outListGrpOutGrmLgBeneficiaryTelephone = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryProfession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryProfession() {
        return outListGrpOutGrmLgBeneficiaryProfession;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryProfession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryProfession(String value) {
        this.outListGrpOutGrmLgBeneficiaryProfession = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmLgBeneficiaryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmLgBeneficiaryComments() {
        return outListGrpOutGrmLgBeneficiaryComments;
    }

    /**
     * Sets the value of the outListGrpOutGrmLgBeneficiaryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmLgBeneficiaryComments(String value) {
        this.outListGrpOutGrmLgBeneficiaryComments = value;
    }

}
