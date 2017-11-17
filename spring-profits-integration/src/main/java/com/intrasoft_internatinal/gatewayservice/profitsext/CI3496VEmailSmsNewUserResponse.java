
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
 *         &lt;element name="CI3496V_EmailSmsNewUserResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI3496V_EmailSmsNewUserExport" minOccurs="0"/>
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
    "ci3496VEmailSmsNewUserResult"
})
@XmlRootElement(name = "CI3496V_EmailSmsNewUserResponse")
public class CI3496VEmailSmsNewUserResponse {

    @XmlElement(name = "CI3496V_EmailSmsNewUserResult")
    protected CI3496VEmailSmsNewUserExport ci3496VEmailSmsNewUserResult;

    /**
     * Gets the value of the ci3496VEmailSmsNewUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link CI3496VEmailSmsNewUserExport }
     *     
     */
    public CI3496VEmailSmsNewUserExport getCI3496VEmailSmsNewUserResult() {
        return ci3496VEmailSmsNewUserResult;
    }

    /**
     * Sets the value of the ci3496VEmailSmsNewUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CI3496VEmailSmsNewUserExport }
     *     
     */
    public void setCI3496VEmailSmsNewUserResult(CI3496VEmailSmsNewUserExport value) {
        this.ci3496VEmailSmsNewUserResult = value;
    }

}
