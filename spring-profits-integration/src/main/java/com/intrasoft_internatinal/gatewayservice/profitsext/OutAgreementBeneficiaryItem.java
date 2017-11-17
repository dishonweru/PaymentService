
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutAgreementBeneficiaryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutAgreementBeneficiaryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutListGrpOutGrmAgreementWorkBenefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmAgreementWorkMainBenefFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListCustomerGrmListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmAgreementBenefBenefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmAgreementBenefMainBenefFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmAgreementBenefRemovalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrpOutListGrmAgreementBenefTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrpOutListGrmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutListGrpOutListGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListGrpOutListGrmCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutAgreementBeneficiaryItem", propOrder = {
    "outListGrpOutGrmAgreementWorkBenefStatus",
    "outListGrpOutGrmAgreementWorkMainBenefFlg",
    "outListGrpOutListCustomerGrmListSetDescription",
    "outListGrpOutListGrmAgreementBenefBenefStatus",
    "outListGrpOutListGrmAgreementBenefMainBenefFlg",
    "outListGrpOutListGrmAgreementBenefRemovalDt",
    "outListGrpOutListGrmAgreementBenefTmstamp",
    "outListGrpOutListGrmCustomerCDigit",
    "outListGrpOutListGrmCustomerCustId",
    "outListGrpOutListGrmCustomerShortName",
    "outListGrpOutListGrmIefSuppliedFlag",
    "outListGrpOutListGrmIefSuppliedSelectChar"
})
public class OutAgreementBeneficiaryItem {

    @XmlElement(name = "OutListGrpOutGrmAgreementWorkBenefStatus")
    protected String outListGrpOutGrmAgreementWorkBenefStatus;
    @XmlElement(name = "OutListGrpOutGrmAgreementWorkMainBenefFlg")
    protected String outListGrpOutGrmAgreementWorkMainBenefFlg;
    @XmlElement(name = "OutListGrpOutListCustomerGrmListSetDescription")
    protected String outListGrpOutListCustomerGrmListSetDescription;
    @XmlElement(name = "OutListGrpOutListGrmAgreementBenefBenefStatus")
    protected String outListGrpOutListGrmAgreementBenefBenefStatus;
    @XmlElement(name = "OutListGrpOutListGrmAgreementBenefMainBenefFlg")
    protected String outListGrpOutListGrmAgreementBenefMainBenefFlg;
    @XmlElement(name = "OutListGrpOutListGrmAgreementBenefRemovalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrpOutListGrmAgreementBenefRemovalDt;
    @XmlElement(name = "OutListGrpOutListGrmAgreementBenefTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrpOutListGrmAgreementBenefTmstamp;
    @XmlElement(name = "OutListGrpOutListGrmCustomerCDigit")
    protected short outListGrpOutListGrmCustomerCDigit;
    @XmlElement(name = "OutListGrpOutListGrmCustomerCustId")
    protected int outListGrpOutListGrmCustomerCustId;
    @XmlElement(name = "OutListGrpOutListGrmCustomerShortName")
    protected String outListGrpOutListGrmCustomerShortName;
    @XmlElement(name = "OutListGrpOutListGrmIefSuppliedFlag")
    protected String outListGrpOutListGrmIefSuppliedFlag;
    @XmlElement(name = "OutListGrpOutListGrmIefSuppliedSelectChar")
    protected String outListGrpOutListGrmIefSuppliedSelectChar;

    /**
     * Gets the value of the outListGrpOutGrmAgreementWorkBenefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmAgreementWorkBenefStatus() {
        return outListGrpOutGrmAgreementWorkBenefStatus;
    }

    /**
     * Sets the value of the outListGrpOutGrmAgreementWorkBenefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmAgreementWorkBenefStatus(String value) {
        this.outListGrpOutGrmAgreementWorkBenefStatus = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmAgreementWorkMainBenefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmAgreementWorkMainBenefFlg() {
        return outListGrpOutGrmAgreementWorkMainBenefFlg;
    }

    /**
     * Sets the value of the outListGrpOutGrmAgreementWorkMainBenefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmAgreementWorkMainBenefFlg(String value) {
        this.outListGrpOutGrmAgreementWorkMainBenefFlg = value;
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
     * Gets the value of the outListGrpOutListGrmAgreementBenefBenefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmAgreementBenefBenefStatus() {
        return outListGrpOutListGrmAgreementBenefBenefStatus;
    }

    /**
     * Sets the value of the outListGrpOutListGrmAgreementBenefBenefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmAgreementBenefBenefStatus(String value) {
        this.outListGrpOutListGrmAgreementBenefBenefStatus = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmAgreementBenefMainBenefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmAgreementBenefMainBenefFlg() {
        return outListGrpOutListGrmAgreementBenefMainBenefFlg;
    }

    /**
     * Sets the value of the outListGrpOutListGrmAgreementBenefMainBenefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmAgreementBenefMainBenefFlg(String value) {
        this.outListGrpOutListGrmAgreementBenefMainBenefFlg = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmAgreementBenefRemovalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrpOutListGrmAgreementBenefRemovalDt() {
        return outListGrpOutListGrmAgreementBenefRemovalDt;
    }

    /**
     * Sets the value of the outListGrpOutListGrmAgreementBenefRemovalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrpOutListGrmAgreementBenefRemovalDt(XMLGregorianCalendar value) {
        this.outListGrpOutListGrmAgreementBenefRemovalDt = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmAgreementBenefTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrpOutListGrmAgreementBenefTmstamp() {
        return outListGrpOutListGrmAgreementBenefTmstamp;
    }

    /**
     * Sets the value of the outListGrpOutListGrmAgreementBenefTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrpOutListGrmAgreementBenefTmstamp(XMLGregorianCalendar value) {
        this.outListGrpOutListGrmAgreementBenefTmstamp = value;
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
     * Gets the value of the outListGrpOutListGrmCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmCustomerShortName() {
        return outListGrpOutListGrmCustomerShortName;
    }

    /**
     * Sets the value of the outListGrpOutListGrmCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmCustomerShortName(String value) {
        this.outListGrpOutListGrmCustomerShortName = value;
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

}
