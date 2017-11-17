
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
 *         &lt;element name="DOC0002V_InsertDocDetailsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DOC0002V_InsertDocDetailsExport" minOccurs="0"/>
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
    "doc0002VInsertDocDetailsResult"
})
@XmlRootElement(name = "DOC0002V_InsertDocDetailsResponse")
public class DOC0002VInsertDocDetailsResponse {

    @XmlElement(name = "DOC0002V_InsertDocDetailsResult")
    protected DOC0002VInsertDocDetailsExport doc0002VInsertDocDetailsResult;

    /**
     * Gets the value of the doc0002VInsertDocDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link DOC0002VInsertDocDetailsExport }
     *     
     */
    public DOC0002VInsertDocDetailsExport getDOC0002VInsertDocDetailsResult() {
        return doc0002VInsertDocDetailsResult;
    }

    /**
     * Sets the value of the doc0002VInsertDocDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOC0002VInsertDocDetailsExport }
     *     
     */
    public void setDOC0002VInsertDocDetailsResult(DOC0002VInsertDocDetailsExport value) {
        this.doc0002VInsertDocDetailsResult = value;
    }

}
