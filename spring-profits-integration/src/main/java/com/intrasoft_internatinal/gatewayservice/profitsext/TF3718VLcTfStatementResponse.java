
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
 *         &lt;element name="TF3718V_Lc_TfStatementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}TF3718VLc_TfStatementExport" minOccurs="0"/>
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
    "tf3718VLcTfStatementResult"
})
@XmlRootElement(name = "TF3718V_Lc_TfStatementResponse")
public class TF3718VLcTfStatementResponse {

    @XmlElement(name = "TF3718V_Lc_TfStatementResult")
    protected TF3718VLcTfStatementExport tf3718VLcTfStatementResult;

    /**
     * Gets the value of the tf3718VLcTfStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link TF3718VLcTfStatementExport }
     *     
     */
    public TF3718VLcTfStatementExport getTF3718VLcTfStatementResult() {
        return tf3718VLcTfStatementResult;
    }

    /**
     * Sets the value of the tf3718VLcTfStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TF3718VLcTfStatementExport }
     *     
     */
    public void setTF3718VLcTfStatementResult(TF3718VLcTfStatementExport value) {
        this.tf3718VLcTfStatementResult = value;
    }

}
