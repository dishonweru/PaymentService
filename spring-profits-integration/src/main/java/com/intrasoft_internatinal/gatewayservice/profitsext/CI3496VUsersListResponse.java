
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
 *         &lt;element name="CI3496V_UsersListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI3496V_UsersListExport" minOccurs="0"/>
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
    "ci3496VUsersListResult"
})
@XmlRootElement(name = "CI3496V_UsersListResponse")
public class CI3496VUsersListResponse {

    @XmlElement(name = "CI3496V_UsersListResult")
    protected CI3496VUsersListExport ci3496VUsersListResult;

    /**
     * Gets the value of the ci3496VUsersListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CI3496VUsersListExport }
     *     
     */
    public CI3496VUsersListExport getCI3496VUsersListResult() {
        return ci3496VUsersListResult;
    }

    /**
     * Sets the value of the ci3496VUsersListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CI3496VUsersListExport }
     *     
     */
    public void setCI3496VUsersListResult(CI3496VUsersListExport value) {
        this.ci3496VUsersListResult = value;
    }

}
