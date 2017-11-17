
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
 *         &lt;element name="L0449V_DebtManagement_ExtraResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0449VDebtManagementExtraExport" minOccurs="0"/>
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
    "l0449VDebtManagementExtraResult"
})
@XmlRootElement(name = "L0449V_DebtManagement_ExtraResponse")
public class L0449VDebtManagementExtraResponse {

    @XmlElement(name = "L0449V_DebtManagement_ExtraResult")
    protected L0449VDebtManagementExtraExport l0449VDebtManagementExtraResult;

    /**
     * Gets the value of the l0449VDebtManagementExtraResult property.
     * 
     * @return
     *     possible object is
     *     {@link L0449VDebtManagementExtraExport }
     *     
     */
    public L0449VDebtManagementExtraExport getL0449VDebtManagementExtraResult() {
        return l0449VDebtManagementExtraResult;
    }

    /**
     * Sets the value of the l0449VDebtManagementExtraResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link L0449VDebtManagementExtraExport }
     *     
     */
    public void setL0449VDebtManagementExtraResult(L0449VDebtManagementExtraExport value) {
        this.l0449VDebtManagementExtraResult = value;
    }

}
