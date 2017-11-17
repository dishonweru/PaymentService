
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3604VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3604VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmAaIefSuppliedNumber4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCardCmsCardCardApplSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmCardCmsCardCardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmCardCmsCardCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCardCmsCardCardSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmCardStatusCharSuppliedChar25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCardTypeCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCustCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmPrftAccProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmPrftAccProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPrftAccProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmPrftSystemCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3604VOutGrpItem", propOrder = {
    "outGrpOutGrmAaIefSuppliedNumber4",
    "outGrpOutGrmCardCmsCardCardApplSn",
    "outGrpOutGrmCardCmsCardCardExpiryDate",
    "outGrpOutGrmCardCmsCardCardNumber",
    "outGrpOutGrmCardCmsCardCardSn",
    "outGrpOutGrmCardStatusCharSuppliedChar25",
    "outGrpOutGrmCardTypeCharSuppliedChar20",
    "outGrpOutGrmCustCustomerCDigit",
    "outGrpOutGrmCustCustomerCustId",
    "outGrpOutGrmPrftAccProfitsAccountAccountCd",
    "outGrpOutGrmPrftAccProfitsAccountAccountNumber",
    "outGrpOutGrmPrftAccProfitsAccountPrftSystem",
    "outGrpOutGrmPrftSystemCharSuppliedChar20",
    "outGrpOutGrmSelectIefSuppliedSelectChar"
})
public class CMS3604VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmAaIefSuppliedNumber4")
    protected short outGrpOutGrmAaIefSuppliedNumber4;
    @XmlElement(name = "OutGrpOutGrmCardCmsCardCardApplSn")
    protected double outGrpOutGrmCardCmsCardCardApplSn;
    @XmlElement(name = "OutGrpOutGrmCardCmsCardCardExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmCardCmsCardCardExpiryDate;
    @XmlElement(name = "OutGrpOutGrmCardCmsCardCardNumber")
    protected String outGrpOutGrmCardCmsCardCardNumber;
    @XmlElement(name = "OutGrpOutGrmCardCmsCardCardSn")
    protected double outGrpOutGrmCardCmsCardCardSn;
    @XmlElement(name = "OutGrpOutGrmCardStatusCharSuppliedChar25")
    protected String outGrpOutGrmCardStatusCharSuppliedChar25;
    @XmlElement(name = "OutGrpOutGrmCardTypeCharSuppliedChar20")
    protected String outGrpOutGrmCardTypeCharSuppliedChar20;
    @XmlElement(name = "OutGrpOutGrmCustCustomerCDigit")
    protected short outGrpOutGrmCustCustomerCDigit;
    @XmlElement(name = "OutGrpOutGrmCustCustomerCustId")
    protected int outGrpOutGrmCustCustomerCustId;
    @XmlElement(name = "OutGrpOutGrmPrftAccProfitsAccountAccountCd")
    protected short outGrpOutGrmPrftAccProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpOutGrmPrftAccProfitsAccountAccountNumber")
    protected String outGrpOutGrmPrftAccProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpOutGrmPrftAccProfitsAccountPrftSystem")
    protected short outGrpOutGrmPrftAccProfitsAccountPrftSystem;
    @XmlElement(name = "OutGrpOutGrmPrftSystemCharSuppliedChar20")
    protected String outGrpOutGrmPrftSystemCharSuppliedChar20;
    @XmlElement(name = "OutGrpOutGrmSelectIefSuppliedSelectChar")
    protected String outGrpOutGrmSelectIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpOutGrmAaIefSuppliedNumber4 property.
     * 
     */
    public short getOutGrpOutGrmAaIefSuppliedNumber4() {
        return outGrpOutGrmAaIefSuppliedNumber4;
    }

    /**
     * Sets the value of the outGrpOutGrmAaIefSuppliedNumber4 property.
     * 
     */
    public void setOutGrpOutGrmAaIefSuppliedNumber4(short value) {
        this.outGrpOutGrmAaIefSuppliedNumber4 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardCmsCardCardApplSn property.
     * 
     */
    public double getOutGrpOutGrmCardCmsCardCardApplSn() {
        return outGrpOutGrmCardCmsCardCardApplSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCardCmsCardCardApplSn property.
     * 
     */
    public void setOutGrpOutGrmCardCmsCardCardApplSn(double value) {
        this.outGrpOutGrmCardCmsCardCardApplSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardCmsCardCardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmCardCmsCardCardExpiryDate() {
        return outGrpOutGrmCardCmsCardCardExpiryDate;
    }

    /**
     * Sets the value of the outGrpOutGrmCardCmsCardCardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmCardCmsCardCardExpiryDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmCardCmsCardCardExpiryDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardCmsCardCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardCmsCardCardNumber() {
        return outGrpOutGrmCardCmsCardCardNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmCardCmsCardCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardCmsCardCardNumber(String value) {
        this.outGrpOutGrmCardCmsCardCardNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardCmsCardCardSn property.
     * 
     */
    public double getOutGrpOutGrmCardCmsCardCardSn() {
        return outGrpOutGrmCardCmsCardCardSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCardCmsCardCardSn property.
     * 
     */
    public void setOutGrpOutGrmCardCmsCardCardSn(double value) {
        this.outGrpOutGrmCardCmsCardCardSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardStatusCharSuppliedChar25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardStatusCharSuppliedChar25() {
        return outGrpOutGrmCardStatusCharSuppliedChar25;
    }

    /**
     * Sets the value of the outGrpOutGrmCardStatusCharSuppliedChar25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardStatusCharSuppliedChar25(String value) {
        this.outGrpOutGrmCardStatusCharSuppliedChar25 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardTypeCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardTypeCharSuppliedChar20() {
        return outGrpOutGrmCardTypeCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpOutGrmCardTypeCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardTypeCharSuppliedChar20(String value) {
        this.outGrpOutGrmCardTypeCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustCustomerCDigit property.
     * 
     */
    public short getOutGrpOutGrmCustCustomerCDigit() {
        return outGrpOutGrmCustCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpOutGrmCustCustomerCDigit property.
     * 
     */
    public void setOutGrpOutGrmCustCustomerCDigit(short value) {
        this.outGrpOutGrmCustCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustCustomerCustId property.
     * 
     */
    public int getOutGrpOutGrmCustCustomerCustId() {
        return outGrpOutGrmCustCustomerCustId;
    }

    /**
     * Sets the value of the outGrpOutGrmCustCustomerCustId property.
     * 
     */
    public void setOutGrpOutGrmCustCustomerCustId(int value) {
        this.outGrpOutGrmCustCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPrftAccProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpOutGrmPrftAccProfitsAccountAccountCd() {
        return outGrpOutGrmPrftAccProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpOutGrmPrftAccProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpOutGrmPrftAccProfitsAccountAccountCd(short value) {
        this.outGrpOutGrmPrftAccProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPrftAccProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPrftAccProfitsAccountAccountNumber() {
        return outGrpOutGrmPrftAccProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmPrftAccProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPrftAccProfitsAccountAccountNumber(String value) {
        this.outGrpOutGrmPrftAccProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPrftAccProfitsAccountPrftSystem property.
     * 
     */
    public short getOutGrpOutGrmPrftAccProfitsAccountPrftSystem() {
        return outGrpOutGrmPrftAccProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmPrftAccProfitsAccountPrftSystem property.
     * 
     */
    public void setOutGrpOutGrmPrftAccProfitsAccountPrftSystem(short value) {
        this.outGrpOutGrmPrftAccProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPrftSystemCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPrftSystemCharSuppliedChar20() {
        return outGrpOutGrmPrftSystemCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpOutGrmPrftSystemCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPrftSystemCharSuppliedChar20(String value) {
        this.outGrpOutGrmPrftSystemCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSelectIefSuppliedSelectChar() {
        return outGrpOutGrmSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpOutGrmSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSelectIefSuppliedSelectChar(String value) {
        this.outGrpOutGrmSelectIefSuppliedSelectChar = value;
    }

}
