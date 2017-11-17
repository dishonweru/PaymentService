
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Lna0405VInCoinsuredGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lna0405VInCoinsuredGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCoinsuredGrpInGrmMainBenefIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCoinsuredGrpInGrmInsProdInsurProdCodeProdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lna0405VInCoinsuredGrpItem", propOrder = {
    "inCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar",
    "inCoinsuredGrpInGrmMainBenefIefSuppliedFlag",
    "inCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate",
    "inCoinsuredGrpInGrmInsProdInsurProdCodeProdId"
})
public class Lna0405VInCoinsuredGrpItem {

    @XmlElement(name = "InCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar")
    protected String inCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar;
    @XmlElement(name = "InCoinsuredGrpInGrmMainBenefIefSuppliedFlag")
    protected String inCoinsuredGrpInGrmMainBenefIefSuppliedFlag;
    @XmlElement(name = "InCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate;
    @XmlElement(name = "InCoinsuredGrpInGrmInsProdInsurProdCodeProdId")
    protected int inCoinsuredGrpInGrmInsProdInsurProdCodeProdId;

    /**
     * Gets the value of the inCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar() {
        return inCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar(String value) {
        this.inCoinsuredGrpInGrmDbSelectedBenefIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inCoinsuredGrpInGrmMainBenefIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCoinsuredGrpInGrmMainBenefIefSuppliedFlag() {
        return inCoinsuredGrpInGrmMainBenefIefSuppliedFlag;
    }

    /**
     * Sets the value of the inCoinsuredGrpInGrmMainBenefIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCoinsuredGrpInGrmMainBenefIefSuppliedFlag(String value) {
        this.inCoinsuredGrpInGrmMainBenefIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate() {
        return inCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate;
    }

    /**
     * Sets the value of the inCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate(XMLGregorianCalendar value) {
        this.inCoinsuredGrpInBirthdatesBenefsGrmIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inCoinsuredGrpInGrmInsProdInsurProdCodeProdId property.
     * 
     */
    public int getInCoinsuredGrpInGrmInsProdInsurProdCodeProdId() {
        return inCoinsuredGrpInGrmInsProdInsurProdCodeProdId;
    }

    /**
     * Sets the value of the inCoinsuredGrpInGrmInsProdInsurProdCodeProdId property.
     * 
     */
    public void setInCoinsuredGrpInGrmInsProdInsurProdCodeProdId(int value) {
        this.inCoinsuredGrpInGrmInsProdInsurProdCodeProdId = value;
    }

}
