
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T1462VlgBeneficiariesImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1462VlgBeneficiariesImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InBeneficiaryTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgBeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiarySurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1462VlgBeneficiariesImport", propOrder = {
    "inBeneficiaryTypeGenericDetailSerialNum",
    "inLgBeneficiaryName",
    "inLgBeneficiarySurname",
    "inLgBeneficiaryAfmNo"
})
public class T1462VlgBeneficiariesImport
    extends BaseImport
{

    @XmlElement(name = "InBeneficiaryTypeGenericDetailSerialNum")
    protected int inBeneficiaryTypeGenericDetailSerialNum;
    @XmlElement(name = "InLgBeneficiaryName")
    protected String inLgBeneficiaryName;
    @XmlElement(name = "InLgBeneficiarySurname")
    protected String inLgBeneficiarySurname;
    @XmlElement(name = "InLgBeneficiaryAfmNo")
    protected String inLgBeneficiaryAfmNo;

    /**
     * Gets the value of the inBeneficiaryTypeGenericDetailSerialNum property.
     * 
     */
    public int getInBeneficiaryTypeGenericDetailSerialNum() {
        return inBeneficiaryTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBeneficiaryTypeGenericDetailSerialNum property.
     * 
     */
    public void setInBeneficiaryTypeGenericDetailSerialNum(int value) {
        this.inBeneficiaryTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryName() {
        return inLgBeneficiaryName;
    }

    /**
     * Sets the value of the inLgBeneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryName(String value) {
        this.inLgBeneficiaryName = value;
    }

    /**
     * Gets the value of the inLgBeneficiarySurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiarySurname() {
        return inLgBeneficiarySurname;
    }

    /**
     * Sets the value of the inLgBeneficiarySurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiarySurname(String value) {
        this.inLgBeneficiarySurname = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryAfmNo() {
        return inLgBeneficiaryAfmNo;
    }

    /**
     * Sets the value of the inLgBeneficiaryAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryAfmNo(String value) {
        this.inLgBeneficiaryAfmNo = value;
    }

}
