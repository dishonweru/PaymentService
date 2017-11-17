
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Lna0405VOutCoinsuredGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lna0405VOutCoinsuredGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoinsuredGrpOutGrmMainBenefIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCoinsuredGrpOutGrmInsProdInsurProdCodeProdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lna0405VOutCoinsuredGrpItem", propOrder = {
    "outCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar",
    "outCoinsuredGrpOutGrmMainBenefIefSuppliedFlag",
    "outCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate",
    "outCoinsuredGrpOutGrmInsProdInsurProdCodeProdId"
})
public class Lna0405VOutCoinsuredGrpItem {

    @XmlElement(name = "OutCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar")
    protected String outCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar;
    @XmlElement(name = "OutCoinsuredGrpOutGrmMainBenefIefSuppliedFlag")
    protected String outCoinsuredGrpOutGrmMainBenefIefSuppliedFlag;
    @XmlElement(name = "OutCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate;
    @XmlElement(name = "OutCoinsuredGrpOutGrmInsProdInsurProdCodeProdId")
    protected int outCoinsuredGrpOutGrmInsProdInsurProdCodeProdId;

    /**
     * Gets the value of the outCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar() {
        return outCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar(String value) {
        this.outCoinsuredGrpOutGrmDbSelectedBenefIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outCoinsuredGrpOutGrmMainBenefIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoinsuredGrpOutGrmMainBenefIefSuppliedFlag() {
        return outCoinsuredGrpOutGrmMainBenefIefSuppliedFlag;
    }

    /**
     * Sets the value of the outCoinsuredGrpOutGrmMainBenefIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoinsuredGrpOutGrmMainBenefIefSuppliedFlag(String value) {
        this.outCoinsuredGrpOutGrmMainBenefIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate() {
        return outCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate;
    }

    /**
     * Sets the value of the outCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate(XMLGregorianCalendar value) {
        this.outCoinsuredGrpOutBirthdatesBenefGrmIefSuppliedDate = value;
    }

    /**
     * Gets the value of the outCoinsuredGrpOutGrmInsProdInsurProdCodeProdId property.
     * 
     */
    public int getOutCoinsuredGrpOutGrmInsProdInsurProdCodeProdId() {
        return outCoinsuredGrpOutGrmInsProdInsurProdCodeProdId;
    }

    /**
     * Sets the value of the outCoinsuredGrpOutGrmInsProdInsurProdCodeProdId property.
     * 
     */
    public void setOutCoinsuredGrpOutGrmInsProdInsurProdCodeProdId(int value) {
        this.outCoinsuredGrpOutGrmInsProdInsurProdCodeProdId = value;
    }

}
