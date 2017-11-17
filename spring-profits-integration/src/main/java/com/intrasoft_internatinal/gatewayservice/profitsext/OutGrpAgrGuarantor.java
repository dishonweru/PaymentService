
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpAgrGuarantor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpAgrGuarantor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAgrGuarantorOutGrmAgrGuarantListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpAgrGuarantor", propOrder = {
    "outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount",
    "outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus",
    "outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp",
    "outGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId",
    "outGrpAgrGuarantorOutGrmAgrGuarantListSetDescription"
})
public class OutGrpAgrGuarantor {

    @XmlElement(name = "OutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount", required = true)
    protected BigDecimal outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount;
    @XmlElement(name = "OutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus")
    protected String outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus;
    @XmlElement(name = "OutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp;
    @XmlElement(name = "OutGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId")
    protected int outGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId;
    @XmlElement(name = "OutGrpAgrGuarantorOutGrmAgrGuarantListSetDescription")
    protected String outGrpAgrGuarantorOutGrmAgrGuarantListSetDescription;

    /**
     * Gets the value of the outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount() {
        return outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount;
    }

    /**
     * Sets the value of the outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount(BigDecimal value) {
        this.outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuaranteeAmount = value;
    }

    /**
     * Gets the value of the outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus() {
        return outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus;
    }

    /**
     * Sets the value of the outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus(String value) {
        this.outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantGuarantorStatus = value;
    }

    /**
     * Gets the value of the outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp() {
        return outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp;
    }

    /**
     * Sets the value of the outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp(XMLGregorianCalendar value) {
        this.outGrpAgrGuarantorOutGrmAgrGuarantAgreementGuarantTmstamp = value;
    }

    /**
     * Gets the value of the outGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId property.
     * 
     */
    public int getOutGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId() {
        return outGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId;
    }

    /**
     * Sets the value of the outGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId property.
     * 
     */
    public void setOutGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId(int value) {
        this.outGrpAgrGuarantorOutGrmAgrGuarantCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpAgrGuarantorOutGrmAgrGuarantListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAgrGuarantorOutGrmAgrGuarantListSetDescription() {
        return outGrpAgrGuarantorOutGrmAgrGuarantListSetDescription;
    }

    /**
     * Sets the value of the outGrpAgrGuarantorOutGrmAgrGuarantListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAgrGuarantorOutGrmAgrGuarantListSetDescription(String value) {
        this.outGrpAgrGuarantorOutGrmAgrGuarantListSetDescription = value;
    }

}
