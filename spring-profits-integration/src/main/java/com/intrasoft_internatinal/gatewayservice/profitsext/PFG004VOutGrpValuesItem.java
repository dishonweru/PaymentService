
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VOutGrpValuesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VOutGrpValuesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpValuesOutGrmValuesPfgSetupValuesEntryDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VOutGrpValuesItem", propOrder = {
    "outGrpValuesOutGrmValuesPfgSetupValuesEntryDescr",
    "outGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues"
})
public class PFG004VOutGrpValuesItem {

    @XmlElement(name = "OutGrpValuesOutGrmValuesPfgSetupValuesEntryDescr")
    protected String outGrpValuesOutGrmValuesPfgSetupValuesEntryDescr;
    @XmlElement(name = "OutGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues")
    protected String outGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues;

    /**
     * Gets the value of the outGrpValuesOutGrmValuesPfgSetupValuesEntryDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuesOutGrmValuesPfgSetupValuesEntryDescr() {
        return outGrpValuesOutGrmValuesPfgSetupValuesEntryDescr;
    }

    /**
     * Sets the value of the outGrpValuesOutGrmValuesPfgSetupValuesEntryDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuesOutGrmValuesPfgSetupValuesEntryDescr(String value) {
        this.outGrpValuesOutGrmValuesPfgSetupValuesEntryDescr = value;
    }

    /**
     * Gets the value of the outGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues() {
        return outGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues;
    }

    /**
     * Sets the value of the outGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues(String value) {
        this.outGrpValuesOutGrmValuesPfgSetupValuesPredefinedValues = value;
    }

}
