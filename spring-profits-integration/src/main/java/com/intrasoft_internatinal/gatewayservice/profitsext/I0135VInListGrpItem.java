
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0135VInListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0135VInListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InListGrpInListGrmCardtypGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InListGrpInListGrmCardtypGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmCustCardInfoTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrpInListGrmCustCardInfoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrpInListGrmCustCardInfoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrpInListGrmCustCardInfoEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmCustCardInfoCardComnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmCustCardInfoCardRenewal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmCustCardInfoDisableReasonCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmDisreasGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InListGrpInListGrmDisreasGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0135VInListGrpItem", propOrder = {
    "inListGrpInListGrmCardtypGenericDetailSerialNum",
    "inListGrpInListGrmCardtypGenericDetailDescription",
    "inListGrpInListGrmCustCardInfoCardNo",
    "inListGrpInListGrmCustCardInfoTmstamp",
    "inListGrpInListGrmCustCardInfoStartDate",
    "inListGrpInListGrmCustCardInfoEndDate",
    "inListGrpInListGrmCustCardInfoEntryStatus",
    "inListGrpInListGrmCustCardInfoCardComnts",
    "inListGrpInListGrmCustCardInfoCardRenewal",
    "inListGrpInListGrmCustCardInfoDisableReasonCom",
    "inListGrpInListGrmDisreasGenericDetailSerialNum",
    "inListGrpInListGrmDisreasGenericDetailDescription",
    "inListGrpInListGrmIefSuppliedSelectChar",
    "inListGrpInListGrmIefSuppliedFlag"
})
public class I0135VInListGrpItem {

    @XmlElement(name = "InListGrpInListGrmCardtypGenericDetailSerialNum")
    protected int inListGrpInListGrmCardtypGenericDetailSerialNum;
    @XmlElement(name = "InListGrpInListGrmCardtypGenericDetailDescription")
    protected String inListGrpInListGrmCardtypGenericDetailDescription;
    @XmlElement(name = "InListGrpInListGrmCustCardInfoCardNo")
    protected String inListGrpInListGrmCustCardInfoCardNo;
    @XmlElement(name = "InListGrpInListGrmCustCardInfoTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrpInListGrmCustCardInfoTmstamp;
    @XmlElement(name = "InListGrpInListGrmCustCardInfoStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrpInListGrmCustCardInfoStartDate;
    @XmlElement(name = "InListGrpInListGrmCustCardInfoEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrpInListGrmCustCardInfoEndDate;
    @XmlElement(name = "InListGrpInListGrmCustCardInfoEntryStatus")
    protected String inListGrpInListGrmCustCardInfoEntryStatus;
    @XmlElement(name = "InListGrpInListGrmCustCardInfoCardComnts")
    protected String inListGrpInListGrmCustCardInfoCardComnts;
    @XmlElement(name = "InListGrpInListGrmCustCardInfoCardRenewal")
    protected String inListGrpInListGrmCustCardInfoCardRenewal;
    @XmlElement(name = "InListGrpInListGrmCustCardInfoDisableReasonCom")
    protected String inListGrpInListGrmCustCardInfoDisableReasonCom;
    @XmlElement(name = "InListGrpInListGrmDisreasGenericDetailSerialNum")
    protected int inListGrpInListGrmDisreasGenericDetailSerialNum;
    @XmlElement(name = "InListGrpInListGrmDisreasGenericDetailDescription")
    protected String inListGrpInListGrmDisreasGenericDetailDescription;
    @XmlElement(name = "InListGrpInListGrmIefSuppliedSelectChar")
    protected String inListGrpInListGrmIefSuppliedSelectChar;
    @XmlElement(name = "InListGrpInListGrmIefSuppliedFlag")
    protected String inListGrpInListGrmIefSuppliedFlag;

    /**
     * Gets the value of the inListGrpInListGrmCardtypGenericDetailSerialNum property.
     * 
     */
    public int getInListGrpInListGrmCardtypGenericDetailSerialNum() {
        return inListGrpInListGrmCardtypGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inListGrpInListGrmCardtypGenericDetailSerialNum property.
     * 
     */
    public void setInListGrpInListGrmCardtypGenericDetailSerialNum(int value) {
        this.inListGrpInListGrmCardtypGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCardtypGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmCardtypGenericDetailDescription() {
        return inListGrpInListGrmCardtypGenericDetailDescription;
    }

    /**
     * Sets the value of the inListGrpInListGrmCardtypGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmCardtypGenericDetailDescription(String value) {
        this.inListGrpInListGrmCardtypGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustCardInfoCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmCustCardInfoCardNo() {
        return inListGrpInListGrmCustCardInfoCardNo;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustCardInfoCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmCustCardInfoCardNo(String value) {
        this.inListGrpInListGrmCustCardInfoCardNo = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustCardInfoTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrpInListGrmCustCardInfoTmstamp() {
        return inListGrpInListGrmCustCardInfoTmstamp;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustCardInfoTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrpInListGrmCustCardInfoTmstamp(XMLGregorianCalendar value) {
        this.inListGrpInListGrmCustCardInfoTmstamp = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustCardInfoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrpInListGrmCustCardInfoStartDate() {
        return inListGrpInListGrmCustCardInfoStartDate;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustCardInfoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrpInListGrmCustCardInfoStartDate(XMLGregorianCalendar value) {
        this.inListGrpInListGrmCustCardInfoStartDate = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustCardInfoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrpInListGrmCustCardInfoEndDate() {
        return inListGrpInListGrmCustCardInfoEndDate;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustCardInfoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrpInListGrmCustCardInfoEndDate(XMLGregorianCalendar value) {
        this.inListGrpInListGrmCustCardInfoEndDate = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustCardInfoEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmCustCardInfoEntryStatus() {
        return inListGrpInListGrmCustCardInfoEntryStatus;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustCardInfoEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmCustCardInfoEntryStatus(String value) {
        this.inListGrpInListGrmCustCardInfoEntryStatus = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustCardInfoCardComnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmCustCardInfoCardComnts() {
        return inListGrpInListGrmCustCardInfoCardComnts;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustCardInfoCardComnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmCustCardInfoCardComnts(String value) {
        this.inListGrpInListGrmCustCardInfoCardComnts = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustCardInfoCardRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmCustCardInfoCardRenewal() {
        return inListGrpInListGrmCustCardInfoCardRenewal;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustCardInfoCardRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmCustCardInfoCardRenewal(String value) {
        this.inListGrpInListGrmCustCardInfoCardRenewal = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustCardInfoDisableReasonCom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmCustCardInfoDisableReasonCom() {
        return inListGrpInListGrmCustCardInfoDisableReasonCom;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustCardInfoDisableReasonCom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmCustCardInfoDisableReasonCom(String value) {
        this.inListGrpInListGrmCustCardInfoDisableReasonCom = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmDisreasGenericDetailSerialNum property.
     * 
     */
    public int getInListGrpInListGrmDisreasGenericDetailSerialNum() {
        return inListGrpInListGrmDisreasGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inListGrpInListGrmDisreasGenericDetailSerialNum property.
     * 
     */
    public void setInListGrpInListGrmDisreasGenericDetailSerialNum(int value) {
        this.inListGrpInListGrmDisreasGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmDisreasGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmDisreasGenericDetailDescription() {
        return inListGrpInListGrmDisreasGenericDetailDescription;
    }

    /**
     * Sets the value of the inListGrpInListGrmDisreasGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmDisreasGenericDetailDescription(String value) {
        this.inListGrpInListGrmDisreasGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmIefSuppliedSelectChar() {
        return inListGrpInListGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inListGrpInListGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmIefSuppliedSelectChar(String value) {
        this.inListGrpInListGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmIefSuppliedFlag() {
        return inListGrpInListGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the inListGrpInListGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmIefSuppliedFlag(String value) {
        this.inListGrpInListGrmIefSuppliedFlag = value;
    }

}
