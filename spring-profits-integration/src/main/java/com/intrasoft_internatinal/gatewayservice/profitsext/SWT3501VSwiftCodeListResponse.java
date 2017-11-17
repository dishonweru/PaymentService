
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
 *         &lt;element name="SWT3501V_SwiftCodeListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SWT3501V_SwiftCodeListExport" minOccurs="0"/>
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
    "swt3501VSwiftCodeListResult"
})
@XmlRootElement(name = "SWT3501V_SwiftCodeListResponse")
public class SWT3501VSwiftCodeListResponse {

    @XmlElement(name = "SWT3501V_SwiftCodeListResult")
    protected SWT3501VSwiftCodeListExport swt3501VSwiftCodeListResult;

    /**
     * Gets the value of the swt3501VSwiftCodeListResult property.
     * 
     * @return
     *     possible object is
     *     {@link SWT3501VSwiftCodeListExport }
     *     
     */
    public SWT3501VSwiftCodeListExport getSWT3501VSwiftCodeListResult() {
        return swt3501VSwiftCodeListResult;
    }

    /**
     * Sets the value of the swt3501VSwiftCodeListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SWT3501VSwiftCodeListExport }
     *     
     */
    public void setSWT3501VSwiftCodeListResult(SWT3501VSwiftCodeListExport value) {
        this.swt3501VSwiftCodeListResult = value;
    }

}
