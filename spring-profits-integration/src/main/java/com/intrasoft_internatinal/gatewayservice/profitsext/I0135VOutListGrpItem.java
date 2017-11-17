
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0135VOutListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0135VOutListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OnListGrpOutListGrmCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnListGrpOutListGrmCustCardInfoTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OnListGrpOutListGrmCustCardInfoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OnListGrpOutListGrmCustCardInfoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OnListGrpOutListGrmCustCardInfoEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnListGrpOutListGrmCustCardInfoCardComnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnListGrpOutListGrmCustCardInfoCardRenewal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnListGrpOutListGrmCustCardInfoDisableReasonCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnListGrpOutListGrmCardtypGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OnListGrpOutListGrmCardtypGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnListGrpOutListGrmDisreasGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OnListGrpOutListGrmDisreasGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnListGrpOutListGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnListGrpOutListGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnListGrpOutListGrmIefSuppliedNum4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0135VOutListGrpItem", propOrder = {
    "onListGrpOutListGrmCustCardInfoCardNo",
    "onListGrpOutListGrmCustCardInfoTmstamp",
    "onListGrpOutListGrmCustCardInfoStartDate",
    "onListGrpOutListGrmCustCardInfoEndDate",
    "onListGrpOutListGrmCustCardInfoEntryStatus",
    "onListGrpOutListGrmCustCardInfoCardComnts",
    "onListGrpOutListGrmCustCardInfoCardRenewal",
    "onListGrpOutListGrmCustCardInfoDisableReasonCom",
    "onListGrpOutListGrmCardtypGenericDetailSerialNum",
    "onListGrpOutListGrmCardtypGenericDetailDescription",
    "onListGrpOutListGrmDisreasGenericDetailSerialNum",
    "onListGrpOutListGrmDisreasGenericDetailDescription",
    "onListGrpOutListGrmIefSuppliedSelectChar",
    "onListGrpOutListGrmIefSuppliedFlag",
    "onListGrpOutListGrmIefSuppliedNum4"
})
public class I0135VOutListGrpItem {

    @XmlElement(name = "OnListGrpOutListGrmCustCardInfoCardNo")
    protected String onListGrpOutListGrmCustCardInfoCardNo;
    @XmlElement(name = "OnListGrpOutListGrmCustCardInfoTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onListGrpOutListGrmCustCardInfoTmstamp;
    @XmlElement(name = "OnListGrpOutListGrmCustCardInfoStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onListGrpOutListGrmCustCardInfoStartDate;
    @XmlElement(name = "OnListGrpOutListGrmCustCardInfoEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onListGrpOutListGrmCustCardInfoEndDate;
    @XmlElement(name = "OnListGrpOutListGrmCustCardInfoEntryStatus")
    protected String onListGrpOutListGrmCustCardInfoEntryStatus;
    @XmlElement(name = "OnListGrpOutListGrmCustCardInfoCardComnts")
    protected String onListGrpOutListGrmCustCardInfoCardComnts;
    @XmlElement(name = "OnListGrpOutListGrmCustCardInfoCardRenewal")
    protected String onListGrpOutListGrmCustCardInfoCardRenewal;
    @XmlElement(name = "OnListGrpOutListGrmCustCardInfoDisableReasonCom")
    protected String onListGrpOutListGrmCustCardInfoDisableReasonCom;
    @XmlElement(name = "OnListGrpOutListGrmCardtypGenericDetailSerialNum")
    protected int onListGrpOutListGrmCardtypGenericDetailSerialNum;
    @XmlElement(name = "OnListGrpOutListGrmCardtypGenericDetailDescription")
    protected String onListGrpOutListGrmCardtypGenericDetailDescription;
    @XmlElement(name = "OnListGrpOutListGrmDisreasGenericDetailSerialNum")
    protected int onListGrpOutListGrmDisreasGenericDetailSerialNum;
    @XmlElement(name = "OnListGrpOutListGrmDisreasGenericDetailDescription")
    protected String onListGrpOutListGrmDisreasGenericDetailDescription;
    @XmlElement(name = "OnListGrpOutListGrmIefSuppliedSelectChar")
    protected String onListGrpOutListGrmIefSuppliedSelectChar;
    @XmlElement(name = "OnListGrpOutListGrmIefSuppliedFlag")
    protected String onListGrpOutListGrmIefSuppliedFlag;
    @XmlElement(name = "OnListGrpOutListGrmIefSuppliedNum4")
    protected short onListGrpOutListGrmIefSuppliedNum4;

    /**
     * Gets the value of the onListGrpOutListGrmCustCardInfoCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnListGrpOutListGrmCustCardInfoCardNo() {
        return onListGrpOutListGrmCustCardInfoCardNo;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCustCardInfoCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnListGrpOutListGrmCustCardInfoCardNo(String value) {
        this.onListGrpOutListGrmCustCardInfoCardNo = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmCustCardInfoTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnListGrpOutListGrmCustCardInfoTmstamp() {
        return onListGrpOutListGrmCustCardInfoTmstamp;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCustCardInfoTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnListGrpOutListGrmCustCardInfoTmstamp(XMLGregorianCalendar value) {
        this.onListGrpOutListGrmCustCardInfoTmstamp = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmCustCardInfoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnListGrpOutListGrmCustCardInfoStartDate() {
        return onListGrpOutListGrmCustCardInfoStartDate;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCustCardInfoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnListGrpOutListGrmCustCardInfoStartDate(XMLGregorianCalendar value) {
        this.onListGrpOutListGrmCustCardInfoStartDate = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmCustCardInfoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnListGrpOutListGrmCustCardInfoEndDate() {
        return onListGrpOutListGrmCustCardInfoEndDate;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCustCardInfoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnListGrpOutListGrmCustCardInfoEndDate(XMLGregorianCalendar value) {
        this.onListGrpOutListGrmCustCardInfoEndDate = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmCustCardInfoEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnListGrpOutListGrmCustCardInfoEntryStatus() {
        return onListGrpOutListGrmCustCardInfoEntryStatus;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCustCardInfoEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnListGrpOutListGrmCustCardInfoEntryStatus(String value) {
        this.onListGrpOutListGrmCustCardInfoEntryStatus = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmCustCardInfoCardComnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnListGrpOutListGrmCustCardInfoCardComnts() {
        return onListGrpOutListGrmCustCardInfoCardComnts;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCustCardInfoCardComnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnListGrpOutListGrmCustCardInfoCardComnts(String value) {
        this.onListGrpOutListGrmCustCardInfoCardComnts = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmCustCardInfoCardRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnListGrpOutListGrmCustCardInfoCardRenewal() {
        return onListGrpOutListGrmCustCardInfoCardRenewal;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCustCardInfoCardRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnListGrpOutListGrmCustCardInfoCardRenewal(String value) {
        this.onListGrpOutListGrmCustCardInfoCardRenewal = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmCustCardInfoDisableReasonCom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnListGrpOutListGrmCustCardInfoDisableReasonCom() {
        return onListGrpOutListGrmCustCardInfoDisableReasonCom;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCustCardInfoDisableReasonCom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnListGrpOutListGrmCustCardInfoDisableReasonCom(String value) {
        this.onListGrpOutListGrmCustCardInfoDisableReasonCom = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmCardtypGenericDetailSerialNum property.
     * 
     */
    public int getOnListGrpOutListGrmCardtypGenericDetailSerialNum() {
        return onListGrpOutListGrmCardtypGenericDetailSerialNum;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCardtypGenericDetailSerialNum property.
     * 
     */
    public void setOnListGrpOutListGrmCardtypGenericDetailSerialNum(int value) {
        this.onListGrpOutListGrmCardtypGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmCardtypGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnListGrpOutListGrmCardtypGenericDetailDescription() {
        return onListGrpOutListGrmCardtypGenericDetailDescription;
    }

    /**
     * Sets the value of the onListGrpOutListGrmCardtypGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnListGrpOutListGrmCardtypGenericDetailDescription(String value) {
        this.onListGrpOutListGrmCardtypGenericDetailDescription = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmDisreasGenericDetailSerialNum property.
     * 
     */
    public int getOnListGrpOutListGrmDisreasGenericDetailSerialNum() {
        return onListGrpOutListGrmDisreasGenericDetailSerialNum;
    }

    /**
     * Sets the value of the onListGrpOutListGrmDisreasGenericDetailSerialNum property.
     * 
     */
    public void setOnListGrpOutListGrmDisreasGenericDetailSerialNum(int value) {
        this.onListGrpOutListGrmDisreasGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmDisreasGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnListGrpOutListGrmDisreasGenericDetailDescription() {
        return onListGrpOutListGrmDisreasGenericDetailDescription;
    }

    /**
     * Sets the value of the onListGrpOutListGrmDisreasGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnListGrpOutListGrmDisreasGenericDetailDescription(String value) {
        this.onListGrpOutListGrmDisreasGenericDetailDescription = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnListGrpOutListGrmIefSuppliedSelectChar() {
        return onListGrpOutListGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the onListGrpOutListGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnListGrpOutListGrmIefSuppliedSelectChar(String value) {
        this.onListGrpOutListGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnListGrpOutListGrmIefSuppliedFlag() {
        return onListGrpOutListGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the onListGrpOutListGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnListGrpOutListGrmIefSuppliedFlag(String value) {
        this.onListGrpOutListGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the onListGrpOutListGrmIefSuppliedNum4 property.
     * 
     */
    public short getOnListGrpOutListGrmIefSuppliedNum4() {
        return onListGrpOutListGrmIefSuppliedNum4;
    }

    /**
     * Sets the value of the onListGrpOutListGrmIefSuppliedNum4 property.
     * 
     */
    public void setOnListGrpOutListGrmIefSuppliedNum4(short value) {
        this.onListGrpOutListGrmIefSuppliedNum4 = value;
    }

}
