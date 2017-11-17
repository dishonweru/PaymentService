
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutAgreementGuarantorListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutAgreementGuarantorListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutListGrpOutListGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmAgreementWorkGuarantorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListGrpOutListGrmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutListGrpOutListCustomerGrmListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmAgreementGuarantGuarantorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmAgreementGuarantGuaranteeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutListGrpOutListGrmAgreementGuarantRemovalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrpOutListGrmAgreementGuarantTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrpOutListGrmLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutAgreementGuarantorListItem", propOrder = {
    "outListGrpOutListGrmIefSuppliedSelectChar",
    "outListGrpOutListGrmIefSuppliedFlag",
    "outListGrpOutListGrmAgreementWorkGuarantorStatus",
    "outListGrpOutListGrmCustomerCustId",
    "outListGrpOutListGrmCustomerCDigit",
    "outListGrpOutListCustomerGrmListSetDescription",
    "outListGrpOutListGrmAgreementGuarantGuarantorStatus",
    "outListGrpOutListGrmAgreementGuarantGuaranteeAmount",
    "outListGrpOutListGrmAgreementGuarantRemovalDt",
    "outListGrpOutListGrmAgreementGuarantTmstamp",
    "outListGrpOutListGrmLimitCurrencyShortDescr"
})
public class OutAgreementGuarantorListItem {

    @XmlElement(name = "OutListGrpOutListGrmIefSuppliedSelectChar")
    protected String outListGrpOutListGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutListGrpOutListGrmIefSuppliedFlag")
    protected String outListGrpOutListGrmIefSuppliedFlag;
    @XmlElement(name = "OutListGrpOutListGrmAgreementWorkGuarantorStatus")
    protected String outListGrpOutListGrmAgreementWorkGuarantorStatus;
    @XmlElement(name = "OutListGrpOutListGrmCustomerCustId")
    protected int outListGrpOutListGrmCustomerCustId;
    @XmlElement(name = "OutListGrpOutListGrmCustomerCDigit")
    protected short outListGrpOutListGrmCustomerCDigit;
    @XmlElement(name = "OutListGrpOutListCustomerGrmListSetDescription")
    protected String outListGrpOutListCustomerGrmListSetDescription;
    @XmlElement(name = "OutListGrpOutListGrmAgreementGuarantGuarantorStatus")
    protected String outListGrpOutListGrmAgreementGuarantGuarantorStatus;
    @XmlElement(name = "OutListGrpOutListGrmAgreementGuarantGuaranteeAmount", required = true)
    protected BigDecimal outListGrpOutListGrmAgreementGuarantGuaranteeAmount;
    @XmlElement(name = "OutListGrpOutListGrmAgreementGuarantRemovalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrpOutListGrmAgreementGuarantRemovalDt;
    @XmlElement(name = "OutListGrpOutListGrmAgreementGuarantTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrpOutListGrmAgreementGuarantTmstamp;
    @XmlElement(name = "OutListGrpOutListGrmLimitCurrencyShortDescr")
    protected String outListGrpOutListGrmLimitCurrencyShortDescr;

    /**
     * Gets the value of the outListGrpOutListGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmIefSuppliedSelectChar() {
        return outListGrpOutListGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outListGrpOutListGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmIefSuppliedSelectChar(String value) {
        this.outListGrpOutListGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmIefSuppliedFlag() {
        return outListGrpOutListGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the outListGrpOutListGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmIefSuppliedFlag(String value) {
        this.outListGrpOutListGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmAgreementWorkGuarantorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmAgreementWorkGuarantorStatus() {
        return outListGrpOutListGrmAgreementWorkGuarantorStatus;
    }

    /**
     * Sets the value of the outListGrpOutListGrmAgreementWorkGuarantorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmAgreementWorkGuarantorStatus(String value) {
        this.outListGrpOutListGrmAgreementWorkGuarantorStatus = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmCustomerCustId property.
     * 
     */
    public int getOutListGrpOutListGrmCustomerCustId() {
        return outListGrpOutListGrmCustomerCustId;
    }

    /**
     * Sets the value of the outListGrpOutListGrmCustomerCustId property.
     * 
     */
    public void setOutListGrpOutListGrmCustomerCustId(int value) {
        this.outListGrpOutListGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmCustomerCDigit property.
     * 
     */
    public short getOutListGrpOutListGrmCustomerCDigit() {
        return outListGrpOutListGrmCustomerCDigit;
    }

    /**
     * Sets the value of the outListGrpOutListGrmCustomerCDigit property.
     * 
     */
    public void setOutListGrpOutListGrmCustomerCDigit(short value) {
        this.outListGrpOutListGrmCustomerCDigit = value;
    }

    /**
     * Gets the value of the outListGrpOutListCustomerGrmListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListCustomerGrmListSetDescription() {
        return outListGrpOutListCustomerGrmListSetDescription;
    }

    /**
     * Sets the value of the outListGrpOutListCustomerGrmListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListCustomerGrmListSetDescription(String value) {
        this.outListGrpOutListCustomerGrmListSetDescription = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmAgreementGuarantGuarantorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmAgreementGuarantGuarantorStatus() {
        return outListGrpOutListGrmAgreementGuarantGuarantorStatus;
    }

    /**
     * Sets the value of the outListGrpOutListGrmAgreementGuarantGuarantorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmAgreementGuarantGuarantorStatus(String value) {
        this.outListGrpOutListGrmAgreementGuarantGuarantorStatus = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmAgreementGuarantGuaranteeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutListGrpOutListGrmAgreementGuarantGuaranteeAmount() {
        return outListGrpOutListGrmAgreementGuarantGuaranteeAmount;
    }

    /**
     * Sets the value of the outListGrpOutListGrmAgreementGuarantGuaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutListGrpOutListGrmAgreementGuarantGuaranteeAmount(BigDecimal value) {
        this.outListGrpOutListGrmAgreementGuarantGuaranteeAmount = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmAgreementGuarantRemovalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrpOutListGrmAgreementGuarantRemovalDt() {
        return outListGrpOutListGrmAgreementGuarantRemovalDt;
    }

    /**
     * Sets the value of the outListGrpOutListGrmAgreementGuarantRemovalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrpOutListGrmAgreementGuarantRemovalDt(XMLGregorianCalendar value) {
        this.outListGrpOutListGrmAgreementGuarantRemovalDt = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmAgreementGuarantTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrpOutListGrmAgreementGuarantTmstamp() {
        return outListGrpOutListGrmAgreementGuarantTmstamp;
    }

    /**
     * Sets the value of the outListGrpOutListGrmAgreementGuarantTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrpOutListGrmAgreementGuarantTmstamp(XMLGregorianCalendar value) {
        this.outListGrpOutListGrmAgreementGuarantTmstamp = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmLimitCurrencyShortDescr() {
        return outListGrpOutListGrmLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the outListGrpOutListGrmLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmLimitCurrencyShortDescr(String value) {
        this.outListGrpOutListGrmLimitCurrencyShortDescr = value;
    }

}
