
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGrpCollatElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpCollatElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpCollatElementsInGrmColAccCollatCollateralPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpCollatElementsInGrmColAccCollatColProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpCollatElementsInGrmColAccCollatTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpCollatElementsInGrmColAccCollatTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpCollatElementsInGrmProductProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCollatElementsInIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpCollatElements", propOrder = {
    "inGrpCollatElementsInGrmColAccCollatCollateralPerc",
    "inGrpCollatElementsInGrmColAccCollatColProductId",
    "inGrpCollatElementsInGrmColAccCollatTmstamp",
    "inGrpCollatElementsInGrmColAccCollatTrxDate",
    "inGrpCollatElementsInGrmProductProductDescription",
    "inGrpCollatElementsInIefSuppliedSelectChar"
})
public class InGrpCollatElements {

    @XmlElement(name = "InGrpCollatElementsInGrmColAccCollatCollateralPerc", required = true)
    protected BigDecimal inGrpCollatElementsInGrmColAccCollatCollateralPerc;
    @XmlElement(name = "InGrpCollatElementsInGrmColAccCollatColProductId")
    protected int inGrpCollatElementsInGrmColAccCollatColProductId;
    @XmlElement(name = "InGrpCollatElementsInGrmColAccCollatTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpCollatElementsInGrmColAccCollatTmstamp;
    @XmlElement(name = "InGrpCollatElementsInGrmColAccCollatTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpCollatElementsInGrmColAccCollatTrxDate;
    @XmlElement(name = "InGrpCollatElementsInGrmProductProductDescription")
    protected String inGrpCollatElementsInGrmProductProductDescription;
    @XmlElement(name = "InGrpCollatElementsInIefSuppliedSelectChar")
    protected String inGrpCollatElementsInIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpCollatElementsInGrmColAccCollatCollateralPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpCollatElementsInGrmColAccCollatCollateralPerc() {
        return inGrpCollatElementsInGrmColAccCollatCollateralPerc;
    }

    /**
     * Sets the value of the inGrpCollatElementsInGrmColAccCollatCollateralPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpCollatElementsInGrmColAccCollatCollateralPerc(BigDecimal value) {
        this.inGrpCollatElementsInGrmColAccCollatCollateralPerc = value;
    }

    /**
     * Gets the value of the inGrpCollatElementsInGrmColAccCollatColProductId property.
     * 
     */
    public int getInGrpCollatElementsInGrmColAccCollatColProductId() {
        return inGrpCollatElementsInGrmColAccCollatColProductId;
    }

    /**
     * Sets the value of the inGrpCollatElementsInGrmColAccCollatColProductId property.
     * 
     */
    public void setInGrpCollatElementsInGrmColAccCollatColProductId(int value) {
        this.inGrpCollatElementsInGrmColAccCollatColProductId = value;
    }

    /**
     * Gets the value of the inGrpCollatElementsInGrmColAccCollatTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpCollatElementsInGrmColAccCollatTmstamp() {
        return inGrpCollatElementsInGrmColAccCollatTmstamp;
    }

    /**
     * Sets the value of the inGrpCollatElementsInGrmColAccCollatTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpCollatElementsInGrmColAccCollatTmstamp(XMLGregorianCalendar value) {
        this.inGrpCollatElementsInGrmColAccCollatTmstamp = value;
    }

    /**
     * Gets the value of the inGrpCollatElementsInGrmColAccCollatTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpCollatElementsInGrmColAccCollatTrxDate() {
        return inGrpCollatElementsInGrmColAccCollatTrxDate;
    }

    /**
     * Sets the value of the inGrpCollatElementsInGrmColAccCollatTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpCollatElementsInGrmColAccCollatTrxDate(XMLGregorianCalendar value) {
        this.inGrpCollatElementsInGrmColAccCollatTrxDate = value;
    }

    /**
     * Gets the value of the inGrpCollatElementsInGrmProductProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCollatElementsInGrmProductProductDescription() {
        return inGrpCollatElementsInGrmProductProductDescription;
    }

    /**
     * Sets the value of the inGrpCollatElementsInGrmProductProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCollatElementsInGrmProductProductDescription(String value) {
        this.inGrpCollatElementsInGrmProductProductDescription = value;
    }

    /**
     * Gets the value of the inGrpCollatElementsInIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCollatElementsInIefSuppliedSelectChar() {
        return inGrpCollatElementsInIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpCollatElementsInIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCollatElementsInIefSuppliedSelectChar(String value) {
        this.inGrpCollatElementsInIefSuppliedSelectChar = value;
    }

}
