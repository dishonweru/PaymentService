
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T2103VOutGrpDaysItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2103VOutGrpDaysItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDaysOutGrmDayIefSuppliedNumber3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDaysOutGrmSelectedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDaysOutGrmYesnoIefSuppliedYesno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2103VOutGrpDaysItem", propOrder = {
    "outGrpDaysOutGrmDayIefSuppliedNumber3",
    "outGrpDaysOutGrmSelectedIefSuppliedFlag",
    "outGrpDaysOutGrmYesnoIefSuppliedYesno"
})
public class T2103VOutGrpDaysItem {

    @XmlElement(name = "OutGrpDaysOutGrmDayIefSuppliedNumber3")
    protected short outGrpDaysOutGrmDayIefSuppliedNumber3;
    @XmlElement(name = "OutGrpDaysOutGrmSelectedIefSuppliedFlag")
    protected String outGrpDaysOutGrmSelectedIefSuppliedFlag;
    @XmlElement(name = "OutGrpDaysOutGrmYesnoIefSuppliedYesno")
    protected String outGrpDaysOutGrmYesnoIefSuppliedYesno;

    /**
     * Gets the value of the outGrpDaysOutGrmDayIefSuppliedNumber3 property.
     * 
     */
    public short getOutGrpDaysOutGrmDayIefSuppliedNumber3() {
        return outGrpDaysOutGrmDayIefSuppliedNumber3;
    }

    /**
     * Sets the value of the outGrpDaysOutGrmDayIefSuppliedNumber3 property.
     * 
     */
    public void setOutGrpDaysOutGrmDayIefSuppliedNumber3(short value) {
        this.outGrpDaysOutGrmDayIefSuppliedNumber3 = value;
    }

    /**
     * Gets the value of the outGrpDaysOutGrmSelectedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDaysOutGrmSelectedIefSuppliedFlag() {
        return outGrpDaysOutGrmSelectedIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpDaysOutGrmSelectedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDaysOutGrmSelectedIefSuppliedFlag(String value) {
        this.outGrpDaysOutGrmSelectedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpDaysOutGrmYesnoIefSuppliedYesno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDaysOutGrmYesnoIefSuppliedYesno() {
        return outGrpDaysOutGrmYesnoIefSuppliedYesno;
    }

    /**
     * Sets the value of the outGrpDaysOutGrmYesnoIefSuppliedYesno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDaysOutGrmYesnoIefSuppliedYesno(String value) {
        this.outGrpDaysOutGrmYesnoIefSuppliedYesno = value;
    }

}
