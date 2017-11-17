
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TermDepositSpecialRatesMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermDepositSpecialRatesMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InApprovInterRateAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InApprovInterRateCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InApprovInterRateCrInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InApprovInterRateDbInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InApprovInterRateDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InApprovInterRateEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InApprovInterRateIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InApprovInterRateInterPayOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InApprovInterRateRateAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InApprovInterRateRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InApprovInterRateStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InApprovInterRateTimeDepTransFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InApprovInterRateTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDealerUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsDelDepMntRecordingIComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRequestInsDelUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermDepositSpecialRatesMaintenanceImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "command",
    "inParametersInTerminalTerminalNumber",
    "inApprovInterRateAccountNumber",
    "inApprovInterRateCDigit",
    "inApprovInterRateCrInterestRate",
    "inApprovInterRateDbInterestRate",
    "inApprovInterRateDealerRefNo",
    "inApprovInterRateEndDate",
    "inApprovInterRateIdCurrency",
    "inApprovInterRateInterPayOptions",
    "inApprovInterRateRateAmount",
    "inApprovInterRateRenewalFlag",
    "inApprovInterRateStartDate",
    "inApprovInterRateTimeDepTransFlg",
    "inApprovInterRateTimestmp",
    "inAuthorGrantedIefSuppliedFlag",
    "inDealerUsrCode",
    "inInsDelDepMntRecordingIComments",
    "inPrftTransactionIdTransact",
    "inRequestInsDelUsrCode"
})
public class TermDepositSpecialRatesMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InApprovInterRateAccountNumber")
    protected double inApprovInterRateAccountNumber;
    @XmlElement(name = "InApprovInterRateCDigit")
    protected short inApprovInterRateCDigit;
    @XmlElement(name = "InApprovInterRateCrInterestRate", required = true)
    protected BigDecimal inApprovInterRateCrInterestRate;
    @XmlElement(name = "InApprovInterRateDbInterestRate", required = true)
    protected BigDecimal inApprovInterRateDbInterestRate;
    @XmlElement(name = "InApprovInterRateDealerRefNo")
    protected String inApprovInterRateDealerRefNo;
    @XmlElement(name = "InApprovInterRateEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inApprovInterRateEndDate;
    @XmlElement(name = "InApprovInterRateIdCurrency")
    protected int inApprovInterRateIdCurrency;
    @XmlElement(name = "InApprovInterRateInterPayOptions")
    protected String inApprovInterRateInterPayOptions;
    @XmlElement(name = "InApprovInterRateRateAmount", required = true)
    protected BigDecimal inApprovInterRateRateAmount;
    @XmlElement(name = "InApprovInterRateRenewalFlag")
    protected String inApprovInterRateRenewalFlag;
    @XmlElement(name = "InApprovInterRateStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inApprovInterRateStartDate;
    @XmlElement(name = "InApprovInterRateTimeDepTransFlg")
    protected String inApprovInterRateTimeDepTransFlg;
    @XmlElement(name = "InApprovInterRateTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inApprovInterRateTimestmp;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InDealerUsrCode")
    protected String inDealerUsrCode;
    @XmlElement(name = "InInsDelDepMntRecordingIComments")
    protected String inInsDelDepMntRecordingIComments;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InRequestInsDelUsrCode")
    protected String inRequestInsDelUsrCode;

    /**
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

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
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inApprovInterRateAccountNumber property.
     * 
     */
    public double getInApprovInterRateAccountNumber() {
        return inApprovInterRateAccountNumber;
    }

    /**
     * Sets the value of the inApprovInterRateAccountNumber property.
     * 
     */
    public void setInApprovInterRateAccountNumber(double value) {
        this.inApprovInterRateAccountNumber = value;
    }

    /**
     * Gets the value of the inApprovInterRateCDigit property.
     * 
     */
    public short getInApprovInterRateCDigit() {
        return inApprovInterRateCDigit;
    }

    /**
     * Sets the value of the inApprovInterRateCDigit property.
     * 
     */
    public void setInApprovInterRateCDigit(short value) {
        this.inApprovInterRateCDigit = value;
    }

    /**
     * Gets the value of the inApprovInterRateCrInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInApprovInterRateCrInterestRate() {
        return inApprovInterRateCrInterestRate;
    }

    /**
     * Sets the value of the inApprovInterRateCrInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInApprovInterRateCrInterestRate(BigDecimal value) {
        this.inApprovInterRateCrInterestRate = value;
    }

    /**
     * Gets the value of the inApprovInterRateDbInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInApprovInterRateDbInterestRate() {
        return inApprovInterRateDbInterestRate;
    }

    /**
     * Sets the value of the inApprovInterRateDbInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInApprovInterRateDbInterestRate(BigDecimal value) {
        this.inApprovInterRateDbInterestRate = value;
    }

    /**
     * Gets the value of the inApprovInterRateDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApprovInterRateDealerRefNo() {
        return inApprovInterRateDealerRefNo;
    }

    /**
     * Sets the value of the inApprovInterRateDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApprovInterRateDealerRefNo(String value) {
        this.inApprovInterRateDealerRefNo = value;
    }

    /**
     * Gets the value of the inApprovInterRateEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInApprovInterRateEndDate() {
        return inApprovInterRateEndDate;
    }

    /**
     * Sets the value of the inApprovInterRateEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInApprovInterRateEndDate(XMLGregorianCalendar value) {
        this.inApprovInterRateEndDate = value;
    }

    /**
     * Gets the value of the inApprovInterRateIdCurrency property.
     * 
     */
    public int getInApprovInterRateIdCurrency() {
        return inApprovInterRateIdCurrency;
    }

    /**
     * Sets the value of the inApprovInterRateIdCurrency property.
     * 
     */
    public void setInApprovInterRateIdCurrency(int value) {
        this.inApprovInterRateIdCurrency = value;
    }

    /**
     * Gets the value of the inApprovInterRateInterPayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApprovInterRateInterPayOptions() {
        return inApprovInterRateInterPayOptions;
    }

    /**
     * Sets the value of the inApprovInterRateInterPayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApprovInterRateInterPayOptions(String value) {
        this.inApprovInterRateInterPayOptions = value;
    }

    /**
     * Gets the value of the inApprovInterRateRateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInApprovInterRateRateAmount() {
        return inApprovInterRateRateAmount;
    }

    /**
     * Sets the value of the inApprovInterRateRateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInApprovInterRateRateAmount(BigDecimal value) {
        this.inApprovInterRateRateAmount = value;
    }

    /**
     * Gets the value of the inApprovInterRateRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApprovInterRateRenewalFlag() {
        return inApprovInterRateRenewalFlag;
    }

    /**
     * Sets the value of the inApprovInterRateRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApprovInterRateRenewalFlag(String value) {
        this.inApprovInterRateRenewalFlag = value;
    }

    /**
     * Gets the value of the inApprovInterRateStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInApprovInterRateStartDate() {
        return inApprovInterRateStartDate;
    }

    /**
     * Sets the value of the inApprovInterRateStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInApprovInterRateStartDate(XMLGregorianCalendar value) {
        this.inApprovInterRateStartDate = value;
    }

    /**
     * Gets the value of the inApprovInterRateTimeDepTransFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApprovInterRateTimeDepTransFlg() {
        return inApprovInterRateTimeDepTransFlg;
    }

    /**
     * Sets the value of the inApprovInterRateTimeDepTransFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApprovInterRateTimeDepTransFlg(String value) {
        this.inApprovInterRateTimeDepTransFlg = value;
    }

    /**
     * Gets the value of the inApprovInterRateTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInApprovInterRateTimestmp() {
        return inApprovInterRateTimestmp;
    }

    /**
     * Sets the value of the inApprovInterRateTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInApprovInterRateTimestmp(XMLGregorianCalendar value) {
        this.inApprovInterRateTimestmp = value;
    }

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inDealerUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDealerUsrCode() {
        return inDealerUsrCode;
    }

    /**
     * Sets the value of the inDealerUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDealerUsrCode(String value) {
        this.inDealerUsrCode = value;
    }

    /**
     * Gets the value of the inInsDelDepMntRecordingIComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsDelDepMntRecordingIComments() {
        return inInsDelDepMntRecordingIComments;
    }

    /**
     * Sets the value of the inInsDelDepMntRecordingIComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsDelDepMntRecordingIComments(String value) {
        this.inInsDelDepMntRecordingIComments = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inRequestInsDelUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRequestInsDelUsrCode() {
        return inRequestInsDelUsrCode;
    }

    /**
     * Sets the value of the inRequestInsDelUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRequestInsDelUsrCode(String value) {
        this.inRequestInsDelUsrCode = value;
    }

}
