
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpApplicDetailsListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpApplicDetailsListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDDetailSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDBenefAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDBenefAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDBenefComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmCustomerApplicDText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpApplicDetailsListItem", propOrder = {
    "outGrpApplicDetailsOutGrmCustomerApplicDUnitCode",
    "outGrpApplicDetailsOutGrmCustomerApplicDApplicationId",
    "outGrpApplicDetailsOutGrmCustomerApplicDCustId",
    "outGrpApplicDetailsOutGrmCustomerApplicDDetailSn",
    "outGrpApplicDetailsOutGrmCustomerApplicDBenefName",
    "outGrpApplicDetailsOutGrmCustomerApplicDBenefAccount",
    "outGrpApplicDetailsOutGrmCustomerApplicDBenefAmount",
    "outGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn",
    "outGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc",
    "outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn",
    "outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc",
    "outGrpApplicDetailsOutGrmCustomerApplicDBenefComments",
    "outGrpApplicDetailsOutGrmCustomerApplicDDate1",
    "outGrpApplicDetailsOutGrmCustomerApplicDDate2",
    "outGrpApplicDetailsOutGrmCustomerApplicDDate3",
    "outGrpApplicDetailsOutGrmCustomerApplicDAmount1",
    "outGrpApplicDetailsOutGrmCustomerApplicDAmount2",
    "outGrpApplicDetailsOutGrmCustomerApplicDAmount3",
    "outGrpApplicDetailsOutGrmCustomerApplicDText1",
    "outGrpApplicDetailsOutGrmCustomerApplicDText2",
    "outGrpApplicDetailsOutGrmCustomerApplicDText3",
    "outGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar"
})
public class OutGrpApplicDetailsListItem {

    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDUnitCode")
    protected int outGrpApplicDetailsOutGrmCustomerApplicDUnitCode;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDApplicationId")
    protected String outGrpApplicDetailsOutGrmCustomerApplicDApplicationId;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDCustId")
    protected int outGrpApplicDetailsOutGrmCustomerApplicDCustId;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDDetailSn")
    protected int outGrpApplicDetailsOutGrmCustomerApplicDDetailSn;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDBenefName")
    protected String outGrpApplicDetailsOutGrmCustomerApplicDBenefName;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDBenefAccount")
    protected String outGrpApplicDetailsOutGrmCustomerApplicDBenefAccount;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDBenefAmount", required = true)
    protected BigDecimal outGrpApplicDetailsOutGrmCustomerApplicDBenefAmount;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn")
    protected int outGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc")
    protected String outGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn")
    protected int outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc")
    protected String outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDBenefComments")
    protected String outGrpApplicDetailsOutGrmCustomerApplicDBenefComments;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpApplicDetailsOutGrmCustomerApplicDDate1;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpApplicDetailsOutGrmCustomerApplicDDate2;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpApplicDetailsOutGrmCustomerApplicDDate3;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDAmount1", required = true)
    protected BigDecimal outGrpApplicDetailsOutGrmCustomerApplicDAmount1;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDAmount2", required = true)
    protected BigDecimal outGrpApplicDetailsOutGrmCustomerApplicDAmount2;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDAmount3", required = true)
    protected BigDecimal outGrpApplicDetailsOutGrmCustomerApplicDAmount3;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDText1")
    protected String outGrpApplicDetailsOutGrmCustomerApplicDText1;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDText2")
    protected String outGrpApplicDetailsOutGrmCustomerApplicDText2;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmCustomerApplicDText3")
    protected String outGrpApplicDetailsOutGrmCustomerApplicDText3;
    @XmlElement(name = "OutGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar")
    protected String outGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDUnitCode property.
     * 
     */
    public int getOutGrpApplicDetailsOutGrmCustomerApplicDUnitCode() {
        return outGrpApplicDetailsOutGrmCustomerApplicDUnitCode;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDUnitCode property.
     * 
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDUnitCode(int value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDUnitCode = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmCustomerApplicDApplicationId() {
        return outGrpApplicDetailsOutGrmCustomerApplicDApplicationId;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDApplicationId(String value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDApplicationId = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDCustId property.
     * 
     */
    public int getOutGrpApplicDetailsOutGrmCustomerApplicDCustId() {
        return outGrpApplicDetailsOutGrmCustomerApplicDCustId;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDCustId property.
     * 
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDCustId(int value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDCustId = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDDetailSn property.
     * 
     */
    public int getOutGrpApplicDetailsOutGrmCustomerApplicDDetailSn() {
        return outGrpApplicDetailsOutGrmCustomerApplicDDetailSn;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDDetailSn property.
     * 
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDDetailSn(int value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDDetailSn = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmCustomerApplicDBenefName() {
        return outGrpApplicDetailsOutGrmCustomerApplicDBenefName;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDBenefName(String value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDBenefName = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmCustomerApplicDBenefAccount() {
        return outGrpApplicDetailsOutGrmCustomerApplicDBenefAccount;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDBenefAccount(String value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDBenefAccount = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpApplicDetailsOutGrmCustomerApplicDBenefAmount() {
        return outGrpApplicDetailsOutGrmCustomerApplicDBenefAmount;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDBenefAmount(BigDecimal value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDBenefAmount = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn property.
     * 
     */
    public int getOutGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn() {
        return outGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn property.
     * 
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn(int value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDBenefBankSn = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc() {
        return outGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc(String value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDBenefBankDesc = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn property.
     * 
     */
    public int getOutGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn() {
        return outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn property.
     * 
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn(int value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchSn = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc() {
        return outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc(String value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDBenefBranchDesc = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmCustomerApplicDBenefComments() {
        return outGrpApplicDetailsOutGrmCustomerApplicDBenefComments;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDBenefComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDBenefComments(String value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDBenefComments = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpApplicDetailsOutGrmCustomerApplicDDate1() {
        return outGrpApplicDetailsOutGrmCustomerApplicDDate1;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDDate1(XMLGregorianCalendar value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDDate1 = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpApplicDetailsOutGrmCustomerApplicDDate2() {
        return outGrpApplicDetailsOutGrmCustomerApplicDDate2;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDDate2(XMLGregorianCalendar value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDDate2 = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpApplicDetailsOutGrmCustomerApplicDDate3() {
        return outGrpApplicDetailsOutGrmCustomerApplicDDate3;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDDate3(XMLGregorianCalendar value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDDate3 = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpApplicDetailsOutGrmCustomerApplicDAmount1() {
        return outGrpApplicDetailsOutGrmCustomerApplicDAmount1;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDAmount1(BigDecimal value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDAmount1 = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpApplicDetailsOutGrmCustomerApplicDAmount2() {
        return outGrpApplicDetailsOutGrmCustomerApplicDAmount2;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDAmount2(BigDecimal value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDAmount2 = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpApplicDetailsOutGrmCustomerApplicDAmount3() {
        return outGrpApplicDetailsOutGrmCustomerApplicDAmount3;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDAmount3(BigDecimal value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDAmount3 = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmCustomerApplicDText1() {
        return outGrpApplicDetailsOutGrmCustomerApplicDText1;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDText1(String value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDText1 = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmCustomerApplicDText2() {
        return outGrpApplicDetailsOutGrmCustomerApplicDText2;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDText2(String value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDText2 = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmCustomerApplicDText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmCustomerApplicDText3() {
        return outGrpApplicDetailsOutGrmCustomerApplicDText3;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmCustomerApplicDText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmCustomerApplicDText3(String value) {
        this.outGrpApplicDetailsOutGrmCustomerApplicDText3 = value;
    }

    /**
     * Gets the value of the outGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar() {
        return outGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar(String value) {
        this.outGrpApplicDetailsOutGrmSelectionIefSuppliedSelectChar = value;
    }

}
