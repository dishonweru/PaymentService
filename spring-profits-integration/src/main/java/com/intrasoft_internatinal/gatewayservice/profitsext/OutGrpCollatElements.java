
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpCollatElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpCollatElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollatElementsOutGrmCollatColAccCollatColProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollatElementsOutGrmCollatColAccCollatTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCollatElementsOutGrmCollatColAccCollatTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCollatElementsOutGrmProductProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollatElementsOutGrmSelectIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollatElementsOutIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpCollatElements", propOrder = {
    "outGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc",
    "outGrpCollatElementsOutGrmCollatColAccCollatColProductId",
    "outGrpCollatElementsOutGrmCollatColAccCollatTmstamp",
    "outGrpCollatElementsOutGrmCollatColAccCollatTrxDate",
    "outGrpCollatElementsOutGrmProductProductDescription",
    "outGrpCollatElementsOutGrmSelectIefSuppliedFlag",
    "outGrpCollatElementsOutIefSuppliedSelectChar"
})
public class OutGrpCollatElements {

    @XmlElement(name = "OutGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc", required = true)
    protected BigDecimal outGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc;
    @XmlElement(name = "OutGrpCollatElementsOutGrmCollatColAccCollatColProductId")
    protected int outGrpCollatElementsOutGrmCollatColAccCollatColProductId;
    @XmlElement(name = "OutGrpCollatElementsOutGrmCollatColAccCollatTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCollatElementsOutGrmCollatColAccCollatTmstamp;
    @XmlElement(name = "OutGrpCollatElementsOutGrmCollatColAccCollatTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCollatElementsOutGrmCollatColAccCollatTrxDate;
    @XmlElement(name = "OutGrpCollatElementsOutGrmProductProductDescription")
    protected String outGrpCollatElementsOutGrmProductProductDescription;
    @XmlElement(name = "OutGrpCollatElementsOutGrmSelectIefSuppliedFlag")
    protected String outGrpCollatElementsOutGrmSelectIefSuppliedFlag;
    @XmlElement(name = "OutGrpCollatElementsOutIefSuppliedSelectChar")
    protected String outGrpCollatElementsOutIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc() {
        return outGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc;
    }

    /**
     * Sets the value of the outGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc(BigDecimal value) {
        this.outGrpCollatElementsOutGrmCollatColAccCollatCollateralPerc = value;
    }

    /**
     * Gets the value of the outGrpCollatElementsOutGrmCollatColAccCollatColProductId property.
     * 
     */
    public int getOutGrpCollatElementsOutGrmCollatColAccCollatColProductId() {
        return outGrpCollatElementsOutGrmCollatColAccCollatColProductId;
    }

    /**
     * Sets the value of the outGrpCollatElementsOutGrmCollatColAccCollatColProductId property.
     * 
     */
    public void setOutGrpCollatElementsOutGrmCollatColAccCollatColProductId(int value) {
        this.outGrpCollatElementsOutGrmCollatColAccCollatColProductId = value;
    }

    /**
     * Gets the value of the outGrpCollatElementsOutGrmCollatColAccCollatTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCollatElementsOutGrmCollatColAccCollatTmstamp() {
        return outGrpCollatElementsOutGrmCollatColAccCollatTmstamp;
    }

    /**
     * Sets the value of the outGrpCollatElementsOutGrmCollatColAccCollatTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCollatElementsOutGrmCollatColAccCollatTmstamp(XMLGregorianCalendar value) {
        this.outGrpCollatElementsOutGrmCollatColAccCollatTmstamp = value;
    }

    /**
     * Gets the value of the outGrpCollatElementsOutGrmCollatColAccCollatTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCollatElementsOutGrmCollatColAccCollatTrxDate() {
        return outGrpCollatElementsOutGrmCollatColAccCollatTrxDate;
    }

    /**
     * Sets the value of the outGrpCollatElementsOutGrmCollatColAccCollatTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCollatElementsOutGrmCollatColAccCollatTrxDate(XMLGregorianCalendar value) {
        this.outGrpCollatElementsOutGrmCollatColAccCollatTrxDate = value;
    }

    /**
     * Gets the value of the outGrpCollatElementsOutGrmProductProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollatElementsOutGrmProductProductDescription() {
        return outGrpCollatElementsOutGrmProductProductDescription;
    }

    /**
     * Sets the value of the outGrpCollatElementsOutGrmProductProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollatElementsOutGrmProductProductDescription(String value) {
        this.outGrpCollatElementsOutGrmProductProductDescription = value;
    }

    /**
     * Gets the value of the outGrpCollatElementsOutGrmSelectIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollatElementsOutGrmSelectIefSuppliedFlag() {
        return outGrpCollatElementsOutGrmSelectIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpCollatElementsOutGrmSelectIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollatElementsOutGrmSelectIefSuppliedFlag(String value) {
        this.outGrpCollatElementsOutGrmSelectIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpCollatElementsOutIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollatElementsOutIefSuppliedSelectChar() {
        return outGrpCollatElementsOutIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCollatElementsOutIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollatElementsOutIefSuppliedSelectChar(String value) {
        this.outGrpCollatElementsOutIefSuppliedSelectChar = value;
    }

}
