
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGrpBenef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpBenef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpBenefInGrmAgreementBenefBenefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpBenefInGrmAgreementBenefMainBenefFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpBenefInGrmAgreementBenefTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpBenefInGrmBenefCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpBenefInGrmBenefCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpBenefInGrmBenefListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpBenef", propOrder = {
    "inGrpBenefInGrmAgreementBenefBenefStatus",
    "inGrpBenefInGrmAgreementBenefMainBenefFlg",
    "inGrpBenefInGrmAgreementBenefTmstamp",
    "inGrpBenefInGrmBenefCustomerCDigit",
    "inGrpBenefInGrmBenefCustomerCustId",
    "inGrpBenefInGrmBenefListSetDescription"
})
public class InGrpBenef {

    @XmlElement(name = "InGrpBenefInGrmAgreementBenefBenefStatus")
    protected String inGrpBenefInGrmAgreementBenefBenefStatus;
    @XmlElement(name = "InGrpBenefInGrmAgreementBenefMainBenefFlg")
    protected String inGrpBenefInGrmAgreementBenefMainBenefFlg;
    @XmlElement(name = "InGrpBenefInGrmAgreementBenefTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpBenefInGrmAgreementBenefTmstamp;
    @XmlElement(name = "InGrpBenefInGrmBenefCustomerCDigit")
    protected short inGrpBenefInGrmBenefCustomerCDigit;
    @XmlElement(name = "InGrpBenefInGrmBenefCustomerCustId")
    protected int inGrpBenefInGrmBenefCustomerCustId;
    @XmlElement(name = "InGrpBenefInGrmBenefListSetDescription")
    protected String inGrpBenefInGrmBenefListSetDescription;

    /**
     * Gets the value of the inGrpBenefInGrmAgreementBenefBenefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpBenefInGrmAgreementBenefBenefStatus() {
        return inGrpBenefInGrmAgreementBenefBenefStatus;
    }

    /**
     * Sets the value of the inGrpBenefInGrmAgreementBenefBenefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpBenefInGrmAgreementBenefBenefStatus(String value) {
        this.inGrpBenefInGrmAgreementBenefBenefStatus = value;
    }

    /**
     * Gets the value of the inGrpBenefInGrmAgreementBenefMainBenefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpBenefInGrmAgreementBenefMainBenefFlg() {
        return inGrpBenefInGrmAgreementBenefMainBenefFlg;
    }

    /**
     * Sets the value of the inGrpBenefInGrmAgreementBenefMainBenefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpBenefInGrmAgreementBenefMainBenefFlg(String value) {
        this.inGrpBenefInGrmAgreementBenefMainBenefFlg = value;
    }

    /**
     * Gets the value of the inGrpBenefInGrmAgreementBenefTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpBenefInGrmAgreementBenefTmstamp() {
        return inGrpBenefInGrmAgreementBenefTmstamp;
    }

    /**
     * Sets the value of the inGrpBenefInGrmAgreementBenefTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpBenefInGrmAgreementBenefTmstamp(XMLGregorianCalendar value) {
        this.inGrpBenefInGrmAgreementBenefTmstamp = value;
    }

    /**
     * Gets the value of the inGrpBenefInGrmBenefCustomerCDigit property.
     * 
     */
    public short getInGrpBenefInGrmBenefCustomerCDigit() {
        return inGrpBenefInGrmBenefCustomerCDigit;
    }

    /**
     * Sets the value of the inGrpBenefInGrmBenefCustomerCDigit property.
     * 
     */
    public void setInGrpBenefInGrmBenefCustomerCDigit(short value) {
        this.inGrpBenefInGrmBenefCustomerCDigit = value;
    }

    /**
     * Gets the value of the inGrpBenefInGrmBenefCustomerCustId property.
     * 
     */
    public int getInGrpBenefInGrmBenefCustomerCustId() {
        return inGrpBenefInGrmBenefCustomerCustId;
    }

    /**
     * Sets the value of the inGrpBenefInGrmBenefCustomerCustId property.
     * 
     */
    public void setInGrpBenefInGrmBenefCustomerCustId(int value) {
        this.inGrpBenefInGrmBenefCustomerCustId = value;
    }

    /**
     * Gets the value of the inGrpBenefInGrmBenefListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpBenefInGrmBenefListSetDescription() {
        return inGrpBenefInGrmBenefListSetDescription;
    }

    /**
     * Sets the value of the inGrpBenefInGrmBenefListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpBenefInGrmBenefListSetDescription(String value) {
        this.inGrpBenefInGrmBenefListSetDescription = value;
    }

}
