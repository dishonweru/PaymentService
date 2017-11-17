
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
 *         &lt;element name="PAR20V_GenericDetailCollectionResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PAR20V_GenericDetailCollectionExport" minOccurs="0"/>
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
    "par20VGenericDetailCollectionResult"
})
@XmlRootElement(name = "PAR20V_GenericDetailCollectionResponse")
public class PAR20VGenericDetailCollectionResponse {

    @XmlElement(name = "PAR20V_GenericDetailCollectionResult")
    protected PAR20VGenericDetailCollectionExport par20VGenericDetailCollectionResult;

    /**
     * Gets the value of the par20VGenericDetailCollectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link PAR20VGenericDetailCollectionExport }
     *     
     */
    public PAR20VGenericDetailCollectionExport getPAR20VGenericDetailCollectionResult() {
        return par20VGenericDetailCollectionResult;
    }

    /**
     * Sets the value of the par20VGenericDetailCollectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAR20VGenericDetailCollectionExport }
     *     
     */
    public void setPAR20VGenericDetailCollectionResult(PAR20VGenericDetailCollectionExport value) {
        this.par20VGenericDetailCollectionResult = value;
    }

}
