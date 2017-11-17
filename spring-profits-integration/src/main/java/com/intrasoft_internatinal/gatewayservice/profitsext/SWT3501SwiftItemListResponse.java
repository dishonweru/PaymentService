
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
 *         &lt;element name="SWT3501_SwiftItemListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SWT3501_SwiftItemListsExport" minOccurs="0"/>
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
    "swt3501SwiftItemListResult"
})
@XmlRootElement(name = "SWT3501_SwiftItemListResponse")
public class SWT3501SwiftItemListResponse {

    @XmlElement(name = "SWT3501_SwiftItemListResult")
    protected SWT3501SwiftItemListsExport swt3501SwiftItemListResult;

    /**
     * Gets the value of the swt3501SwiftItemListResult property.
     * 
     * @return
     *     possible object is
     *     {@link SWT3501SwiftItemListsExport }
     *     
     */
    public SWT3501SwiftItemListsExport getSWT3501SwiftItemListResult() {
        return swt3501SwiftItemListResult;
    }

    /**
     * Sets the value of the swt3501SwiftItemListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SWT3501SwiftItemListsExport }
     *     
     */
    public void setSWT3501SwiftItemListResult(SWT3501SwiftItemListsExport value) {
        this.swt3501SwiftItemListResult = value;
    }

}
