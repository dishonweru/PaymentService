
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T1461VLgGuarantorMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1461VLgGuarantorMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBenefCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgBeneficiaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgBeneficiaryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryProfession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiarySurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgBeneficiaryZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1461VLgGuarantorMaintenanceImport", propOrder = {
    "command",
    "inBankParametersCurrTrxDate",
    "inBenefCategoryGenericDetailSerialNum",
    "inDistrChannelIdChannel",
    "inLgBeneficiaryAddress",
    "inLgBeneficiaryAddress2",
    "inLgBeneficiaryAfmNo",
    "inLgBeneficiaryCity",
    "inLgBeneficiaryCode",
    "inLgBeneficiaryComments",
    "inLgBeneficiaryEntryStatus",
    "inLgBeneficiaryIdNo",
    "inLgBeneficiaryName",
    "inLgBeneficiaryProfession",
    "inLgBeneficiaryRegion",
    "inLgBeneficiarySurname",
    "inLgBeneficiaryTelephone",
    "inLgBeneficiaryType",
    "inLgBeneficiaryZipCode",
    "inTerminalTerminalNumber",
    "inUnitCode",
    "inUsrCode"
})
public class T1461VLgGuarantorMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBankParametersCurrTrxDate;
    @XmlElement(name = "InBenefCategoryGenericDetailSerialNum")
    protected int inBenefCategoryGenericDetailSerialNum;
    @XmlElement(name = "InDistrChannelIdChannel")
    protected int inDistrChannelIdChannel;
    @XmlElement(name = "InLgBeneficiaryAddress")
    protected String inLgBeneficiaryAddress;
    @XmlElement(name = "InLgBeneficiaryAddress2")
    protected String inLgBeneficiaryAddress2;
    @XmlElement(name = "InLgBeneficiaryAfmNo")
    protected String inLgBeneficiaryAfmNo;
    @XmlElement(name = "InLgBeneficiaryCity")
    protected String inLgBeneficiaryCity;
    @XmlElement(name = "InLgBeneficiaryCode")
    protected int inLgBeneficiaryCode;
    @XmlElement(name = "InLgBeneficiaryComments")
    protected String inLgBeneficiaryComments;
    @XmlElement(name = "InLgBeneficiaryEntryStatus")
    protected String inLgBeneficiaryEntryStatus;
    @XmlElement(name = "InLgBeneficiaryIdNo")
    protected String inLgBeneficiaryIdNo;
    @XmlElement(name = "InLgBeneficiaryName")
    protected String inLgBeneficiaryName;
    @XmlElement(name = "InLgBeneficiaryProfession")
    protected String inLgBeneficiaryProfession;
    @XmlElement(name = "InLgBeneficiaryRegion")
    protected String inLgBeneficiaryRegion;
    @XmlElement(name = "InLgBeneficiarySurname")
    protected String inLgBeneficiarySurname;
    @XmlElement(name = "InLgBeneficiaryTelephone")
    protected String inLgBeneficiaryTelephone;
    @XmlElement(name = "InLgBeneficiaryType")
    protected String inLgBeneficiaryType;
    @XmlElement(name = "InLgBeneficiaryZipCode")
    protected String inLgBeneficiaryZipCode;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;
    @XmlElement(name = "InUnitCode")
    protected int inUnitCode;
    @XmlElement(name = "InUsrCode")
    protected String inUsrCode;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBankParametersCurrTrxDate() {
        return inBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the inBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.inBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the inBenefCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInBenefCategoryGenericDetailSerialNum() {
        return inBenefCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBenefCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInBenefCategoryGenericDetailSerialNum(int value) {
        this.inBenefCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inDistrChannelIdChannel property.
     * 
     */
    public int getInDistrChannelIdChannel() {
        return inDistrChannelIdChannel;
    }

    /**
     * Sets the value of the inDistrChannelIdChannel property.
     * 
     */
    public void setInDistrChannelIdChannel(int value) {
        this.inDistrChannelIdChannel = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryAddress() {
        return inLgBeneficiaryAddress;
    }

    /**
     * Sets the value of the inLgBeneficiaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryAddress(String value) {
        this.inLgBeneficiaryAddress = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryAddress2() {
        return inLgBeneficiaryAddress2;
    }

    /**
     * Sets the value of the inLgBeneficiaryAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryAddress2(String value) {
        this.inLgBeneficiaryAddress2 = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryAfmNo() {
        return inLgBeneficiaryAfmNo;
    }

    /**
     * Sets the value of the inLgBeneficiaryAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryAfmNo(String value) {
        this.inLgBeneficiaryAfmNo = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryCity() {
        return inLgBeneficiaryCity;
    }

    /**
     * Sets the value of the inLgBeneficiaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryCity(String value) {
        this.inLgBeneficiaryCity = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryCode property.
     * 
     */
    public int getInLgBeneficiaryCode() {
        return inLgBeneficiaryCode;
    }

    /**
     * Sets the value of the inLgBeneficiaryCode property.
     * 
     */
    public void setInLgBeneficiaryCode(int value) {
        this.inLgBeneficiaryCode = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryComments() {
        return inLgBeneficiaryComments;
    }

    /**
     * Sets the value of the inLgBeneficiaryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryComments(String value) {
        this.inLgBeneficiaryComments = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryEntryStatus() {
        return inLgBeneficiaryEntryStatus;
    }

    /**
     * Sets the value of the inLgBeneficiaryEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryEntryStatus(String value) {
        this.inLgBeneficiaryEntryStatus = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryIdNo() {
        return inLgBeneficiaryIdNo;
    }

    /**
     * Sets the value of the inLgBeneficiaryIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryIdNo(String value) {
        this.inLgBeneficiaryIdNo = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryName() {
        return inLgBeneficiaryName;
    }

    /**
     * Sets the value of the inLgBeneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryName(String value) {
        this.inLgBeneficiaryName = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryProfession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryProfession() {
        return inLgBeneficiaryProfession;
    }

    /**
     * Sets the value of the inLgBeneficiaryProfession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryProfession(String value) {
        this.inLgBeneficiaryProfession = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryRegion() {
        return inLgBeneficiaryRegion;
    }

    /**
     * Sets the value of the inLgBeneficiaryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryRegion(String value) {
        this.inLgBeneficiaryRegion = value;
    }

    /**
     * Gets the value of the inLgBeneficiarySurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiarySurname() {
        return inLgBeneficiarySurname;
    }

    /**
     * Sets the value of the inLgBeneficiarySurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiarySurname(String value) {
        this.inLgBeneficiarySurname = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryTelephone() {
        return inLgBeneficiaryTelephone;
    }

    /**
     * Sets the value of the inLgBeneficiaryTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryTelephone(String value) {
        this.inLgBeneficiaryTelephone = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryType() {
        return inLgBeneficiaryType;
    }

    /**
     * Sets the value of the inLgBeneficiaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryType(String value) {
        this.inLgBeneficiaryType = value;
    }

    /**
     * Gets the value of the inLgBeneficiaryZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgBeneficiaryZipCode() {
        return inLgBeneficiaryZipCode;
    }

    /**
     * Sets the value of the inLgBeneficiaryZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgBeneficiaryZipCode(String value) {
        this.inLgBeneficiaryZipCode = value;
    }

    /**
     * Gets the value of the inTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTerminalTerminalNumber() {
        return inTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTerminalTerminalNumber(String value) {
        this.inTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inUnitCode property.
     * 
     */
    public int getInUnitCode() {
        return inUnitCode;
    }

    /**
     * Sets the value of the inUnitCode property.
     * 
     */
    public void setInUnitCode(int value) {
        this.inUnitCode = value;
    }

    /**
     * Gets the value of the inUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrCode() {
        return inUsrCode;
    }

    /**
     * Sets the value of the inUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrCode(String value) {
        this.inUsrCode = value;
    }

}
