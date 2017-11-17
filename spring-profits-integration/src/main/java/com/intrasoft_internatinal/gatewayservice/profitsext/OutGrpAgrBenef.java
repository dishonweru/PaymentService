
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpAgrBenef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpAgrBenef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAgrBenefOutGrmAgrBenefCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAgrBenefOutGrmAgrBenefListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpAgrBenef", propOrder = {
    "outGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus",
    "outGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg",
    "outGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp",
    "outGrpAgrBenefOutGrmAgrBenefCustomerCustId",
    "outGrpAgrBenefOutGrmAgrBenefListSetDescription"
})
public class OutGrpAgrBenef {

    @XmlElement(name = "OutGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus")
    protected String outGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus;
    @XmlElement(name = "OutGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg")
    protected String outGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg;
    @XmlElement(name = "OutGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp;
    @XmlElement(name = "OutGrpAgrBenefOutGrmAgrBenefCustomerCustId")
    protected int outGrpAgrBenefOutGrmAgrBenefCustomerCustId;
    @XmlElement(name = "OutGrpAgrBenefOutGrmAgrBenefListSetDescription")
    protected String outGrpAgrBenefOutGrmAgrBenefListSetDescription;

    /**
     * Gets the value of the outGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus() {
        return outGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus;
    }

    /**
     * Sets the value of the outGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus(String value) {
        this.outGrpAgrBenefOutGrmAgrBenefAgreementBenefBenefStatus = value;
    }

    /**
     * Gets the value of the outGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg() {
        return outGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg;
    }

    /**
     * Sets the value of the outGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg(String value) {
        this.outGrpAgrBenefOutGrmAgrBenefAgreementBenefMainBenefFlg = value;
    }

    /**
     * Gets the value of the outGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp() {
        return outGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp;
    }

    /**
     * Sets the value of the outGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp(XMLGregorianCalendar value) {
        this.outGrpAgrBenefOutGrmAgrBenefAgreementBenefTmstamp = value;
    }

    /**
     * Gets the value of the outGrpAgrBenefOutGrmAgrBenefCustomerCustId property.
     * 
     */
    public int getOutGrpAgrBenefOutGrmAgrBenefCustomerCustId() {
        return outGrpAgrBenefOutGrmAgrBenefCustomerCustId;
    }

    /**
     * Sets the value of the outGrpAgrBenefOutGrmAgrBenefCustomerCustId property.
     * 
     */
    public void setOutGrpAgrBenefOutGrmAgrBenefCustomerCustId(int value) {
        this.outGrpAgrBenefOutGrmAgrBenefCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpAgrBenefOutGrmAgrBenefListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAgrBenefOutGrmAgrBenefListSetDescription() {
        return outGrpAgrBenefOutGrmAgrBenefListSetDescription;
    }

    /**
     * Sets the value of the outGrpAgrBenefOutGrmAgrBenefListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAgrBenefOutGrmAgrBenefListSetDescription(String value) {
        this.outGrpAgrBenefOutGrmAgrBenefListSetDescription = value;
    }

}
