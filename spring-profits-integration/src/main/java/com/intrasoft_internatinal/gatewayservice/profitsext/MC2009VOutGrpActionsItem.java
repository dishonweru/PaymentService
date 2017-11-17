
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2009VOutGrpActionsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2009VOutGrpActionsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpActionsOutGrmActionsCollateralTblDtlDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2009VOutGrpActionsItem", propOrder = {
    "outGrpActionsOutGrmActionsCollateralTblDtlDescr1",
    "outGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType"
})
public class MC2009VOutGrpActionsItem {

    @XmlElement(name = "OutGrpActionsOutGrmActionsCollateralTblDtlDescr1")
    protected String outGrpActionsOutGrmActionsCollateralTblDtlDescr1;
    @XmlElement(name = "OutGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType")
    protected String outGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType;

    /**
     * Gets the value of the outGrpActionsOutGrmActionsCollateralTblDtlDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpActionsOutGrmActionsCollateralTblDtlDescr1() {
        return outGrpActionsOutGrmActionsCollateralTblDtlDescr1;
    }

    /**
     * Sets the value of the outGrpActionsOutGrmActionsCollateralTblDtlDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpActionsOutGrmActionsCollateralTblDtlDescr1(String value) {
        this.outGrpActionsOutGrmActionsCollateralTblDtlDescr1 = value;
    }

    /**
     * Gets the value of the outGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType() {
        return outGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType;
    }

    /**
     * Sets the value of the outGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType(String value) {
        this.outGrpActionsOutGrmActionsCollateralTblDtlDtlRecordType = value;
    }

}
