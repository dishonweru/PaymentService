
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
 *         &lt;element name="SWT3501V_SearchSwiftCodeCriteriaResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SWT3501V_SearchSwiftCodeCriteriaExport" minOccurs="0"/>
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
    "swt3501VSearchSwiftCodeCriteriaResult"
})
@XmlRootElement(name = "SWT3501V_SearchSwiftCodeCriteriaResponse")
public class SWT3501VSearchSwiftCodeCriteriaResponse {

    @XmlElement(name = "SWT3501V_SearchSwiftCodeCriteriaResult")
    protected SWT3501VSearchSwiftCodeCriteriaExport swt3501VSearchSwiftCodeCriteriaResult;

    /**
     * Gets the value of the swt3501VSearchSwiftCodeCriteriaResult property.
     * 
     * @return
     *     possible object is
     *     {@link SWT3501VSearchSwiftCodeCriteriaExport }
     *     
     */
    public SWT3501VSearchSwiftCodeCriteriaExport getSWT3501VSearchSwiftCodeCriteriaResult() {
        return swt3501VSearchSwiftCodeCriteriaResult;
    }

    /**
     * Sets the value of the swt3501VSearchSwiftCodeCriteriaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SWT3501VSearchSwiftCodeCriteriaExport }
     *     
     */
    public void setSWT3501VSearchSwiftCodeCriteriaResult(SWT3501VSearchSwiftCodeCriteriaExport value) {
        this.swt3501VSearchSwiftCodeCriteriaResult = value;
    }

}
