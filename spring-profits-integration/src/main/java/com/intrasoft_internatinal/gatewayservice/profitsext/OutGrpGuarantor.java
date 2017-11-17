
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpGuarantor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpGuarantor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpGuarantorOutGrmAgreementGuarantGuarantorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpGuarantorOutGrmAgreementGuarantTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpGuarantorOutGrmGuarantorListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpGuarantorOutGrmGuarCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpGuarantorOutGrmGuarCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpGuarantor", propOrder = {
    "outGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount",
    "outGrpGuarantorOutGrmAgreementGuarantGuarantorStatus",
    "outGrpGuarantorOutGrmAgreementGuarantTmstamp",
    "outGrpGuarantorOutGrmGuarantorListSetDescription",
    "outGrpGuarantorOutGrmGuarCustomerCDigit",
    "outGrpGuarantorOutGrmGuarCustomerCustId"
})
public class OutGrpGuarantor {

    @XmlElement(name = "OutGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount", required = true)
    protected BigDecimal outGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount;
    @XmlElement(name = "OutGrpGuarantorOutGrmAgreementGuarantGuarantorStatus")
    protected String outGrpGuarantorOutGrmAgreementGuarantGuarantorStatus;
    @XmlElement(name = "OutGrpGuarantorOutGrmAgreementGuarantTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpGuarantorOutGrmAgreementGuarantTmstamp;
    @XmlElement(name = "OutGrpGuarantorOutGrmGuarantorListSetDescription")
    protected String outGrpGuarantorOutGrmGuarantorListSetDescription;
    @XmlElement(name = "OutGrpGuarantorOutGrmGuarCustomerCDigit")
    protected short outGrpGuarantorOutGrmGuarCustomerCDigit;
    @XmlElement(name = "OutGrpGuarantorOutGrmGuarCustomerCustId")
    protected int outGrpGuarantorOutGrmGuarCustomerCustId;

    /**
     * Gets the value of the outGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount() {
        return outGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount;
    }

    /**
     * Sets the value of the outGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount(BigDecimal value) {
        this.outGrpGuarantorOutGrmAgreementGuarantGuaranteeAmount = value;
    }

    /**
     * Gets the value of the outGrpGuarantorOutGrmAgreementGuarantGuarantorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpGuarantorOutGrmAgreementGuarantGuarantorStatus() {
        return outGrpGuarantorOutGrmAgreementGuarantGuarantorStatus;
    }

    /**
     * Sets the value of the outGrpGuarantorOutGrmAgreementGuarantGuarantorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpGuarantorOutGrmAgreementGuarantGuarantorStatus(String value) {
        this.outGrpGuarantorOutGrmAgreementGuarantGuarantorStatus = value;
    }

    /**
     * Gets the value of the outGrpGuarantorOutGrmAgreementGuarantTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpGuarantorOutGrmAgreementGuarantTmstamp() {
        return outGrpGuarantorOutGrmAgreementGuarantTmstamp;
    }

    /**
     * Sets the value of the outGrpGuarantorOutGrmAgreementGuarantTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpGuarantorOutGrmAgreementGuarantTmstamp(XMLGregorianCalendar value) {
        this.outGrpGuarantorOutGrmAgreementGuarantTmstamp = value;
    }

    /**
     * Gets the value of the outGrpGuarantorOutGrmGuarantorListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpGuarantorOutGrmGuarantorListSetDescription() {
        return outGrpGuarantorOutGrmGuarantorListSetDescription;
    }

    /**
     * Sets the value of the outGrpGuarantorOutGrmGuarantorListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpGuarantorOutGrmGuarantorListSetDescription(String value) {
        this.outGrpGuarantorOutGrmGuarantorListSetDescription = value;
    }

    /**
     * Gets the value of the outGrpGuarantorOutGrmGuarCustomerCDigit property.
     * 
     */
    public short getOutGrpGuarantorOutGrmGuarCustomerCDigit() {
        return outGrpGuarantorOutGrmGuarCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpGuarantorOutGrmGuarCustomerCDigit property.
     * 
     */
    public void setOutGrpGuarantorOutGrmGuarCustomerCDigit(short value) {
        this.outGrpGuarantorOutGrmGuarCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpGuarantorOutGrmGuarCustomerCustId property.
     * 
     */
    public int getOutGrpGuarantorOutGrmGuarCustomerCustId() {
        return outGrpGuarantorOutGrmGuarCustomerCustId;
    }

    /**
     * Sets the value of the outGrpGuarantorOutGrmGuarCustomerCustId property.
     * 
     */
    public void setOutGrpGuarantorOutGrmGuarCustomerCustId(int value) {
        this.outGrpGuarantorOutGrmGuarCustomerCustId = value;
    }

}
