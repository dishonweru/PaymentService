
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for D0336VInAuthorGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0336VInAuthorGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InAuthorGroupInSupervisorsTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGroupInSupervisorsTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGroupInSupervisorsTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0336VInAuthorGroupItem", propOrder = {
    "inAuthorGroupInSupervisorsTeamInformationSuper1Code",
    "inAuthorGroupInSupervisorsTeamInformationSuper2Code",
    "inAuthorGroupInSupervisorsTeamInformationAuthorizationResult"
})
public class D0336VInAuthorGroupItem {

    @XmlElement(name = "InAuthorGroupInSupervisorsTeamInformationSuper1Code")
    protected String inAuthorGroupInSupervisorsTeamInformationSuper1Code;
    @XmlElement(name = "InAuthorGroupInSupervisorsTeamInformationSuper2Code")
    protected String inAuthorGroupInSupervisorsTeamInformationSuper2Code;
    @XmlElement(name = "InAuthorGroupInSupervisorsTeamInformationAuthorizationResult")
    protected String inAuthorGroupInSupervisorsTeamInformationAuthorizationResult;

    /**
     * Gets the value of the inAuthorGroupInSupervisorsTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGroupInSupervisorsTeamInformationSuper1Code() {
        return inAuthorGroupInSupervisorsTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inAuthorGroupInSupervisorsTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGroupInSupervisorsTeamInformationSuper1Code(String value) {
        this.inAuthorGroupInSupervisorsTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inAuthorGroupInSupervisorsTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGroupInSupervisorsTeamInformationSuper2Code() {
        return inAuthorGroupInSupervisorsTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inAuthorGroupInSupervisorsTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGroupInSupervisorsTeamInformationSuper2Code(String value) {
        this.inAuthorGroupInSupervisorsTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inAuthorGroupInSupervisorsTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGroupInSupervisorsTeamInformationAuthorizationResult() {
        return inAuthorGroupInSupervisorsTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the inAuthorGroupInSupervisorsTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGroupInSupervisorsTeamInformationAuthorizationResult(String value) {
        this.inAuthorGroupInSupervisorsTeamInformationAuthorizationResult = value;
    }

}
