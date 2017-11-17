
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWT3501V_SwiftAllianceMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SWT3501V_SwiftAllianceMaintenanceExport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swt3501VSwiftAllianceMaintenanceResult"
})
@XmlRootElement(name = "SWT3501V_SwiftAllianceMaintenanceResponse")
public class SWT3501VSwiftAllianceMaintenanceResponse {

    @XmlElement(name = "SWT3501V_SwiftAllianceMaintenanceResult")
    protected SWT3501VSwiftAllianceMaintenanceExport swt3501VSwiftAllianceMaintenanceResult;

    /**
     * Gets the value of the swt3501VSwiftAllianceMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link SWT3501VSwiftAllianceMaintenanceExport }
     *     
     */
    public SWT3501VSwiftAllianceMaintenanceExport getSWT3501VSwiftAllianceMaintenanceResult() {
        return swt3501VSwiftAllianceMaintenanceResult;
    }

    /**
     * Sets the value of the swt3501VSwiftAllianceMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SWT3501VSwiftAllianceMaintenanceExport }
     *     
     */
    public void setSWT3501VSwiftAllianceMaintenanceResult(SWT3501VSwiftAllianceMaintenanceExport value) {
        this.swt3501VSwiftAllianceMaintenanceResult = value;
    }

}
