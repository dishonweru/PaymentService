
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGrpApplicDetailsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpApplicDetailsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDDetailSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDBenefAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDBenefAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDBenefBankSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDBenefComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpApplicDetailsInGrmCustomerApplicDText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpApplicDetailsItem", propOrder = {
    "inGrpApplicDetailsInGrmCustomerApplicDUnitCode",
    "inGrpApplicDetailsInGrmCustomerApplicDApplicationId",
    "inGrpApplicDetailsInGrmCustomerApplicDCustId",
    "inGrpApplicDetailsInGrmCustomerApplicDDetailSn",
    "inGrpApplicDetailsInGrmCustomerApplicDBenefName",
    "inGrpApplicDetailsInGrmCustomerApplicDBenefAccount",
    "inGrpApplicDetailsInGrmCustomerApplicDBenefAmount",
    "inGrpApplicDetailsInGrmCustomerApplicDBenefBankSn",
    "inGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc",
    "inGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn",
    "inGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc",
    "inGrpApplicDetailsInGrmCustomerApplicDBenefComments",
    "inGrpApplicDetailsInGrmCustomerApplicDDate1",
    "inGrpApplicDetailsInGrmCustomerApplicDDate2",
    "inGrpApplicDetailsInGrmCustomerApplicDDate3",
    "inGrpApplicDetailsInGrmCustomerApplicDAmount1",
    "inGrpApplicDetailsInGrmCustomerApplicDAmount2",
    "inGrpApplicDetailsInGrmCustomerApplicDAmount3",
    "inGrpApplicDetailsInGrmCustomerApplicDText1",
    "inGrpApplicDetailsInGrmCustomerApplicDText2",
    "inGrpApplicDetailsInGrmCustomerApplicDText3",
    "inGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar"
})
public class InGrpApplicDetailsItem {

    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDUnitCode")
    protected int inGrpApplicDetailsInGrmCustomerApplicDUnitCode;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDApplicationId")
    protected String inGrpApplicDetailsInGrmCustomerApplicDApplicationId;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDCustId")
    protected int inGrpApplicDetailsInGrmCustomerApplicDCustId;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDDetailSn")
    protected int inGrpApplicDetailsInGrmCustomerApplicDDetailSn;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDBenefName")
    protected String inGrpApplicDetailsInGrmCustomerApplicDBenefName;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDBenefAccount")
    protected String inGrpApplicDetailsInGrmCustomerApplicDBenefAccount;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDBenefAmount", required = true)
    protected BigDecimal inGrpApplicDetailsInGrmCustomerApplicDBenefAmount;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDBenefBankSn")
    protected int inGrpApplicDetailsInGrmCustomerApplicDBenefBankSn;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc")
    protected String inGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn")
    protected int inGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc")
    protected String inGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDBenefComments")
    protected String inGrpApplicDetailsInGrmCustomerApplicDBenefComments;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpApplicDetailsInGrmCustomerApplicDDate1;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpApplicDetailsInGrmCustomerApplicDDate2;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpApplicDetailsInGrmCustomerApplicDDate3;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDAmount1", required = true)
    protected BigDecimal inGrpApplicDetailsInGrmCustomerApplicDAmount1;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDAmount2", required = true)
    protected BigDecimal inGrpApplicDetailsInGrmCustomerApplicDAmount2;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDAmount3", required = true)
    protected BigDecimal inGrpApplicDetailsInGrmCustomerApplicDAmount3;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDText1")
    protected String inGrpApplicDetailsInGrmCustomerApplicDText1;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDText2")
    protected String inGrpApplicDetailsInGrmCustomerApplicDText2;
    @XmlElement(name = "InGrpApplicDetailsInGrmCustomerApplicDText3")
    protected String inGrpApplicDetailsInGrmCustomerApplicDText3;
    @XmlElement(name = "InGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar")
    protected String inGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDUnitCode property.
     * 
     */
    public int getInGrpApplicDetailsInGrmCustomerApplicDUnitCode() {
        return inGrpApplicDetailsInGrmCustomerApplicDUnitCode;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDUnitCode property.
     * 
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDUnitCode(int value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDUnitCode = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmCustomerApplicDApplicationId() {
        return inGrpApplicDetailsInGrmCustomerApplicDApplicationId;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDApplicationId(String value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDApplicationId = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDCustId property.
     * 
     */
    public int getInGrpApplicDetailsInGrmCustomerApplicDCustId() {
        return inGrpApplicDetailsInGrmCustomerApplicDCustId;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDCustId property.
     * 
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDCustId(int value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDCustId = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDDetailSn property.
     * 
     */
    public int getInGrpApplicDetailsInGrmCustomerApplicDDetailSn() {
        return inGrpApplicDetailsInGrmCustomerApplicDDetailSn;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDDetailSn property.
     * 
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDDetailSn(int value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDDetailSn = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmCustomerApplicDBenefName() {
        return inGrpApplicDetailsInGrmCustomerApplicDBenefName;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDBenefName(String value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDBenefName = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmCustomerApplicDBenefAccount() {
        return inGrpApplicDetailsInGrmCustomerApplicDBenefAccount;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDBenefAccount(String value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDBenefAccount = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpApplicDetailsInGrmCustomerApplicDBenefAmount() {
        return inGrpApplicDetailsInGrmCustomerApplicDBenefAmount;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDBenefAmount(BigDecimal value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDBenefAmount = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefBankSn property.
     * 
     */
    public int getInGrpApplicDetailsInGrmCustomerApplicDBenefBankSn() {
        return inGrpApplicDetailsInGrmCustomerApplicDBenefBankSn;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefBankSn property.
     * 
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDBenefBankSn(int value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDBenefBankSn = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc() {
        return inGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc(String value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDBenefBankDesc = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn property.
     * 
     */
    public int getInGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn() {
        return inGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn property.
     * 
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn(int value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDBenefBranchSn = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc() {
        return inGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc(String value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDBenefBranchDesc = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmCustomerApplicDBenefComments() {
        return inGrpApplicDetailsInGrmCustomerApplicDBenefComments;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDBenefComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDBenefComments(String value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDBenefComments = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpApplicDetailsInGrmCustomerApplicDDate1() {
        return inGrpApplicDetailsInGrmCustomerApplicDDate1;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDDate1(XMLGregorianCalendar value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDDate1 = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpApplicDetailsInGrmCustomerApplicDDate2() {
        return inGrpApplicDetailsInGrmCustomerApplicDDate2;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDDate2(XMLGregorianCalendar value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDDate2 = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpApplicDetailsInGrmCustomerApplicDDate3() {
        return inGrpApplicDetailsInGrmCustomerApplicDDate3;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDDate3(XMLGregorianCalendar value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDDate3 = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpApplicDetailsInGrmCustomerApplicDAmount1() {
        return inGrpApplicDetailsInGrmCustomerApplicDAmount1;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDAmount1(BigDecimal value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDAmount1 = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpApplicDetailsInGrmCustomerApplicDAmount2() {
        return inGrpApplicDetailsInGrmCustomerApplicDAmount2;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDAmount2(BigDecimal value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDAmount2 = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpApplicDetailsInGrmCustomerApplicDAmount3() {
        return inGrpApplicDetailsInGrmCustomerApplicDAmount3;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDAmount3(BigDecimal value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDAmount3 = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmCustomerApplicDText1() {
        return inGrpApplicDetailsInGrmCustomerApplicDText1;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDText1(String value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDText1 = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmCustomerApplicDText2() {
        return inGrpApplicDetailsInGrmCustomerApplicDText2;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDText2(String value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDText2 = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmCustomerApplicDText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmCustomerApplicDText3() {
        return inGrpApplicDetailsInGrmCustomerApplicDText3;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmCustomerApplicDText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmCustomerApplicDText3(String value) {
        this.inGrpApplicDetailsInGrmCustomerApplicDText3 = value;
    }

    /**
     * Gets the value of the inGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar() {
        return inGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar(String value) {
        this.inGrpApplicDetailsInGrmSelectionIefSuppliedSelectChar = value;
    }

}
