
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
 *         &lt;element name="UDF002V_DynamicFieldsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}UDF002VDynamicFieldsExport" minOccurs="0"/>
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
    "udf002VDynamicFieldsResult"
})
@XmlRootElement(name = "UDF002V_DynamicFieldsResponse")
public class UDF002VDynamicFieldsResponse {

    @XmlElement(name = "UDF002V_DynamicFieldsResult")
    protected UDF002VDynamicFieldsExport udf002VDynamicFieldsResult;

    /**
     * Gets the value of the udf002VDynamicFieldsResult property.
     * 
     * @return
     *     possible object is
     *     {@link UDF002VDynamicFieldsExport }
     *     
     */
    public UDF002VDynamicFieldsExport getUDF002VDynamicFieldsResult() {
        return udf002VDynamicFieldsResult;
    }

    /**
     * Sets the value of the udf002VDynamicFieldsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UDF002VDynamicFieldsExport }
     *     
     */
    public void setUDF002VDynamicFieldsResult(UDF002VDynamicFieldsExport value) {
        this.udf002VDynamicFieldsResult = value;
    }

}
