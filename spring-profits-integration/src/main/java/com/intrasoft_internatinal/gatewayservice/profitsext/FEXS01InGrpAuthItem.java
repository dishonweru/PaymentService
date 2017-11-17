
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEXS01InGrpAuthItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01InGrpAuthItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpAuthInGrmTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAuthInGrmTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAuthInGrmTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01InGrpAuthItem", propOrder = {
    "inGrpAuthInGrmTeamInformationSuper1Code",
    "inGrpAuthInGrmTeamInformationSuper2Code",
    "inGrpAuthInGrmTeamInformationTransactionId"
})
public class FEXS01InGrpAuthItem {

    @XmlElement(name = "InGrpAuthInGrmTeamInformationSuper1Code")
    protected String inGrpAuthInGrmTeamInformationSuper1Code;
    @XmlElement(name = "InGrpAuthInGrmTeamInformationSuper2Code")
    protected String inGrpAuthInGrmTeamInformationSuper2Code;
    @XmlElement(name = "InGrpAuthInGrmTeamInformationTransactionId")
    protected int inGrpAuthInGrmTeamInformationTransactionId;

    /**
     * Gets the value of the inGrpAuthInGrmTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAuthInGrmTeamInformationSuper1Code() {
        return inGrpAuthInGrmTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inGrpAuthInGrmTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAuthInGrmTeamInformationSuper1Code(String value) {
        this.inGrpAuthInGrmTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inGrpAuthInGrmTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAuthInGrmTeamInformationSuper2Code() {
        return inGrpAuthInGrmTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inGrpAuthInGrmTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAuthInGrmTeamInformationSuper2Code(String value) {
        this.inGrpAuthInGrmTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inGrpAuthInGrmTeamInformationTransactionId property.
     * 
     */
    public int getInGrpAuthInGrmTeamInformationTransactionId() {
        return inGrpAuthInGrmTeamInformationTransactionId;
    }

    /**
     * Sets the value of the inGrpAuthInGrmTeamInformationTransactionId property.
     * 
     */
    public void setInGrpAuthInGrmTeamInformationTransactionId(int value) {
        this.inGrpAuthInGrmTeamInformationTransactionId = value;
    }

}
