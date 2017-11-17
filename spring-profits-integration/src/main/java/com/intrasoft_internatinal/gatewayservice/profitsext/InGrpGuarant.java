
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InGrpGuarant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpGuarant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpGuarantInGrmAgreementGuarantGuaranteeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpGuarantInGrmGuarantorListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpGuarantInGrmGuarCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpGuarantInGrmGuarCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpGuarant", propOrder = {
    "inGrpGuarantInGrmAgreementGuarantGuaranteeAmount",
    "inGrpGuarantInGrmGuarantorListSetDescription",
    "inGrpGuarantInGrmGuarCustomerCDigit",
    "inGrpGuarantInGrmGuarCustomerCustId"
})
public class InGrpGuarant {

    @XmlElement(name = "InGrpGuarantInGrmAgreementGuarantGuaranteeAmount", required = true)
    protected BigDecimal inGrpGuarantInGrmAgreementGuarantGuaranteeAmount;
    @XmlElement(name = "InGrpGuarantInGrmGuarantorListSetDescription")
    protected String inGrpGuarantInGrmGuarantorListSetDescription;
    @XmlElement(name = "InGrpGuarantInGrmGuarCustomerCDigit")
    protected short inGrpGuarantInGrmGuarCustomerCDigit;
    @XmlElement(name = "InGrpGuarantInGrmGuarCustomerCustId")
    protected int inGrpGuarantInGrmGuarCustomerCustId;

    /**
     * Gets the value of the inGrpGuarantInGrmAgreementGuarantGuaranteeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpGuarantInGrmAgreementGuarantGuaranteeAmount() {
        return inGrpGuarantInGrmAgreementGuarantGuaranteeAmount;
    }

    /**
     * Sets the value of the inGrpGuarantInGrmAgreementGuarantGuaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpGuarantInGrmAgreementGuarantGuaranteeAmount(BigDecimal value) {
        this.inGrpGuarantInGrmAgreementGuarantGuaranteeAmount = value;
    }

    /**
     * Gets the value of the inGrpGuarantInGrmGuarantorListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpGuarantInGrmGuarantorListSetDescription() {
        return inGrpGuarantInGrmGuarantorListSetDescription;
    }

    /**
     * Sets the value of the inGrpGuarantInGrmGuarantorListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpGuarantInGrmGuarantorListSetDescription(String value) {
        this.inGrpGuarantInGrmGuarantorListSetDescription = value;
    }

    /**
     * Gets the value of the inGrpGuarantInGrmGuarCustomerCDigit property.
     * 
     */
    public short getInGrpGuarantInGrmGuarCustomerCDigit() {
        return inGrpGuarantInGrmGuarCustomerCDigit;
    }

    /**
     * Sets the value of the inGrpGuarantInGrmGuarCustomerCDigit property.
     * 
     */
    public void setInGrpGuarantInGrmGuarCustomerCDigit(short value) {
        this.inGrpGuarantInGrmGuarCustomerCDigit = value;
    }

    /**
     * Gets the value of the inGrpGuarantInGrmGuarCustomerCustId property.
     * 
     */
    public int getInGrpGuarantInGrmGuarCustomerCustId() {
        return inGrpGuarantInGrmGuarCustomerCustId;
    }

    /**
     * Sets the value of the inGrpGuarantInGrmGuarCustomerCustId property.
     * 
     */
    public void setInGrpGuarantInGrmGuarCustomerCustId(int value) {
        this.inGrpGuarantInGrmGuarCustomerCustId = value;
    }

}
