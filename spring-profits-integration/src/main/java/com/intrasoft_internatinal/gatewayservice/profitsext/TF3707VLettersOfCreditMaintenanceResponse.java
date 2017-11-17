
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
 *         &lt;element name="TF3707V_LettersOfCreditMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}LettersOfCreditRetrieveExport" minOccurs="0"/>
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
    "tf3707VLettersOfCreditMaintenanceResult"
})
@XmlRootElement(name = "TF3707V_LettersOfCreditMaintenanceResponse")
public class TF3707VLettersOfCreditMaintenanceResponse {

    @XmlElement(name = "TF3707V_LettersOfCreditMaintenanceResult")
    protected LettersOfCreditRetrieveExport tf3707VLettersOfCreditMaintenanceResult;

    /**
     * Gets the value of the tf3707VLettersOfCreditMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link LettersOfCreditRetrieveExport }
     *     
     */
    public LettersOfCreditRetrieveExport getTF3707VLettersOfCreditMaintenanceResult() {
        return tf3707VLettersOfCreditMaintenanceResult;
    }

    /**
     * Sets the value of the tf3707VLettersOfCreditMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LettersOfCreditRetrieveExport }
     *     
     */
    public void setTF3707VLettersOfCreditMaintenanceResult(LettersOfCreditRetrieveExport value) {
        this.tf3707VLettersOfCreditMaintenanceResult = value;
    }

}
